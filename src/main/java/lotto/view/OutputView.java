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

    private static final String PROFIT_RATE_MESSAGE_FORM = "총 수익률은 %.1f%%입니다.\n";

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
        for (Entry<Result, Integer> entry : results.entrySet()) {
            if (entry.getKey().equals(Result.FAIL)) {
                continue;
            }
            if (entry.getKey().equals(Result.SECOND)) {
                printSecondRankWinningResult(entry.getKey(), entry.getValue());
            }
            printWinningResult(entry.getKey(), entry.getValue());
        }
    }

    public void printProfitRate(double profitRate) {
        System.out.printf(PROFIT_RATE_MESSAGE_FORM, profitRate);
    }

    public void printExceptionMessage(Exception e) {
        System.out.println(e.getMessage());
    }

    private void printSecondRankWinningResult(Result result, int count) {
        System.out.printf(SECOND_RANK_WINNING_RESULT_MESSAGE_FORM, result.winningNumber, result.reward, count);
    }

    private void printWinningResult(Result result, int count) {
        System.out.printf(WINNING_RESULT_MESSAGE_FORM, result.winningNumber, result.reward, count);
    }
}
