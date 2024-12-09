package lotto.model;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.List;

public class PurchasedLottos {

    private final List<Lotto> purchasedLottos = new ArrayList<>();

    public PurchasedLottos(int purchaseAmount) {
        for(int amount = 0; amount < purchaseAmount; amount ++) {
            Lotto newLotto = new Lotto(generateLotto());
            purchasedLottos.add(newLotto);
        }
    }

    private List<Integer> generateLotto() {
        return Randoms.pickUniqueNumbersInRange(1, 45, 6);
    }
}
