package nextstep.blackjack.state.finished;

import nextstep.blackjack.domain.Cards;

public class Stay extends Finished {

    public Stay(Cards cards) {
        super(cards);
    }

    @Override
    public double earningRate() {
        return 1;
    }
}
