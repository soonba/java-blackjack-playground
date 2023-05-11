package nextstep.blackjack.domain;

import java.util.HashMap;
import java.util.Map;

public class Profits {

    Map<String,Integer> profitMap = new HashMap<>();

    void addProfit(String name, Integer amount) {
        Integer orDefault = profitMap.getOrDefault(name, 0);
        profitMap.put(name, orDefault + amount);
    }
}
