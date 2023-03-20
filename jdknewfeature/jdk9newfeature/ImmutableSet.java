package jdknewfeature.jdk9newfeature;

import org.junit.jupiter.api.Test;

import java.util.Set;

public class ImmutableSet {

    @Test
    void test() {
        Set<String> strKeySet = Set.of("Key1", "Key2", "Key3");
        System.out.println(strKeySet.size());
    }
}
