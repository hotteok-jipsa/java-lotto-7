package lotto.model;

import static lotto.ExceptionMessage.BONUS_NUMBER_DUPLICATE_EXCEPTION;
import static lotto.ExceptionMessage.BONUS_NUMBER_RANGE_EXCEPTION;

import java.util.HashSet;
import java.util.Set;

public class BonusNumber {

    private final int bonusNumber;

    public BonusNumber(int bonusNumber, WinningNumbers winningNumbers) {
        validateRange(bonusNumber);
        validateDuplicate(bonusNumber, winningNumbers);
        this.bonusNumber = bonusNumber;
    }

    public int getBonusNumber() {
        return bonusNumber;
    }

    private void validateRange(int number) {
        if (number < 1 || number > 45) {
            throw new IllegalArgumentException(BONUS_NUMBER_RANGE_EXCEPTION.message);
        }
    }

    private void validateDuplicate(int number, WinningNumbers winningNumbers) {
        Set<Integer> set = new HashSet<>(winningNumbers.getWinningNumbers());
        set.add(number);
        if(set.size() == 6) {
            throw new IllegalArgumentException(BONUS_NUMBER_DUPLICATE_EXCEPTION.message);
        }
    }
}
