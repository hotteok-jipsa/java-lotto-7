package lotto.validator;

import static lotto.ExceptionMessage.PURCHASE_AMOUNT_NOT_NUMBER_EXCEPTION;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

import org.junit.jupiter.api.Test;

public class InputValidatorTest {

    InputValidator inputValidator = new InputValidator();

    @Test
    void 구입금액이_숫자타입이_아니라면_예외를_발생시킨다() {
        assertThatThrownBy(() -> inputValidator.validatePurchaseAmountIsNumber("5000원"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining(PURCHASE_AMOUNT_NOT_NUMBER_EXCEPTION.message);
    }
}
