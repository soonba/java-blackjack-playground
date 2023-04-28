package nextstep.blackjack.constants;

public enum Shape {

    CLOVER("클로버"), HEART("하트"), SPADE("스페이드"), DIAMOND("다이아몬드");
    private final String name;

    Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
