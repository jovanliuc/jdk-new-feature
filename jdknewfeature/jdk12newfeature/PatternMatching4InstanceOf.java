package jdknewfeature.jdk12newfeature;

import org.junit.jupiter.api.Test;

public class PatternMatching4InstanceOf {

    @Test void test() {

        Object obj = "Hello World!";
        if (obj instanceof String s) {
            int length = s.length();
        }
    }
}
