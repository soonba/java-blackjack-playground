package nextstep.blackjack.domain.gamer;

import nextstep.blackjack.domain.Money;

public class Player extends Gamer {

    private final String name;
    private final Money bet;
    public Player(String name, Money bet) {
        super();
        this.name = name;
        this.bet = bet;
    }

    @Override
    public String getName() {
        return name;
    }
}
