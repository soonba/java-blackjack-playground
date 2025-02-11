package nextstep.blackjack.state.finished;

import nextstep.blackjack.domain.Money;
import nextstep.blackjack.domain.card.Card;
import nextstep.blackjack.domain.card.Cards;
import nextstep.blackjack.state.Started;
import nextstep.blackjack.state.State;

public abstract class Finished extends Started {
    public Finished(Cards cards) {
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

    @Override
    public boolean isFinished() {
        return true;
    }

    @Override
    public Money profit(Money bet) {
        return new Money(earningRate() * bet.getValue());
    }

    public abstract double earningRate();
}
