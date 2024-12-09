package lotto.validator;

import static lotto.ExceptionMessage.PURCHASE_AMOUNT_NOT_NUMBER_EXCEPTION;
import static lotto.ExceptionMessage.WINNING_NUMBERS_NOT_NUMBER_EXCEPTION;

import java.util.ArrayList;
import java.util.List;

public class InputValidator {

    private static final String COMMA = ",";

    public long validatePurchaseAmountIsNumber(String purchaseAmount) {
        if (!purchaseAmount.matches("^[0-9]*$")) {
            throw new IllegalArgumentException(PURCHASE_AMOUNT_NOT_NUMBER_EXCEPTION.message);
        }
        return Long.parseLong(purchaseAmount);
    }

    public List<Integer> validateRawWinningNumbers(String winningNumbers) {
        String[] splitedWinningNumbers = winningNumbers.split(COMMA);
        List<Integer> winningNumbersList = new ArrayList<>();
        for (String rawWinningNumber : splitedWinningNumbers) {
            validateWinningNumberIsNumber(rawWinningNumber);
            winningNumbersList.add(Integer.parseInt(rawWinningNumber));
        }
        return winningNumbersList;
    }

    private void validateWinningNumberIsNumber(String winningNumber) {
        if (!winningNumber.matches("^[0-9]*$")) {
            throw new IllegalArgumentException(WINNING_NUMBERS_NOT_NUMBER_EXCEPTION.message);
        }
    }
}
