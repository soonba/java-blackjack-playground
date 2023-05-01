package nextstep.blackjack.state.running;

import nextstep.blackjack.domain.card.Card;
import nextstep.blackjack.domain.card.Cards;
import nextstep.blackjack.state.State;

public class Hit extends Running {

    public Hit(Cards cards) {
        super(cards);
    }

    @Override
    public State draw(Card card) {
        return null;
    }

    @Override
    public State stay() {
        return null;
    }
}
