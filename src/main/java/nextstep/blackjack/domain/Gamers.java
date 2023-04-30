package nextstep.blackjack.domain;

import java.util.List;
import java.util.stream.Collectors;

public class Gamers {
    private final Dealer dealer;
    private final List<Player> players;

    public Gamers(Dealer dealer,List<Player> players) {
        this.dealer = dealer;
        this.players = players;
    }

    public List<String> initGameMessage() {
        return players.stream()
                .map(Player::getName).collect(Collectors.toList());
    }

    public void initCards() {
        dealer.addCard(Deck.nextCard());
        dealer.addCard(Deck.nextCard());
        for (Player player : players) {
            player.addCard(Deck.nextCard());
            player.addCard(Deck.nextCard());
        }
    }

    public List<String> printGamersCards() {
        String printDealer = dealer.printCards();
        List<String> collect = players.stream().map(Player::printCards).collect(Collectors.toList());
        collect.add(0,printDealer);
        return collect;
    }

    public boolean isBlackjack() {
        if(dealer.isBlackjack()) {
        }

    }
}
