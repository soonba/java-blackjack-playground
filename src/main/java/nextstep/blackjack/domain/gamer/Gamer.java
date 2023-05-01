package nextstep.blackjack.domain.gamer;

import nextstep.blackjack.constants.Deck;
import nextstep.blackjack.domain.card.Cards;
import nextstep.blackjack.state.State;
import nextstep.blackjack.state.running.Hit;

public abstract class Gamer {
    protected State state;

    public Gamer() {
        this.state = new Hit(new Cards());
    }

    void isFinished() {
        state.isFinished();
    }

    public void addCard() {
        state.cards().add(Deck.draw());
    }

    public String printCards() {
        return state.cards().printCards();
    }

}
