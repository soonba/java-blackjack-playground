package nextstep.blackjack.domain;

import nextstep.blackjack.constants.Suit;
import org.junit.jupiter.api.Test;

import java.security.InvalidParameterException;

import static org.assertj.core.api.Assertions.*;

public class CardTest {

    @Test
    void 카드번호는_1에서_13사이() {
        assertThatThrownBy(
                () -> {Card card = new Card(Suit.CLOVER,14);}
        ).isInstanceOf(InvalidParameterException.class);
    }

    @Test
    void 카드_문자변환1() {
        Card card = new Card(Suit.HEART,13);
        Card card2 = new Card(Suit.SPADE,1);
        String str = card.getString();
        String str2 = card2.getString();
        assertThat(str).isEqualTo("K하트");
        assertThat(str2).isEqualTo("A스페이드");
    }

    @Test
    void 카드_문자변환2() {
        Card card = new Card(Suit.HEART,8);
        String str = card.getString();
        assertThat(str).isEqualTo("8하트");
    }
}
