package ballao.dev.maratonajava.javacore.Qdata.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeTest01 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDate date = LocalDate.parse("2020-04-20");
        LocalTime time = LocalTime.parse("12:30:21");

        System.out.println(localDateTime);
        System.out.println(localDateTime.toLocalDate());
        System.out.println(localDateTime.toLocalTime());

        System.out.println(date);
        System.out.println(time);

        LocalDateTime ldt1 = date.atTime(time);
        System.out.println(ldt1);
    }
}
