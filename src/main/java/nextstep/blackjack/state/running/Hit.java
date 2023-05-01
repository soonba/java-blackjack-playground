package nextstep.blackjack.state.running;

import nextstep.blackjack.domain.card.Card;
import nextstep.blackjack.domain.card.Cards;
import nextstep.blackjack.state.State;
import nextstep.blackjack.state.finished.Blackjack;
import nextstep.blackjack.state.finished.Bust;

public class Hit extends Running {

    public Hit(Cards cards) {
        super(cards);
    }

    @Override
    public State draw(Card card) {
        cards.add(card);
        if(cards.isBust()) {
            return new Bust(cards);
        }
        if(cards.isBlackjack()){
            return new Blackjack(cards);
        }
        return new Hit(cards);
    }

    @Override
    public State stay() {
        return null;
    }
}
