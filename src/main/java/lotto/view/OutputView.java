package lotto.view;

import java.util.Collections;
import java.util.EnumMap;
import java.util.List;
import java.util.Map.Entry;
import lotto.dto.LottoDto;
import lotto.model.Result;

public class OutputView {
    private static final String PURCHASE_LOTTO_MESSAGE_FORM = "\n%d개를 구매했습니다.\n";
    private static final String WINNING_RESULT_MESSAGE = "\n당첨 통계\n---";

    private static final String WINNING_RESULT_MESSAGE_FORM = "%d개 일치 (%,d원) - %d개\n";
    private static final String SECOND_RANK_WINNING_RESULT_MESSAGE_FORM = "%d개 일치, 보너스 볼 일치 (%,d원) - %d개\n";

    public void printPurchaseLottoMessage(int purchaseCount) {
        System.out.printf(PURCHASE_LOTTO_MESSAGE_FORM, purchaseCount);
    }

    public void printPurchaseLottos(List<LottoDto> purchaseLottos) {
        for (LottoDto lottoDto : purchaseLottos) {
            List<Integer> purchaseLotto = lottoDto.Lotto();
            Collections.sort(purchaseLotto);
            System.out.println(purchaseLotto);
        }
    }

    public void printWinningResultMessaage() {
        System.out.println(WINNING_RESULT_MESSAGE);
    }

    public void printWinningResults(EnumMap<Result, Integer> results) {
        for (Entry<Result, Integer> result : results.entrySet()) {
            if (result.getKey().equals(Result.FAIL)) {
                continue;
            }
            if (result.getKey().equals(Result.SECOND)) {
                printSecondRankWinningResult(result.getKey(), result.getValue());
            }
            printWinningResult(result.getKey(), result.getValue());
        }
    }

    private void printSecondRankWinningResult(Result result, int count) {
        System.out.printf(SECOND_RANK_WINNING_RESULT_MESSAGE_FORM, result.winningNumber, result.reward, count);
    }

    private void printWinningResult(Result result, int count) {
        System.out.printf(WINNING_RESULT_MESSAGE_FORM, result.winningNumber, result.reward, count);
    }
}
