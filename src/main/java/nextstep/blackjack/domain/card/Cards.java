package nextstep.blackjack.domain.card;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Cards {
    List<Card> cards = new ArrayList<>();

    public int getScore() {
        return cards.stream().mapToInt(Card::getScore).sum();
    }

    public void add(Card card) {
        cards.add(card);
    }

    public String printCards() {
        List<String> collect = cards.stream().map(Card::getString).collect(Collectors.toList());
        return String.join(",",collect);
    }
}
