package jdknewfeature.jdk14newfeature;

import org.junit.jupiter.api.Test;

public class TextBlocks {

    @Test void test() {
        String multiline = """
            A quick brown fox jumps over a lazy dog; \
            the lazy dog howls loudly.""";
        System.out.println(multiline);
    }
}
