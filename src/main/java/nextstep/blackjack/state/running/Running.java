package nextstep.blackjack.state.running;

import nextstep.blackjack.domain.Money;
import nextstep.blackjack.domain.card.Cards;
import nextstep.blackjack.state.Started;

public abstract class Running extends Started {
    public Running(Cards cards) {
        super(cards);
    }
    @Override
    public boolean isFinished() {
        return false;
    }

    @Override
    public Money profit(Money bet) {
        throw new IllegalStateException();
    }
}
