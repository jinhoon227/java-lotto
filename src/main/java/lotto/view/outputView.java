package lotto.view;

import lotto.domain.Lotteries;
import lotto.domain.LottoResult;
import lotto.domain.Money;

import java.text.DecimalFormat;

public class outputView {
    private static final DecimalFormat decimalFormat = new DecimalFormat("#.##");
    public static void printBuyLotto(Money money) {
        System.out.printf("\n%d개를 구매했습니다.\n", money.getLottoAmount());
    }

    public static void printLotteries(Lotteries lotteries) {
        System.out.println(lotteries.toString());
    }

    public static void printLottoResult(LottoResult lottoResult, float profit) {
        System.out.println("\n당첨 통계");
        System.out.print("---");
        System.out.println(lottoResult.toString());
        printProfit(profit);
    }

    private static void printProfit(float profit){
        System.out.printf("총 수익률은 %s%%입니다.", decimalFormat.format(profit));
    }
}
