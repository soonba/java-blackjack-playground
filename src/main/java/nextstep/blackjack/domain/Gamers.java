package nextstep.blackjack.domain;

import nextstep.blackjack.constants.Deck;

import java.util.List;
import java.util.stream.Collectors;

public class Gamers {
    private final Dealer dealer;
    private final Players players;

    public Gamers(Dealer dealer,Players players) {
        this.dealer = dealer;
        this.players = players;
    }

    public List<String> initGameMessage() {
        return players.getPlayerList().stream()
                .map(Player::getName).collect(Collectors.toList());
    }

    public void initCards() {
        dealer.addCard(Deck.draw());
        dealer.addCard(Deck.draw());
        for (Player player : players.getPlayerList()) {
            player.addCard(Deck.draw());
            player.addCard(Deck.draw());
        }
    }

    public List<String> printGamersCards() {
        String printDealer = dealer.printCards();
        List<String> collect = players.getPlayerList().stream().map(Player::printCards).collect(Collectors.toList());
        collect.add(0,printDealer);
        return collect;
    }

    public boolean isAnyBlackjack() {
        return true;
    }
}
