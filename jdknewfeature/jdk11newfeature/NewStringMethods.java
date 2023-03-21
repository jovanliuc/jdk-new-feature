package jdknewfeature.jdk11newfeature;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

public class NewStringMethods {

    @Test
    void test() {
        String multiLineString = "Baeldung helps \n \n developers \n explore Java.";;
        List<String> lines = multiLineString.lines()
                .filter(line -> !line.isBlank())
                .map(String::strip)
                .collect(Collectors.toList());
        Assertions.assertLinesMatch(lines,
                List.of("Baeldung helps", "developers", "explore Java."));
    }
}
