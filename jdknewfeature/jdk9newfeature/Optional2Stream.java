package jdknewfeature.jdk9newfeature;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Optional2Stream {

    @Test
    void test() {
        List<Optional> listOfOptionals = new ArrayList<>();
        listOfOptionals.stream().flatMap(Optional::stream).collect(Collectors.toList());
        System.out.println();
    }
}
