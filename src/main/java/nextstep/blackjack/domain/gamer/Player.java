package nextstep.blackjack.domain.gamer;

import nextstep.blackjack.domain.Money;
import nextstep.blackjack.domain.card.Card;
import nextstep.blackjack.domain.card.Cards;

public class Player {

    private final Cards hands = new Cards();
    private final String name;
    private final Money amount;
    private final Money bet;

    public Player(String name, int bet) {
        this.name = name;
        this.amount = Money.init();
        this.bet = new Money(bet);
    }

    public void addCard(Card card) {
        hands.add(card);
    }

    public void increaseMoney(Money value) {

    }

    public void decreaseMoney(Money value) {

    }

    public int getAmount() {
        return 0;
    }

    public String getName() {
        return name;
    }

    public String printCards() {
        StringBuilder sb = new StringBuilder();
        sb.append(getName()).append("카드: ");
        hands.printCards().forEach(hand -> sb.append(hand).append(", "));
        return sb.substring(0, sb.length() - 2);
    }

    public boolean isBlackjack() {
        return hands.getScore() == 21;
    }

    public Money getBet() {
        return bet;
    }
}
