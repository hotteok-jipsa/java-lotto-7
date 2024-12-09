package lotto.controller;

import java.util.List;
import lotto.model.BonusNumber;
import lotto.model.Profit;
import lotto.model.PurchaseAmount;
import lotto.model.PurchasedLottos;
import lotto.model.Results;
import lotto.model.WinningNumbers;
import lotto.validator.InputValidator;
import lotto.view.InputView;
import lotto.view.OutputView;

public class Controller {
    private final InputView inputView;
    private final OutputView outputView;
    private final InputValidator inputValidator;

    public Controller(InputView inputView, OutputView outputView, InputValidator inputValidator) {
        this.inputView = inputView;
        this.outputView = outputView;
        this.inputValidator = inputValidator;
    }

    public void start() {
        PurchaseAmount purchaseAmount = getPurchaseAmount();
        PurchasedLottos purchasedLottos = getPurchasedLottos(purchaseAmount.getPurchaseCount());
        printPurchasedLottos(purchaseAmount, purchasedLottos);
        WinningNumbers winningNumbers = getWinningNumbers();
        BonusNumber bonusNumber = getBonusNumber(winningNumbers);
        Results results = new Results(winningNumbers, bonusNumber);
        results.calculateResults(purchasedLottos);
        printWinningResult(results);
        printProfitResult(new Profit(results), purchaseAmount);
    }

    private PurchaseAmount getPurchaseAmount() {
        inputView.printPurchaseAmountInputGuideMessage();
        while (true) {
            try {
                String rawPurchaseAmount = inputView.getPurchaseAmount();
                long purchaseAmount = inputValidator.validatePurchaseAmountIsNumber(rawPurchaseAmount);
                return new PurchaseAmount(purchaseAmount);
            } catch (IllegalArgumentException e) {
                outputView.printExceptionMessage(e);
            }
        }
    }

    private PurchasedLottos getPurchasedLottos(int purchaseCount) {
        try {
            return new PurchasedLottos(purchaseCount);
        } catch (IllegalArgumentException e) {
            outputView.printExceptionMessage(e);
            getPurchasedLottos(purchaseCount);
        }
        return null;
    }

    private void printPurchasedLottos(PurchaseAmount purchaseAmount, PurchasedLottos purchasedLottos) {
        outputView.printPurchaseLottoMessage(purchaseAmount.getPurchaseCount());
        outputView.printPurchaseLottos(purchasedLottos.getLottoDtos());
    }

    private WinningNumbers getWinningNumbers() {
        inputView.printWinningNumbersInputGuideMessage();
        while (true) {
            try {
                String rawWinningNumbers = inputView.getWinningNumbers();
                List<Integer> winningNumbers = inputValidator.validateRawWinningNumbers(rawWinningNumbers);
                return new WinningNumbers(winningNumbers);
            } catch (IllegalArgumentException e) {
                outputView.printExceptionMessage(e);
            }
        }
    }

    private BonusNumber getBonusNumber(WinningNumbers winningNumbers) {
        inputView.printBonusNumbersInputGuideMessage();
        while (true) {
            try {
                String rawBonusNumber = inputView.getBonusNumbers();
                int bonusNumber = inputValidator.validateBonusNumber(rawBonusNumber);
                return new BonusNumber(bonusNumber, winningNumbers);
            } catch (IllegalArgumentException e) {
                outputView.printExceptionMessage(e);
            }
        }
    }

    private void printWinningResult(Results results) {
        outputView.printWinningResultMessaage();
        outputView.printWinningResults(results.getResults());
    }

    private void printProfitResult(Profit profit, PurchaseAmount purchaseAmount) {
        outputView.printProfitRate(profit.getProfitRate(purchaseAmount));
    }
}
