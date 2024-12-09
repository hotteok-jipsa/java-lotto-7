package lotto.model;

import java.util.Map;
import java.util.Map.Entry;

public class Profit {

    private final long profit;

    public Profit(Results results) {
        profit = getProfit(results.getResults());
    }

    public double getProfitRate(PurchaseAmount purchaseAmount) {
        return (double)profit / purchaseAmount.getPurchaseAmount();
    }

    private long getProfit(Map<Result, Integer> results) {
        long tempProfit = 0;
        for(Entry<Result, Integer> entry : results.entrySet()) {
            tempProfit += entry.getKey().reward * entry.getValue();
        }
        return tempProfit;
    }
}
