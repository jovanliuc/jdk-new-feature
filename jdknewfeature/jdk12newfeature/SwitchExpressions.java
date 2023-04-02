package jdknewfeature.jdk12newfeature;

import org.junit.jupiter.api.Test;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class SwitchExpressions {

    @Test
    void test() {
        DayOfWeek dayOfWeek = LocalDate.now().getDayOfWeek();
        switch (dayOfWeek) {
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> System.out.println("Working Day");
            case SATURDAY, SUNDAY -> System.out.println("Day Off");
        }
    }
}
