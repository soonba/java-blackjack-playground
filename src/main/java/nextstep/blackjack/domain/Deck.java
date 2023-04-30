package nextstep.blackjack.domain;

import nextstep.blackjack.constants.Suit;

import java.util.*;

public class Deck {

    private static final Queue<Card> cardQueue = init();

    private static Queue<Card> init() {
        LinkedList<Card> cardList = new LinkedList<>();
        for (int i = Card.MIN_CARD_VALUE; i <= Card.MAX_CARD_VALUE; i++) {
            cardList.add(new Card(Suit.CLOVER,i));
            cardList.add(new Card(Suit.HEART,i));
            cardList.add(new Card(Suit.DIAMOND,i));
            cardList.add(new Card(Suit.SPADE,i));
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
