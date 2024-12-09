package lotto.model;

import static lotto.ExceptionMessage.BONUS_NUMBER_RANGE_EXCEPTION;

public class BonusNumber {

    private final int bonusNumber;

    public BonusNumber(int bonusNumber, WinningNumbers winningNumbers) {
        validateRange(bonusNumber);
        this.bonusNumber = bonusNumber;
    }

    private void validateRange(int number) {
        if (number < 1 || number > 45) {
            throw new IllegalArgumentException(BONUS_NUMBER_RANGE_EXCEPTION.message);
        }
    }
}
