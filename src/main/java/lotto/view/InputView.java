package lotto.view;

import camp.nextstep.edu.missionutils.Console;

public class InputView {
    private static final String PURCHASE_AMOUNT_INPUT_GUIDE_MESSAGE = "구입금액을 입력해 주세요.";
    private static final String WINNING_NUMBERS_INPUT_GUIDE_MESSAGE = "\n당첨 번호를 입력해 주세요.";

    public void printPurchaseAmountInputGuideMessage() {
        System.out.println(PURCHASE_AMOUNT_INPUT_GUIDE_MESSAGE);
    }

    public String getPurchaseAmount() {
        return Console.readLine();
    }

    public void printWinningNumbersInputGuideMessage() {
        System.out.println(WINNING_NUMBERS_INPUT_GUIDE_MESSAGE);
    }

    public String getWinningNumbers() {
        return Console.readLine();
    }
}
