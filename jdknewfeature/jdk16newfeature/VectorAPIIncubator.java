package jdknewfeature.jdk16newfeature;

import jdk.incubator.vector.IntVector;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class VectorAPIIncubator {

    @Test void test() {
        int[] a = {1, 2, 3, 4};
        int[] b = {5, 6, 7, 8};

        int[] c = new int[a.length];

        var vectorA = IntVector.fromArray(IntVector.SPECIES_128, a, 0);
        var vectorB = IntVector.fromArray(IntVector.SPECIES_128, b, 0);
        var vectorC = vectorA.mul(vectorB);
        vectorC.intoArray(c, 0);
        Arrays.stream(c).forEach(System.out::println);
    }
}
