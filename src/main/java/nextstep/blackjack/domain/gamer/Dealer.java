package nextstep.blackjack.domain.gamer;

import nextstep.blackjack.domain.Money;
import nextstep.blackjack.domain.card.Card;
import nextstep.blackjack.domain.card.Cards;

public class Dealer {
    public static final String NAME = "딜러";
    private final Cards hands = new Cards();
    private Money amount = Money.init();

    public void addCard(Card card) {
        hands.add(card);
    }

    public void increaseMoney(Money value) {
        amount = amount.increment(value);
    }

    public void decreaseMoney(Money value) {
        amount = amount.decrement(value);
    }

    public int getAmount() {
        return amount.getValue();
    }

    public String getName() {
        return NAME;
    }

    public boolean isBlackjack() {
        return hands.getScore() == 21;
    }

    public String printCards() {
        StringBuilder sb = new StringBuilder();
        sb.append(getName()).append(" 카드: ");
        hands.printCards().forEach(hand -> sb.append(hand).append(", "));
        return sb.substring(0, sb.length() - 2);
    }
}
