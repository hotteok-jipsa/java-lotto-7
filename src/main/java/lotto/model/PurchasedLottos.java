package lotto.model;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.List;
import lotto.dto.LottoDto;

public class PurchasedLottos {

    private final List<Lotto> purchasedLottos = new ArrayList<>();

    public PurchasedLottos(int purchaseCount) {
        for(int amount = 0; amount < purchaseCount; amount ++) {
            Lotto newLotto = new Lotto(generateLotto());
            purchasedLottos.add(newLotto);
        }
    }

    public List<LottoDto> getLottoDtos() {
        List<LottoDto> lottoDtos = new ArrayList<>();
        for(Lotto lotto: purchasedLottos) {
            lottoDtos.add(lotto.getLottoDto());
        }
        return lottoDtos;
    }

    private List<Integer> generateLotto() {
        return Randoms.pickUniqueNumbersInRange(1, 45, 6);
    }
}
