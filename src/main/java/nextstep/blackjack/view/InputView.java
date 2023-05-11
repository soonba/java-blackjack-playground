package nextstep.blackjack.view;

import nextstep.blackjack.domain.Money;
import nextstep.blackjack.domain.gamer.Dealer;
import nextstep.blackjack.domain.Game;
import nextstep.blackjack.domain.gamer.Player;
import nextstep.blackjack.domain.gamer.Players;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class InputView {

    public static final String DRAW_CONTINUE_SIGN = "y";
    public static final String DRAW_STOP_SIGN = "n";
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

    public static boolean wantToDraw(String playerName) {
        System.out.println();
        System.out.println(playerName + "은/는 한장의 카드를 더 받겠습니까?(예는 y, 아니오는 n)");
        try {
            String s = br.readLine();
            if(s.equals(DRAW_CONTINUE_SIGN)) return true;
            if(s.equals(DRAW_STOP_SIGN)) return false;
            throw new IllegalStateException();
        } catch (Exception e) {
            System.out.println("y/n으로 입력해주세요.");
            return wantToDraw(playerName);
        }

    }
}
