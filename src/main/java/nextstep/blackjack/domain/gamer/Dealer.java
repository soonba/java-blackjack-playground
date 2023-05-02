package nextstep.blackjack.domain.gamer;

public class Dealer extends Gamer {

    public static final String DEALER_NAME = "딜러";
    public static final int EXTRA_DRAW_BOUND = 16;

    public Dealer() {
        super();
    }

    @Override
    public String getName() {
        return DEALER_NAME;
    }

    @Override
    public boolean isFinished() {
        return (super.isFinished() && this.continueByRule());
    }

    private boolean continueByRule() {
        return state.cards().getScore() > EXTRA_DRAW_BOUND;
    }
}
