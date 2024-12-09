package lotto;

import lotto.controller.Controller;
import lotto.validator.InputValidator;
import lotto.view.InputView;
import lotto.view.OutputView;

public class LottoApplication {
    public static void run() {
        InputView inputView = new InputView();
        OutputView outputView = new OutputView();
        InputValidator inputValidator = new InputValidator();

        new Controller(inputView, outputView, inputValidator).start();
    }
}
