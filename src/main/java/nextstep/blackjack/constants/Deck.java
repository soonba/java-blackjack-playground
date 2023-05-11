package nextstep.blackjack.constants;

import nextstep.blackjack.domain.card.Card;

import java.util.*;

public class Deck {

    private static final Queue<Card> cardQueue = init();

    private static Queue<Card> init() {
        LinkedList<Card> cardList = new LinkedList<>();
        for (Denomination value : Denomination.values()) {
            cardList.add(new Card(Suit.CLOVER,value));
            cardList.add(new Card(Suit.HEART,value));
            cardList.add(new Card(Suit.DIAMOND,value));
            cardList.add(new Card(Suit.SPADE,value));
        }
        Collections.shuffle(cardList);
        return cardList;
    }

    public static Card draw() {
        return cardQueue.poll();
    }

    public static boolean isEmpty() {
        return cardQueue.isEmpty();
    }
}
