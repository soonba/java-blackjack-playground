package nextstep.blackjack.state.finished;

import nextstep.blackjack.domain.Cards;

public class Blackjack extends Finished {

    public Blackjack(Cards cards) {
        super(cards);
    }

    @Override
    public double earningRate() {
        return 1.5;
    }
}
