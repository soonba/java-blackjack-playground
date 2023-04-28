package nextstep.blackjack;

import nextstep.blackjack.domain.Gamers;
import nextstep.blackjack.view.InputView;
import nextstep.blackjack.view.OutputView;

public class Controller {


    public void run() {
        Gamers gamers = initPlayers();
        OutputView.initGameMessage(gamers.initGameMessage());
        gamers.initCards();
        OutputView.printAllGamerCards(gamers.printGamersCards());
    }

    private Gamers initPlayers() {
        try {
            OutputView.initMessage();
            return InputView.initPlayer();
        } catch (Exception e) {
            OutputView.initErrorMessage();
            return initPlayers();
        }
    }
}
