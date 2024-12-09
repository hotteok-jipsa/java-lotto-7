package lotto.model;

import static lotto.ExceptionMessage.PURCHASE_AMOUNT_INVALID_EXCEPTION;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.Test;

public class PurchaseAmountTest {
    
    @Test
    void 구입금액이_1000원으로_나누어_떨어지지_않는_경우_예외를_발생시킨다() {
        assertThatThrownBy(() -> new PurchaseAmount(5500L))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining(PURCHASE_AMOUNT_INVALID_EXCEPTION.message);
    }
}
