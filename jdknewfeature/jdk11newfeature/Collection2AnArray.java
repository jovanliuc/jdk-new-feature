package jdknewfeature.jdk11newfeature;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class Collection2AnArray {

    @Test
    void test() {
        List sampleList = Arrays.asList("Java", "Kotlin");
        String[] sampleArray = (String[]) sampleList.toArray(String[]::new);
        Assertions.assertArrayEquals(sampleArray, sampleList.toArray());
    }
}
