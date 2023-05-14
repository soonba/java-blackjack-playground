package nextstep.blackjack.state;

import nextstep.blackjack.domain.Money;
import nextstep.blackjack.domain.card.Card;
import nextstep.blackjack.domain.card.Cards;

public interface State {
    State draw(Card card);
    State stay();
    boolean isFinished();
    Cards cards();
    Money profit(Money bet);
}
