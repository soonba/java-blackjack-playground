package nextstep.blackjack.domain;

import nextstep.blackjack.domain.gamer.Dealer;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Profits {

    private final Map<String,Money> profitMap = new LinkedHashMap<>();

    public Profits() {
        profitMap.put(Dealer.DEALER_NAME,Money.init());
    }

    void playerUpdateProfit(String name, Money amount) {
        Money orDefault = profitMap.getOrDefault(name, Money.init());
        profitMap.put(name, orDefault.add(amount));
    }

    void dealerUpdateProfit(Money amount) {
        Money money = profitMap.get(Dealer.DEALER_NAME);
        profitMap.put(Dealer.DEALER_NAME, money.add(amount));
    }

    public List<String> printProfits() {
        return profitMap.entrySet()
                .stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue().getValue())
                .collect(Collectors.toList());
    }
}
