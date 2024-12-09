package lotto.view;

import camp.nextstep.edu.missionutils.Console;

public class InputView {
    private static final String PURCHASE_AMOUNT_INPUT_GUIDE_MESSAGE = "구입금액을 입력해 주세요.";

    public void printPurchaseAmountInputGuideMessage() {
        System.out.println(PURCHASE_AMOUNT_INPUT_GUIDE_MESSAGE);
    }

    public String getPurchaseAmount() {
        return Console.readLine();
    }
}
