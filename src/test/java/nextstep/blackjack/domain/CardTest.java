package nextstep.blackjack.domain;

import nextstep.blackjack.constants.Denomination;
import nextstep.blackjack.constants.Suit;
import nextstep.blackjack.domain.card.Card;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CardTest {

    @Test
    void 카드_문자변환1() {
        Card card = new Card(Suit.HEART, Denomination.KING);
        Card card2 = new Card(Suit.SPADE, Denomination.ACE);
        String str = card.getString();
        String str2 = card2.getString();
        assertThat(str).isEqualTo("K하트");
        assertThat(str2).isEqualTo("A스페이드");
    }

    @Test
    void 카드_문자변환2() {
        Card card = new Card(Suit.HEART, Denomination.EIGHT);
        String str = card.getString();
        assertThat(str).isEqualTo("8하트");
    }
}
