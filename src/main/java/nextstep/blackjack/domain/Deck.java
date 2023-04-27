package nextstep.blackjack.domain;

import java.util.*;

public class Deck {

    private final Queue<Card> cardQueue;

    public Deck() {
        this.cardQueue = init();
    }

    private Queue<Card> init() {
        LinkedList<Card> cardList = new LinkedList<>();
        for (int i = 1; i <= 13; i++) {
            cardList.add(new Card(Shape.CLOVER,i));
            cardList.add(new Card(Shape.HEART,i));
            cardList.add(new Card(Shape.DIAMOND,i));
            cardList.add(new Card(Shape.SPADE,i));
        }
        Collections.shuffle(cardList);
        return cardList;
    }

    public Card nextCard() {
        return cardQueue.poll();
    }

    public boolean isEmpty() {
        return cardQueue.isEmpty();
    }
}
