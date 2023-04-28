package nextstep.blackjack.domain;

import nextstep.blackjack.constants.Shape;
import nextstep.blackjack.constants.StringCard;

import java.security.InvalidParameterException;

public class Card {
    private final Shape shape;
    private final int value;
    private final int score;
    public static final int MIN_CARD_VALUE = 1;
    public static final int MAX_CARD_VALUE = 13;

    public Card(Shape shape, int number) {
        this.shape = shape;
        this.value = validation(number);
        this.score = toScore(number);
    }

    private int toScore(int number) {
        if(number > 10) return 10;
        if(number == 1) return 11;
        return number;
    }

    private int validation(int number) {
        if (number >= MIN_CARD_VALUE && number <= MAX_CARD_VALUE) return number;
        throw new InvalidParameterException("value 는 1~13 사이");
    }


    public int getScore() {
        return score;
    }

    public String getString() {
        String strValue = convertValue(this.value);
        String strShape = shape.getName();
        return strValue + strShape;
    }

    public boolean isAce() {
        return value == 1;
    }

    private String convertValue(int value) {
        return StringCard.numberValueOf(value).orElse(String.valueOf(value));
    }
}
