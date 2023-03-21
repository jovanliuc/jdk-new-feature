package jdknewfeature.jdk11newfeature;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LocalVariableSyntax4Lambda {

    @Test void test() {
        List<String> sampleList = Arrays.asList("Java", "Kotlin");
        String resultString = sampleList.stream()
                .map((var x) -> x.toUpperCase())
                .collect(Collectors.joining(", "));
        Assertions.assertEquals(resultString, "JAVA, KOTLIN");
    }
}
