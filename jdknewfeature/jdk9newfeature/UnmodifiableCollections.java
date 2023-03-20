package jdknewfeature.jdk9newfeature;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class UnmodifiableCollections {

    @Test
    void test() {
        List<Integer> someIntList = new ArrayList<>();
        someIntList.add(1);
        someIntList.add(2);
        someIntList.add(3);
        someIntList.add(4);
        someIntList.add(5);

        List<Integer> copyList = List.copyOf(someIntList);
        assertThrows(UnsupportedOperationException.class, () -> copyList.add(6));
    }}
