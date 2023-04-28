package nextstep.blackjack.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoneyTest {


    @Test
    void 돈_증가_감소() {
        Money init = Money.init();
        Money increment = init.increment(10000);
        Assertions.assertThat(increment.getValue()).isEqualTo(10000);

        Money decrement = increment.decrement(3000);
        Assertions.assertThat(decrement.getValue()).isEqualTo(7000);

        Money decrement2 = decrement.decrement(8000);
        Assertions.assertThat(decrement2.getValue()).isEqualTo(-1000);

    }
}
