package nextstep.blackjack.state.finished;

import nextstep.blackjack.domain.Cards;

public class Bust extends Finished {
    public Bust(Cards cards) {
        super(cards);
    }

    @Override
    public double earningRate() {
        return 0;
    }

}
