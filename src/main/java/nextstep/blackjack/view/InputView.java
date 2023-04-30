package nextstep.blackjack.view;

import nextstep.blackjack.domain.Dealer;
import nextstep.blackjack.domain.Gamers;
import nextstep.blackjack.domain.Player;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class InputView {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static Gamers initPlayer() throws Exception {
        String[] split = br.readLine().split(",");
        List<Player> playerList = new ArrayList<>();
        for (String s : split) {
            OutputView.initBet(s);
            int bet = Integer.parseInt(br.readLine());
            playerList.add(new Player(s, bet));
        }
        return new Gamers(new Dealer(), playerList);
    }
}
