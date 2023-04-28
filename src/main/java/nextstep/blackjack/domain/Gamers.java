package nextstep.blackjack.domain;

import java.util.List;
import java.util.stream.Collectors;

public class Gamers {
    private final Gamer dealer;
    private final List<Gamer> gamers;

    public Gamers(Gamer dealer,List<Gamer> gamers) {
        this.dealer = dealer;
        this.gamers = gamers;
    }

    public List<String> initGameMessage() {
        return gamers.stream()
                .map(Gamer::getName).collect(Collectors.toList());
    }

    public void initCards() {
        dealer.addCard(Deck.nextCard());
        dealer.addCard(Deck.nextCard());
        for (Gamer gamer : gamers) {
            gamer.addCard(Deck.nextCard());
            gamer.addCard(Deck.nextCard());
        }
    }

    public List<String> printGamersCards() {
        String printDealer = dealer.printCards();
        List<String> collect = gamers.stream().map(Gamer::printCards).collect(Collectors.toList());
        collect.add(0,printDealer);
        return collect;
    }

    public void check21() {

    }
}
