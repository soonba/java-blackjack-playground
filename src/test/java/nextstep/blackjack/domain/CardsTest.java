package nextstep.blackjack.domain;

import nextstep.blackjack.constants.Denomination;
import nextstep.blackjack.constants.PrintCardsType;
import nextstep.blackjack.constants.Suit;
import nextstep.blackjack.domain.card.Card;
import nextstep.blackjack.domain.card.Cards;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
        assertThat(score).isEqualTo(21);
    }

    @Test
    void 문자변환() {
        String s = cards.printCards(PrintCardsType.DEFAULT);
        assertThat(s).isEqualTo("K클로버,10다이아몬드,A하트");
    }

    @Test
    void 결과담긴문자변환() {
        String s = cards.printCards(PrintCardsType.ADD_RESULT);
        assertThat(s).isEqualTo("K클로버,10다이아몬드,A하트 - 결과: 21");
    }

    @Test
    void bust_테스트() {
        Cards cards1 = new Cards();
        cards1.add(new Card(Suit.CLOVER, Denomination.ACE));
        assertThat(cards1.getScore()).isEqualTo(11);
        cards1.add(new Card(Suit.HEART, Denomination.ACE));
        assertThat(cards1.getScore()).isEqualTo(12);
        cards1.add(new Card(Suit.DIAMOND, Denomination.ACE));
        assertThat(cards1.getScore()).isEqualTo(13);
        cards1.add(new Card(Suit.SPADE, Denomination.ACE));
        assertThat(cards1.getScore()).isEqualTo(14);

    }
}
