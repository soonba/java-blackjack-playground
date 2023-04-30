package nextstep.blackjack.domain;

import nextstep.blackjack.constants.Denomination;
import nextstep.blackjack.constants.Suit;

public class Card {
    private final Suit suit;

    private final Denomination denomination;

    public Card(Suit suit, Denomination denomination) {
        this.suit = suit;
        this.denomination = denomination;
    }

    public int getScore() {
        return denomination.getScore();
    }

    public String getString() {
        String denominationName = denomination.getName();
        String suitName = suit.getName();
        return denominationName + suitName;
    }

    public boolean isAce() {
        return denomination.isAce();
    }
}
