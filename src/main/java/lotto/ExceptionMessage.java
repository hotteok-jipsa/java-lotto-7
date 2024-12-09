package lotto;

public enum ExceptionMessage {
    PURCHASE_AMOUNT_NOT_NUMBER_EXCEPTION("구입금액은 숫자타입이어야 합니다."),
    PURCHASE_AMOUNT_INVALID_EXCEPTION("구입금액은 1,000원으로 나누어 떨어져야 합니다.");


    private final String prefix = "[ERROR] ";
    public final String message;


    ExceptionMessage(String message) {
        this.message = prefix + message;
    }
}
