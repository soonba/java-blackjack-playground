package nextstep.blackjack;

import nextstep.blackjack.domain.Game;
import nextstep.blackjack.domain.gamer.Dealer;
import nextstep.blackjack.domain.gamer.Player;
import nextstep.blackjack.view.InputView;
import nextstep.blackjack.view.OutputView;

import java.util.List;

public class Controller {


    public void run() {

        //선수명 및 베팅금액 초기화
        Game game = initializeGame();

        //첫 두 장 draw 및 출력
        game.initCards();
        OutputView.initGameMessage(game.initGameMessage());
        OutputView.printListMessage(game.printGamersCards());

        //플레이어, 딜러 추가 프로세스
        extraDrawProcess(game);
    }

    private Game initializeGame() {
        try {
            OutputView.initMessage();
            return InputView.initPlayerAndBets();
        } catch (Exception e) {
            OutputView.initErrorMessage();
            return initializeGame();
        }
    }

    private void extraDrawProcess(Game game) {
        List<Player> playerList = game.getPlayers().getPlayerList();
        playerList.stream()
                .filter(player -> !player.isFinished())
                .forEach(this::drawUntilStop);

        Dealer dealer = game.getDealer();
        drawUntilSixteen(dealer);
    }

    private void drawUntilStop(Player player) {
        while (!player.isFinished() && InputView.wantToDraw(player.getName())) {
            player.addCard();
            OutputView.printMessage(player.printCards());
        }
    }

    private void drawUntilSixteen(Dealer dealer) {
        while (!dealer.isFinished()) {
            OutputView.dealerDrawMessage();
            dealer.addCard();
            OutputView.printMessage(dealer.printCards());
        }
    }
}
