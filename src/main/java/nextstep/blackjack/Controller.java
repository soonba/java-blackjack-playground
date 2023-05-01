package nextstep.blackjack;

import nextstep.blackjack.domain.Game;
import nextstep.blackjack.view.InputView;
import nextstep.blackjack.view.OutputView;

public class Controller {


    public void run() {

        //선수명 및 베팅금액 초기화
        Game game = initializeGame();

        //첫 두 장 드로우 및 출력
        game.initCards();
        OutputView.initGameMessage(game.initGameMessage());
        OutputView.printAllGamerCards(game.printGamersCards());

        //플레이어, 딜러
        playerProgress(game);
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

    private void playerProgress(Game game) {

    }
}
