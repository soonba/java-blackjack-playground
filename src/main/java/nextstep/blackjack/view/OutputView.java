package nextstep.blackjack.view;

import java.util.List;

public class OutputView {
    public static void initMessage() {
        System.out.println("게임에 참여할 사람의 이름을 입력하세요.(쉼표 기준으로 분리)");
    }

    public static void initErrorMessage() {
        System.out.println("이름 또는 배팅을 잘못 입력하였습니다.");
    }

    public static void initBet(String name) {
        System.out.println(name + "의 배팅 금액은?");
    }

    public static void initGameMessage(List<String> messageList) {
        String message = String.join(",", messageList);
        System.out.println("딜러와 " + message + "에게 2장의 나누었습니다.");
    }

    public static void printListMessage(List<String> messages) {
        StringBuilder sb = new StringBuilder();
        System.out.println();
        sb.append("## 최종 수익").append("\n");
        messages.forEach(message -> sb.append(message).append("\n"));
        System.out.println(sb);
    }

    public static void printMessage(String message) {
        System.out.println();
        System.out.println(message);
    }

    public static void dealerDrawMessage() {
        System.out.println("딜러는 16이하라 한장의 카드를 더 받았습니다.");
    }
}
