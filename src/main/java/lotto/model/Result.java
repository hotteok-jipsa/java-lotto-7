package lotto.model;

public enum Result {
    FAIL(0, false, 0),
    FIFTH(3, false, 5_000),
    FOURTH(4, false, 50_000),
    THIRD(5, false, 1_500_000),
    SECOND(5, true, 30_000_000),
    FIRST(6, false, 2_000_000_000);


    public int winningNumber;
    public int reward;

    boolean bonusNumber;

    Result(int winningNumber, boolean bonusNumber, int reward) {
        this.winningNumber = winningNumber;
        this.bonusNumber = bonusNumber;
        this.reward = reward;
    }

    public static Result from(int winningNumber, boolean bonusNumber) {
        if(winningNumber == 5 && !bonusNumber) {
            return THIRD;
        }
        for(Result result : Result.values()) {
            if(result.winningNumber == winningNumber) {
                return result;
            }
        }
        return FAIL;
    }
}
