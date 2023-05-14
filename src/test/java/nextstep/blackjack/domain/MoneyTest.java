package nextstep.blackjack.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoneyTest {


    @Test
    void 돈_증가_감소() {
        Money init = Money.init();
        Money increment = init.add(new Money(10000));
        Assertions.assertThat(increment.getValue()).isEqualTo(10000);

        Money decrement = increment.add(new Money(3000).negative());
        Assertions.assertThat(decrement.getValue()).isEqualTo(7000);

        Money decrement2 = decrement.add(new Money(8000).negative());
        Assertions.assertThat(decrement2.getValue()).isEqualTo(-1000);

    }
}
