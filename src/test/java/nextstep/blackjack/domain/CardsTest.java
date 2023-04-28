package nextstep.blackjack.domain;

import nextstep.blackjack.constants.Shape;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class CardsTest {

    private Cards cards;
    @BeforeEach
    void setUp() {
        cards = new Cards();
        cards.add(new Card(Shape.CLOVER,13));
        cards.add(new Card(Shape.CLOVER,11));
    }

    @Test
    void 카드스코어() {
        int score = cards.getScore();
        assertThat(score).isEqualTo(24);
    }

    @Test
    void 문자변환() {
        List<String> strings = cards.printCards();
        assertThat(strings.get(1)).isEqualTo("J클로버");
    }
}
