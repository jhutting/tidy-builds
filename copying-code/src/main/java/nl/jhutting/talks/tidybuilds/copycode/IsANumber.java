package nl.jhutting.talks.tidybuilds.copycode;

import org.apache.commons.lang3.math.NumberUtils;

public class IsANumber {
    static void main(String[] args) {
        var instance = new IsANumber();
        IO.println(instance.isANumber(args[0]));
    }

    private boolean isANumber(String input) {
        return NumberUtils.isNumber(input);
    }
}