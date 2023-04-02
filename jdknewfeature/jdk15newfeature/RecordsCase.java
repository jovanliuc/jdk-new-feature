package jdknewfeature.jdk15newfeature;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RecordsCase {

    public record Person(String name, int age) {
        public Person {
            if(age < 0) {
                throw new IllegalArgumentException("Age cannot be negative");
            }
        }
    }

    @Test void test() {
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> new Person("XXX", -1));
    }
}
