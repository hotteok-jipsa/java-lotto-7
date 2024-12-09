package lotto.model;

import static lotto.ExceptionMessage.BONUS_NUMBER_RANGE_EXCEPTION;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.Test;

public class BonusNumberTest {
    @Test
    void 보너스_번호의_숫자_범위가_45_이하가_아니라면_예외를_발생시킨다() {
        assertThatThrownBy(() -> new BonusNumber(46, null))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining(BONUS_NUMBER_RANGE_EXCEPTION.message);
    }

    @Test
    void 보너스_번호의_숫자_범위가_1_이상이_아니라면_예외를_발생시킨다() {
        assertThatThrownBy(() -> new BonusNumber(0, null))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining(BONUS_NUMBER_RANGE_EXCEPTION.message);
    }
}
