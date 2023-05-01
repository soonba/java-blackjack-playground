package nextstep.blackjack.domain.gamer;

public class Dealer extends Gamer {

    public static final String DEALER_NAME = "딜러";

    public Dealer() {
        super();
    }

    @Override
    public String getName() {
        return DEALER_NAME;
    }
}
