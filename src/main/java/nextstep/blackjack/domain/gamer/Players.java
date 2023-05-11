package nextstep.blackjack.domain.gamer;

import java.util.List;

public class Players {

    private final List<Player> playerList;

    public Players(List<Player> playerList) {
        this.playerList = playerList;
    }

    public List<Player> getPlayerList() {
        return playerList;
    }
}
