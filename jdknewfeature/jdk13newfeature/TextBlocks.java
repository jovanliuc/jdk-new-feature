package jdknewfeature.jdk13newfeature;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TextBlocks {

    @Test void test() {
        String TEXT_BLOCK_JSON = """
        {
            "name" : "jovanloiuc",
            "website" : "https://github.com/jovanliuc"
        }
        """;

        Assertions.assertTrue(TEXT_BLOCK_JSON.contains("jovanliuc"));
        Assertions.assertTrue(TEXT_BLOCK_JSON.length() > 0);
    }
}
