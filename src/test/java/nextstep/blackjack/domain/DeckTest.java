package nextstep.blackjack.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class DeckTest {


    @Test
    void 덱초기화() {
        Deck deck = new Deck();
        int count = 0;
        while(!deck.isEmpty()) {
            deck.nextCard();
            count++;
        }
        Assertions.assertThat(count).isEqualTo(52);
    }
}
