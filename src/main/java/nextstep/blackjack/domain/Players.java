package nextstep.blackjack.domain;

import java.util.List;

public class Players {

    List<Player> playerList;

    public Players(List<Player> playerList) {
        this.playerList = playerList;
    }

    public List<Player> getPlayerList() {
        return playerList;
    }
}
