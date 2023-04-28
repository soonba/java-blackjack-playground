package nextstep.blackjack.domain;

public interface Gamer {

    void addCard(Card card);

    String getName();

    String printCards();

    void increaseMoney(int value);

    void decreaseMoney(int value);

    int getAmount();
}
