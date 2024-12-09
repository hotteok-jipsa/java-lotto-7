package lotto.validator;

import static lotto.ExceptionMessage.PURCHASE_AMOUNT_NOT_NUMBER_EXCEPTION;

public class InputValidator {

    public long validatePurchaseAmountIsNumber(String purchaseAmount) {
        if(!purchaseAmount.matches("^[0-9]*$")) {
            throw new IllegalArgumentException(PURCHASE_AMOUNT_NOT_NUMBER_EXCEPTION.message);
        }
        return Long.parseLong(purchaseAmount);
    }
}
