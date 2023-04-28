package nextstep.blackjack.domain;

public class Money {
    private final int value;

    public Money() {
        value = 0;
    }

    public Money(int value) {
        this.value = value;
    }

    public static Money init() {
        return new Money();
    }

    public Money increment(int incrementValue) {
        return new Money(value+incrementValue);
    }

    public Money decrement(int decrementValue) {
        return new Money(value-decrementValue);
    }

    public int getValue() {
        return value;
    }
}
