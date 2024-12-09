package lotto.model;

import static lotto.ExceptionMessage.WINNING_NUMBERS_DUPLICATE_EXCEPTION;
import static lotto.ExceptionMessage.WINNING_NUMBERS_RANGE_EXCEPTION;
import static lotto.ExceptionMessage.WINNING_NUMBERS_SIZE_EXCEPTION;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.util.List;
import org.junit.jupiter.api.Test;

public class WinningNumbersTest {
    @Test
    void 당첨_번호의_숫자_범위가_45_이하가_아니라면_예외를_발생시킨다() {
        assertThatThrownBy(() -> new WinningNumbers(List.of(1, 2, 3, 4, 5, 46)))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining(WINNING_NUMBERS_RANGE_EXCEPTION.message);
    }

    @Test
    void 당첨_번호의_숫자_범위가_1_이상이_아니라면_예외를_발생시킨다() {
        assertThatThrownBy(() -> new WinningNumbers(List.of(0, 2, 3, 4, 5, 6)))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining(WINNING_NUMBERS_RANGE_EXCEPTION.message);
    }

    @Test
    void 당첨_번호가_6개가_아니라면_예외를_발생시킨다() {
        assertThatThrownBy(() -> new WinningNumbers(List.of(1, 2, 3, 4, 5, 6, 7)))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining(WINNING_NUMBERS_SIZE_EXCEPTION.message);
    }

    @Test
    void 당첨_번호에_중복이_존재한다면_예외를_발생시킨다() {
        assertThatThrownBy(() -> new WinningNumbers(List.of(1, 2, 3, 4, 6, 6)))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining(WINNING_NUMBERS_DUPLICATE_EXCEPTION.message);
    }
}
