package nextstep.blackjack.domain;

import nextstep.blackjack.constants.Shape;
import nextstep.blackjack.constants.StringCard;

import java.security.InvalidParameterException;

public class Card {
    private final Shape shape;
    private final int value;
    public static final int MIN_CARD_VALUE = 1;
    public static final int MAX_CARD_VALUE = 13;

    public Card(Shape shape, int number) {
        this.shape = shape;
        this.value = validation(number);
    }

    private int validation(int number) {
        if (number >= MIN_CARD_VALUE && number <= MAX_CARD_VALUE) return number;
        throw new InvalidParameterException("value 는 1~13 사이");
    }

    public Shape getShape() {
        return shape;
    }

    public int getValue() {
        return value;
    }

    public String getString() {
        String strValue = convertValue(this.value);
        String strShape = shape.getName();
        return strValue + strShape;
    }

    private String convertValue(int value) {
        return StringCard.numberValueOf(value).orElse(String.valueOf(value));
    }
}
