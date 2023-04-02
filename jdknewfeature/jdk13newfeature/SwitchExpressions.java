package jdknewfeature.jdk13newfeature;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SwitchExpressions {

    @Test void test() {
        var me = 4;
        var operation = "squareMe";
        var result = switch (operation) {
            case "doubleMe" -> {
                yield me * 2;
            }
            case "squareMe" -> {
                yield me * me;
            }
            default -> me;
        };

        Assertions.assertEquals(16, result);
    }

    @Test void test_compact() {
        var me = 4;
        var operation = "squareMe";
        var result = switch (operation) {
            case "doubleMe" -> me * 2;
            case "squareMe" -> me * me;
            default -> me;
        };

        Assertions.assertEquals(16, result);
    }
}
