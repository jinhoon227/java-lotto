package lotto.domain;

import java.util.List;

import static java.util.stream.Collectors.joining;

public class Lotteries {
    private final List<Lotto> lotteries;
    private final LottoResult lottoResult = new LottoResult();

    public Lotteries(List<Lotto> lotteries) {
        this.lotteries = lotteries;
    }

    public LottoResult checkLottoResult(WinningNumber winningNumber){
        for(Lotto lotto : lotteries){
            lottoResult.addRank(
                    Rank.findRank(lotto.countMatchingNumber(winningNumber.getWinningLotto()),
                    lotto.containNumber(winningNumber.getBonusNumber())));
        }
        return  lottoResult;
    }

    @Override
    public String toString() {
        return lotteries.stream()
                .map(Lotto::toString)
                .collect(joining("\n"));
    }
}
