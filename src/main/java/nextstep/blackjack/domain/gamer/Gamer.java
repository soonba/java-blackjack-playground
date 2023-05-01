package nextstep.blackjack.domain.gamer;

import nextstep.blackjack.constants.Deck;
import nextstep.blackjack.domain.card.Cards;
import nextstep.blackjack.state.State;
import nextstep.blackjack.state.running.Hit;

public abstract class Gamer {
    public static final String PRINT_JOIN_MESSAGE = "카드: ";
    protected State state;

    public Gamer() {
        this.state = new Hit(new Cards());
    }

    public boolean isFinished() {
        return state.isFinished();
    }

    public void addCard() {
        //카드를 추가하며 상태를 업데이트한다.
        state = state.draw(Deck.draw());
    }

    public String printCards() {
        return getName() +
                PRINT_JOIN_MESSAGE +
                state.cards().printCards();
    }

    public abstract String getName();

}
