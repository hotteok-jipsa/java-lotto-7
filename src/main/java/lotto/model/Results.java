package lotto.model;

import java.util.EnumMap;
import java.util.List;
import lotto.dto.LottoDto;

public class Results {
    private final EnumMap<Result, Integer> results = new EnumMap<>(Result.class);

    private final List<Integer> winningNumbers;
    private final int bonusNumber;

    public Results(final WinningNumbers winningNumbers, final BonusNumber bonusNumber) {
        this.winningNumbers = winningNumbers.getWinningNumbers();
        this.bonusNumber = bonusNumber.getBonusNumber();
        for(Result result : Result.values()) {
            results.put(result, 0);
        }
    }

    public void calculateResults(PurchasedLottos purchasedLottos) {
        for (LottoDto lottoDto : purchasedLottos.getLottoDtos()) {
            getResult(lottoDto.Lotto());
        }
    }

    public EnumMap<Result, Integer> getResults() {
        return results;
    }

    private void getResult(List<Integer> lottoNumbers) {
        Result result = Result.from(
                getWinningNumberDuplicate(lottoNumbers),
                getBonusNumberFlag(lottoNumbers)
        );
        results.put(result, results.get(result) + 1);
    }

    private int getWinningNumberDuplicate(List<Integer> lottoNumbers) {
        int winningNumberDuplicate = 0;
        for (int number : lottoNumbers) {
            if (winningNumbers.contains(number)) {
                winningNumberDuplicate++;
            }
        }
        return winningNumberDuplicate;
    }

    private boolean getBonusNumberFlag(List<Integer> lottoNumbers) {
        for (int number : lottoNumbers) {
            if (bonusNumber == number) {
                return true;
            }
        }
        return false;
    }
}
