package lotto.model;

import static lotto.ExceptionMessage.LOTTO_NUMBERS_RANGE_EXCEPTION;
import static lotto.ExceptionMessage.LOTTO_NUMBERS_SIZE_EXCEPTION;

import java.util.List;

public class Lotto {
    private final List<Integer> numbers;

    public Lotto(List<Integer> numbers) {
        validateSize(numbers);
        validateRange(numbers);
        this.numbers = numbers;
    }

    private void validateSize(List<Integer> numbers) {
        if (numbers.size() != 6) {
            throw new IllegalArgumentException(LOTTO_NUMBERS_SIZE_EXCEPTION.message);
        }
    }

    private void validateRange(List<Integer> numbers) {
        for(int number : numbers) {
            if(number < 1 || number > 45) {
                throw new IllegalArgumentException(LOTTO_NUMBERS_RANGE_EXCEPTION.message);
            }
         }
    }
}
