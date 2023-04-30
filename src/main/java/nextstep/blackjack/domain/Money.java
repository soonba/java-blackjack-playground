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

    public Money increment(Money incrementValue) {
        return new Money(value+incrementValue.getValue());
    }

    public Money decrement(Money decrementValue) {
        return new Money(value-decrementValue.getValue());
    }

    public int getValue() {
        return value;
    }
}
