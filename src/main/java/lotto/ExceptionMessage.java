package lotto;

public enum ExceptionMessage {
    PURCHASE_AMOUNT_NOT_NUMBER_EXCEPTION("구입금액은 숫자타입이어야 합니다."),
    PURCHASE_AMOUNT_INVALID_EXCEPTION("구입금액은 1,000원으로 나누어 떨어져야 합니다."),

    LOTTO_NUMBERS_SIZE_EXCEPTION("로또 번호는 6개여야 합니다."),
    LOTTO_NUMBERS_RANGE_EXCEPTION("로또 번호는 1~45 범위어야 합니다."),
    LOTTO_NUMBERS_DUPLICATE_EXCEPTION("로또 번호는 중복이 존재할 수 없습니다."),

    WINNING_NUMBERS_NOT_NUMBER_EXCEPTION("당첨번호는 숫자타입이어야 합니다."),
    WINNING_NUMBERS_SIZE_EXCEPTION("당첨 번호는 6개여야 합니다."),
    WINNING_NUMBERS_RANGE_EXCEPTION("당첨 번호는 1~45 범위어야 합니다."),
    WINNING_NUMBERS_DUPLICATE_EXCEPTION("당첨 번호는 중복이 존재할 수 없습니다."),

    BONUS_NUMBER_NOT_NUMBER_EXCEPTION("보너스 번호는 숫자타입이어야 합니다."),
    BONUS_NUMBER_RANGE_EXCEPTION("보너스 번호는 1~45 범위어야 합니다."),
    BONUS_NUMBER_DUPLICATE_EXCEPTION("보너스 번호는 당첨 번호와 중복일 수 없습니다.");


    private final String prefix = "[ERROR] ";
    public final String message;


    ExceptionMessage(String message) {
        this.message = prefix + message;
    }
}
