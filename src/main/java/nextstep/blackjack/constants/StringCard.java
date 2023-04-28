package nextstep.blackjack.constants;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public enum StringCard {
    JACK(11, "J"),
    QUEEN(12, "Q"),
    KING(13, "K"),
    ACE(1, "A");

    private final int numValue;
    private final String strValue;

    private static final Map<Integer, String> valueMap = new HashMap<>();

    static {
        Arrays.stream(StringCard.values())
                .forEach(strCard -> valueMap.put(strCard.numValue, strCard.strValue));
    }

    StringCard(int numValue, String strValue) {
        this.numValue = numValue;
        this.strValue = strValue;
    }

    public int getNumValue() {
        return numValue;
    }

    public String getStrValue() {
        return strValue;
    }

    public static Optional<String> numberValueOf(int numValue) {
        return Optional.ofNullable(valueMap.get(numValue));
    }
}
