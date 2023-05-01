package nextstep.blackjack.view;

import nextstep.blackjack.domain.Money;
import nextstep.blackjack.domain.gamer.Dealer;
import nextstep.blackjack.domain.Game;
import nextstep.blackjack.domain.gamer.Player;
import nextstep.blackjack.domain.gamer.Players;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class InputView {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static Game initPlayerAndBets() throws Exception {
        String[] split = br.readLine().split(",");
        List<Player> playerList = new ArrayList<>();
        for (String s : split) {
            OutputView.initBet(s);
            int bet = Integer.parseInt(br.readLine());
            playerList.add(new Player(s, new Money(bet)));
        }
        return new Game(new Dealer(), new Players(playerList));
    }
}
