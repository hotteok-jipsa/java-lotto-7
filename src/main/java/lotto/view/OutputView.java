package lotto.view;

public class OutputView {
    private static final String PURCHASE_LOTTO_MESSAGE_FORM = "%d개를 구매했습니다.\n";

    public void printPurchaseLottoMessage(int purchaseCount) {
        System.out.printf(PURCHASE_LOTTO_MESSAGE_FORM, purchaseCount);
    }
}
