package ballao.dev.maratonajava.javacore.Qdata.test;

import java.awt.*;
import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalTimeTest01 {
    public static void main(String[] args) {
        LocalTime localTime = LocalTime.now();

        System.out.println(localTime);
        System.out.println(localTime.getHour());
        System.out.println(localTime.getMinute());
        System.out.println(localTime.getSecond());
        System.out.println(localTime.getNano());
        System.out.println(localTime.get(ChronoField.AMPM_OF_DAY));
        System.out.println(localTime.MAX);
        System.out.println(localTime.MIN);
    }
}
