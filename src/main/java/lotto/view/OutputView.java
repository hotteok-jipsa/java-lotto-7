package lotto.view;

import java.util.Collections;
import java.util.List;
import lotto.dto.LottoDto;

public class OutputView {
    private static final String PURCHASE_LOTTO_MESSAGE_FORM = "%d개를 구매했습니다.\n";

    public void printPurchaseLottoMessage(int purchaseCount) {
        System.out.printf(PURCHASE_LOTTO_MESSAGE_FORM, purchaseCount);
    }

    public void printPurchaseLottos(List<LottoDto> purchaseLottos) {
        for(LottoDto lottoDto : purchaseLottos) {
            List<Integer> purchaseLotto = lottoDto.Lotto();
            Collections.sort(purchaseLotto);
            System.out.println(purchaseLotto);
        }
    }
}