package nextstep.blackjack.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class ProfitsTest {

    @Test
    void profits_초기화_딜러() {
        Profits profits = new Profits();
        List<String> s = profits.printProfits();
        Assertions.assertThat(s.get(0)).isEqualTo("딜러: 0");
    }

    @Test
    void addProfits() {
        Profits profits = new Profits();
        profits.playerUpdateProfit("홍길동",new Money(1234));
        profits.playerUpdateProfit("김길순",new Money(4567));
        List<String> s = profits.printProfits();
        Assertions.assertThat(s.get(1)).isEqualTo("홍길동: 1234");
    }
}
