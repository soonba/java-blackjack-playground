package nextstep.blackjack.domain.card;

import nextstep.blackjack.constants.PrintCardsType;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Cards {
    private final List<Card> cards = new ArrayList<>();
    public static final int BLACKJACK_BOUND = 21;
    public static final int ACE_CORRECTION = 10;

    public int getScore() {
        int sum = cards.stream()
                .mapToInt(Card::getScore)
                .sum();
        return sum - aceCorrection(sum);
    }

    public void add(Card card) {
        cards.add(card);
    }

    public String printCards(PrintCardsType printCardsType) {
        List<String> collect = cards.stream().map(Card::getString).collect(Collectors.toList());
        String join = String.join(",", collect);
        return printCardsType.addString(join, this.getScore());
    }

    public boolean isBust() {
        return this.getScore() > BLACKJACK_BOUND;
    }

    public boolean isBlackjack() {
        return this.getScore() == BLACKJACK_BOUND && cards.size() == 2;
    }

    private int aceCorrection(int originScore) {
        if(originScore <= BLACKJACK_BOUND) return 0;
        int aceCount = (int) cards.stream().filter(Card::isAce).count();
        int minCountUnderBound = getMinCountUnderBound(originScore);
        return Math.min(aceCount,minCountUnderBound) * ACE_CORRECTION;
    }

    private int getMinCountUnderBound(int originScore) {
        return ((originScore + 9 - BLACKJACK_BOUND) / 10);
    }
}
