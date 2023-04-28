package nextstep.blackjack;

import java.io.IOException;

public class BlackJackApplication {
    public static void main(String[] args) throws IOException {
        Controller controller = new Controller();
        controller.run();
    }
}
