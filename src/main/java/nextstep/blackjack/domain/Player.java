package nextstep.blackjack.domain;

public class Player implements Gamer {

    private final Cards hands = new Cards();
    private final String name;
    private Money amount;
    private Money bet;

    public Player(String name, int bet) {
        this.name = name;
        this.amount = Money.init();
        this.bet = new Money(bet);
    }

    @Override
    public void addCard(Card card) {
        hands.add(card);
    }

    @Override
    public void increaseMoney(int value) {

    }

    @Override
    public void decreaseMoney(int value) {

    }

    public void betting(int value) {
        bet = bet.increment(value);
    }

    @Override
    public int getAmount() {
        return 0;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String printCards() {
        StringBuilder sb = new StringBuilder();
        sb.append(getName()).append(": ");
        hands.printCards().forEach(hand -> sb.append(hand).append(", "));
        return sb.substring(0, sb.length() - 2);
    }
}
