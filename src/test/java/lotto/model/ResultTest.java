package lotto.model;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ResultTest {

    @Test
    void 당첨번호가_6개_겹치면_1등이다() {
        assertThat(Result.from(6, false))
                .isEqualTo(Result.FIRST);
    }

    @Test
    void 당첨번호가_5개와_보너스_번호가_겹치면_2등이다() {
        assertThat(Result.from(5, true))
                .isEqualTo(Result.SECOND);
    }

    @Test
    void 당첨번호가_5개와_보너스_번호가_안겹치면_3등이다() {
        assertThat(Result.from(5, false))
                .isEqualTo(Result.THIRD);
    }

    @Test
    void 당첨번호가_4개_겹치면_4등이다() {
        assertThat(Result.from(4, false))
                .isEqualTo(Result.FOURTH);
    }

    @Test
    void 당첨번호가_3개_겹치면_5등이다() {
        assertThat(Result.from(3, false))
                .isEqualTo(Result.FIFTH);
    }

    @ParameterizedTest
    @ValueSource(strings = {"0", "1", "2"})
    void 당첨번호가_3개_미만으로_겹치면_낙첨이다(int duplicate) {
        assertThat(Result.from(duplicate, false))
                .isEqualTo(Result.FAIL);
    }
}
