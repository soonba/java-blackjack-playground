package nextstep.blackjack.domain;

import java.security.InvalidParameterException;

public class Card {
    private final Shape shape;
    private final int value;

    public Card(Shape shape, int number) {
        this.shape = shape;
        this.value = validation(number);
    }

    private int validation(int number) {
        if(number > 0 && number < 14) return number;
        throw new InvalidParameterException("value 는 1~13 사이");
    }

    public Shape getShape() {
        return shape;
    }

    public int getValue() {
        return value;
    }
}
