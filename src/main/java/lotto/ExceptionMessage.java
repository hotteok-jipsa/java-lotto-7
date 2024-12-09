package lotto;

public enum ExceptionMessage {
    PURCHASE_AMOUNT_NOT_NUMBER_EXCEPTION("구입금액은 숫자타입이어야 합니다.");


    private final String prefix = "[ERROR] ";
    public final String message;


    ExceptionMessage(String message) {
        this.message = prefix + message;
    }
}
