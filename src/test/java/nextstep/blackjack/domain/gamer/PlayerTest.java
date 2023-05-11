package nextstep.blackjack.domain.gamer;

import nextstep.blackjack.domain.Money;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class PlayerTest {

    @Test
    void 플레이어_Draw_종료() {
        Player player = new Player("t", new Money(10000));
        boolean finished = player.isFinished();
        Assertions.assertThat(finished).isEqualTo(false);
    }
}
