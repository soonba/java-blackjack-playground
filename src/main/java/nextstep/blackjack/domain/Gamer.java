package nextstep.blackjack.domain;

public interface Gamer {

    void addCard(Card card);

    void increaseMoney(int value);

    void decreaseMoney(int value);

    String getName();

    int getAmount();

    String printCards();
}
