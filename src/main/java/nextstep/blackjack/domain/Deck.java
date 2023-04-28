package nextstep.blackjack.domain;

import nextstep.blackjack.constants.Shape;

import java.util.*;

public class Deck {

    private static final Queue<Card> cardQueue = init();

    private static Queue<Card> init() {
        LinkedList<Card> cardList = new LinkedList<>();
        for (int i = Card.MIN_CARD_VALUE; i <= Card.MAX_CARD_VALUE; i++) {
            cardList.add(new Card(Shape.CLOVER,i));
            cardList.add(new Card(Shape.HEART,i));
            cardList.add(new Card(Shape.DIAMOND,i));
            cardList.add(new Card(Shape.SPADE,i));
        }
        Collections.shuffle(cardList);
        return cardList;
    }

    public static Card nextCard() {
        return cardQueue.poll();
    }

    public static boolean isEmpty() {
        return cardQueue.isEmpty();
    }
}
