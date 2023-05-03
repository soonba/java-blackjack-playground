package nextstep.blackjack.domain.card;

import nextstep.blackjack.constants.PrintCardsType;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Cards {
    private final List<Card> cards = new ArrayList<>();
    public static final int BLACKJACK_BOUND = 21;

    public int getScore() {
        return cards.stream().mapToInt(Card::getScore).sum();
    }

    public void add(Card card) {
        cards.add(card);
    }

    public String printCards(PrintCardsType printCardsType) {
        List<String> collect = cards.stream().map(Card::getString).collect(Collectors.toList());
        String join = String.join(",", collect);
        return printCardsType.addString(join, this.getScore());
    }

    public boolean isBust() {
        return cards.stream()
                .mapToInt(Card::getScore)
                .sum() > BLACKJACK_BOUND;
    }

    public boolean isBlackjack() {
        return cards.stream()
                .mapToInt(Card::getScore)
                .sum() == BLACKJACK_BOUND;
    }
}
