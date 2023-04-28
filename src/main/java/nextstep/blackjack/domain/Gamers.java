package nextstep.blackjack.domain;

import java.util.List;
import java.util.stream.Collectors;

public class Gamers {
    List<Gamer> gamers;

    public Gamers(List<Gamer> gamers) {
        this.gamers = gamers;
    }

    public List<String> initGameMessage() {
        return gamers.stream()
                .filter(gamer -> (gamer instanceof Player))
                .map(Gamer::getName).collect(Collectors.toList());
    }

    public void initCards() {
        for (Gamer gamer : gamers) {
            gamer.addCard(Deck.nextCard());
            gamer.addCard(Deck.nextCard());
        }
    }

    public List<String> printGamersCards() {
        return gamers.stream().map(Gamer::printCards).collect(Collectors.toList());
    }
}
