package jdknewfeature.jdk9newfeature;

import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class DestroyingProcesses {

    @Test
    void test() {
        Stream<ProcessHandle> children = ProcessHandle.current().children();
        children.forEach(processHandle -> {
            assertTrue(processHandle.destroy(), "Could not kill process " + processHandle.pid());
        });
    }
}
