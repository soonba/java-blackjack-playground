package nextstep.blackjack.domain;

import nextstep.blackjack.constants.Denomination;
import nextstep.blackjack.constants.Suit;
import nextstep.blackjack.domain.card.Card;
import nextstep.blackjack.domain.card.Cards;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class CardsTest {

    private Cards cards;

    @BeforeEach
    void setUp() {
        cards = new Cards();
        cards.add(new Card(Suit.CLOVER, Denomination.KING));
        cards.add(new Card(Suit.DIAMOND, Denomination.TEN));
        cards.add(new Card(Suit.HEART, Denomination.ACE));
    }

    @Test
    void 카드스코어() {
        int score = cards.getScore();
        assertThat(score).isEqualTo(31);
    }

    @Test
    void 문자변환() {
        String s = cards.printCards();
        assertThat(s).isEqualTo("K클로버,10다이아몬드,A하트");
    }
}
