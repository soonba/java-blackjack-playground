package nextstep.blackjack.domain;

public class Money {
    private final double value;

    public Money() {
        value = 0;
    }

    public Money(double value) {
        this.value = value;
    }

    public static Money init() {
        return new Money();
    }

    public Money add(Money incrementValue) {
        return new Money(value+incrementValue.getValue());
    }

    public Money negative() {
        return new Money(-1 * value);
    }

    public int getValue() {
        return (int)value;
    }
}
