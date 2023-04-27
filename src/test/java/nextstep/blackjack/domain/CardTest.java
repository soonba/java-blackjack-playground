package nextstep.blackjack.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.security.InvalidParameterException;

public class CardTest {

    @Test
    void 카드번호는_1에서_13사이() {
        Assertions.assertThatThrownBy(
                () -> {Card card = new Card(Shape.CLOVER,14);}
        ).isInstanceOf(InvalidParameterException.class);
    }
}
