package nextstep.blackjack;

import nextstep.blackjack.constants.PrintCardsType;
import nextstep.blackjack.domain.Game;
import nextstep.blackjack.domain.Profits;
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
        OutputView.printListMessage(game.printGamersCards(PrintCardsType.DEFAULT));

        //플레이어, 딜러 추가 프로세스
        extraDrawProcess(game);

        //결과 출력
        OutputView.printListMessage(game.printGamersCards(PrintCardsType.ADD_RESULT));

        //profit 계산
        Profits profits = game.getProfits();
        OutputView.printListMessage(profits.printProfits());

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
            OutputView.printMessage(player.printCards(PrintCardsType.DEFAULT));
        }

        // n을 입력해 나왔다면 stay
        if(!player.isFinished()) player.stay();
    }

    private void drawUntilSixteen(Dealer dealer) {
        while (!dealer.isFinished()) {
            OutputView.dealerDrawMessage();
            dealer.addCard();
        }
    }
}
