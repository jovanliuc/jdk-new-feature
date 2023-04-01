package jdknewfeature.jdk12newfeature;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringClassNewMethods {

    @Test void test() {
        String text = "Hello jovanliuc!\nThis is Java 12 article.";

        text = text.indent(4);
        System.out.println(text);

        text = text.indent(-20);
        System.out.println(text);
    }

    @Test void givenString_thenRevertValue() {
        String text = "jovanliuc";
        String transformed = text.transform(value ->
                new StringBuilder(value).reverse().toString()
        );

        Assertions.assertEquals("cuilnavoj", transformed);
    }
}
