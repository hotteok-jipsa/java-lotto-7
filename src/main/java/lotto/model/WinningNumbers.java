package lotto.model;

import static lotto.ExceptionMessage.WINNING_NUMBERS_DUPLICATE_EXCEPTION;
import static lotto.ExceptionMessage.WINNING_NUMBERS_RANGE_EXCEPTION;
import static lotto.ExceptionMessage.WINNING_NUMBERS_SIZE_EXCEPTION;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WinningNumbers {
    private final List<Integer> numbers;

    public WinningNumbers(List<Integer> numbers) {
        validateSize(numbers);
        validateRange(numbers);
        validateDuplicate(numbers);
        this.numbers = numbers;
    }

    public List<Integer> getWinningNumbers() {
        return Collections.unmodifiableList(numbers);
    }

    private void validateSize(List<Integer> numbers) {
        if (numbers.size() != 6) {
            throw new IllegalArgumentException(WINNING_NUMBERS_SIZE_EXCEPTION.message);
        }
    }

    private void validateRange(List<Integer> numbers) {
        for (int number : numbers) {
            if (number < 1 || number > 45) {
                throw new IllegalArgumentException(WINNING_NUMBERS_RANGE_EXCEPTION.message);
            }
        }
    }

    private void validateDuplicate(List<Integer> numbers) {
        Set<Integer> set = new HashSet<>(numbers);
        if (set.size() != 6) {
            throw new IllegalArgumentException(WINNING_NUMBERS_DUPLICATE_EXCEPTION.message);
        }
    }
}
