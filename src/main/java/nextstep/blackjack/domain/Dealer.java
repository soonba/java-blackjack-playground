package nextstep.blackjack.domain;

public class Dealer implements Gamer {
    public static final String NAME = "딜러";
    private final Cards hands = new Cards();
    private Money amount = Money.init();

    @Override
    public void addCard(Card card) {
        hands.add(card);
    }

    @Override
    public void increaseMoney(int value) {
        amount = amount.increment(value);
    }

    @Override
    public void decreaseMoney(int value) {
        amount = amount.decrement(value);
    }

    @Override
    public int getAmount() {
        return amount.getValue();
    }

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public String printCards() {
        StringBuilder sb = new StringBuilder();
        sb.append(getName()).append(" 카드: ");
        hands.printCards().forEach(hand -> sb.append(hand).append(", "));
        return sb.substring(0, sb.length() - 2);
    }
}
