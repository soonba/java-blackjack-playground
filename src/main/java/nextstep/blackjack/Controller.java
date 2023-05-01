package nextstep.blackjack;

import nextstep.blackjack.domain.Game;
import nextstep.blackjack.view.InputView;
import nextstep.blackjack.view.OutputView;

public class Controller {


    public void run() {

        //선수명 및 베팅금액 초기화
        Game game = initializeGame();

        //첫 두 장 draw 및 출력
        game.initCards();
        OutputView.initGameMessage(game.initGameMessage());
        OutputView.printAllGamerCards(game.printGamersCards());

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
        //... controller 를 거치지 않고 도메인 내에서 I/O 로직을 구현할 수 있는지?
    }
}
