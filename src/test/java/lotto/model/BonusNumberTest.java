package lotto.model;

import static lotto.ExceptionMessage.BONUS_NUMBER_DUPLICATE_EXCEPTION;
import static lotto.ExceptionMessage.BONUS_NUMBER_RANGE_EXCEPTION;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.util.List;
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

    @Test
    void 보너스_번호가_당첨_번호_6개와_중복이_존재한다면_예외를_발생시킨다() {
        WinningNumbers winningNumbers = new WinningNumbers(List.of(1, 2, 3, 4, 5, 6));
        assertThatThrownBy(() -> new BonusNumber(1, winningNumbers))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining(BONUS_NUMBER_DUPLICATE_EXCEPTION.message);
    }
}
