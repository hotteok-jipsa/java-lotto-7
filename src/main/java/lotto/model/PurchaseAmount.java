package lotto.model;

import static lotto.ExceptionMessage.PURCHASE_AMOUNT_INVALID_EXCEPTION;

public class PurchaseAmount {

    private static final int PURCHASE_AMOUNT_UNIT = 1_000;

    private final long purchaseAmount;

    public PurchaseAmount(long purchaseAmount) {
        validatePurchaseAmount(purchaseAmount);
        this.purchaseAmount = purchaseAmount;
    }

    public long getPurchaseAmount() {
        return purchaseAmount;
    }

    public int getPurchaseCount() {
        return (int) (purchaseAmount / PURCHASE_AMOUNT_UNIT);
    }

    private void validatePurchaseAmount(long purchaseAmount) {
        if(purchaseAmount % PURCHASE_AMOUNT_UNIT != 0) {
            throw new IllegalArgumentException(PURCHASE_AMOUNT_INVALID_EXCEPTION.message);
        }
    }

}
