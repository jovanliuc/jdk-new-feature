package jdknewfeature.jdk12newfeature;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.text.NumberFormat;
import java.util.Locale;

public class CompactNumberFormatting {

    @Test
    void test() {
        NumberFormat likesShort =
                NumberFormat.getCompactNumberInstance(new Locale("zh_CN", "CN"), NumberFormat.Style.SHORT);
        likesShort.setMaximumFractionDigits(2);
        Assertions.assertEquals("1.31K", likesShort.format(1314));

        NumberFormat likesLong =
                NumberFormat.getCompactNumberInstance(new Locale("zh_CN", "CN"), NumberFormat.Style.LONG);
        likesLong.setMaximumFractionDigits(2);
        Assertions.assertEquals("1.31K", likesLong.format(1314));
    }
}
