package nextstep.blackjack.constants;

public enum PrintCardsType {
    DEFAULT, ADD_RESULT;


    public String addString(String raw, int score) {
        if(this.equals(ADD_RESULT)) {
            raw += " - 결과: " + score;
        }
        return raw;
    }


}
