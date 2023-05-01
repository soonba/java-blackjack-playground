package nextstep.blackjack.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class DeckTest {


    @Test
    void 덱초기화() {
        int count = 0;
        while(!Deck.isEmpty()) {
            Deck.draw();
            count++;
        }
        Assertions.assertThat(count).isEqualTo(52);
    }
}
