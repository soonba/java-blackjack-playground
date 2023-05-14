package nextstep.blackjack.domain.gamer;

import nextstep.blackjack.constants.Deck;
import nextstep.blackjack.constants.PrintCardsType;
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

    public void stay() {
        state = state.stay();
    }

    public String printCards(PrintCardsType printCardsType) {
        return getName() +
                PRINT_JOIN_MESSAGE +
                state.cards().printCards(printCardsType);
    }

    public abstract String getName();

    public boolean scoreComparable() {
        return !(state.cards().isBust() || state.cards().isBlackjack());
    }

    public int getScore() {
        return state.cards().getScore();
    }

}
