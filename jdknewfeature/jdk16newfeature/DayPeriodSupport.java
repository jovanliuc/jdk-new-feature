package jdknewfeature.jdk16newfeature;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DayPeriodSupport {

    @Test void test() {
        LocalTime date = LocalTime.parse("15:25:08.690791");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("h B");
        Assertions.assertEquals(date.format(formatter), "3 下午");
    }
}
