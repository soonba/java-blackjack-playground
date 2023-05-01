package nextstep.blackjack.domain;

import nextstep.blackjack.domain.gamer.Dealer;
import nextstep.blackjack.domain.gamer.Gamers;
import nextstep.blackjack.domain.gamer.Player;
import nextstep.blackjack.domain.gamer.Players;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class GamersTest {

    @Test
    void 이름출력() {
        Player p1 = new Player("tobi", 10000);
        Dealer d1 = new Dealer();
        Player p2 = new Player("spring", 20000);
        List<Player> players = new ArrayList<>();
        players.add(p1);
        players.add(p2);

        Gamers players1 = new Gamers(d1, new Players(players));
        Assertions.assertThat(players1.initGameMessage().get(0)).isEqualTo("tobi");
        Assertions.assertThat(players1.initGameMessage().get(1)).isEqualTo("spring");
    }
}
