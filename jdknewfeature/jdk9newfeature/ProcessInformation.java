package jdknewfeature.jdk9newfeature;

import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.time.Instant;
import java.util.Optional;

public class ProcessInformation {

    @Test
    void test() {
        ProcessHandle self = ProcessHandle.current();
        long pid = self.pid();
        ProcessHandle.Info procInfo = self.info();
        Optional<String[]> args = procInfo.arguments();
        Optional<String> cmd = procInfo.commandLine();
        Optional<Instant> startTime = procInfo.startInstant();
        Optional<Duration> cpuUsage = procInfo.totalCpuDuration();
        System.out.println();
    }
}
