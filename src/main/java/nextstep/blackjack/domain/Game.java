package nextstep.blackjack.domain;

import nextstep.blackjack.constants.PrintCardsType;
import nextstep.blackjack.domain.gamer.Dealer;
import nextstep.blackjack.domain.gamer.Player;
import nextstep.blackjack.domain.gamer.Players;

import java.util.List;
import java.util.stream.Collectors;

public class Game {
    private final Dealer dealer;
    private final Players players;

    public Game(Dealer dealer, Players players) {
        this.dealer = dealer;
        this.players = players;
    }

    public List<String> initGameMessage() {
        return players.getPlayerList().stream()
                .map(Player::getName).collect(Collectors.toList());
    }

    public void initCards() {
        dealer.addCard();
        dealer.addCard();
        for (Player player : players.getPlayerList()) {
            player.addCard();
            player.addCard();
        }
    }

    public List<String> printGamersCards(PrintCardsType printCardsType) {
        String printDealer = dealer.printCards(printCardsType);
        List<String> collect = players.getPlayerList().stream().map(player -> player.printCards(printCardsType)).collect(Collectors.toList());
        collect.add(0, printDealer);
        return collect;
    }

    public Players getPlayers() {
        return players;
    }

    public Dealer getDealer() {
        return this.dealer;
    }

    public Profits getProfits() {
        Profits profits = new Profits();
        players.getPlayerList()
                .forEach(player -> updateProfits(player, profits));
        return profits;
    }

    private void updateProfits(Player player, Profits profits) {
        if(!player.scoreComparable() || player.getScore() > dealer.getScore()) {
            profits.playerUpdateProfit(player.getName(),player.getProfitMoney());
            profits.dealerUpdateProfit(player.getProfitMoney().negative());
            return;
        }

        profits.playerUpdateProfit(player.getName(), player.getProfitMoney().negative());
        profits.dealerUpdateProfit(player.getProfitMoney());
    }
}
