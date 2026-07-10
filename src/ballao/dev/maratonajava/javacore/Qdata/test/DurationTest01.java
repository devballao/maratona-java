package ballao.dev.maratonajava.javacore.Qdata.test;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DurationTest01 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime future = LocalDateTime.now().plusYears(2);
        LocalTime time = LocalTime.now();
        LocalTime afterTimeNow = LocalTime.now().minusHours(7);

        Duration d1 = Duration.between(now, future);
        Duration d2 = Duration.between(time, afterTimeNow);
        Duration d3 = Duration.between(Instant.now(), Instant.now().plusSeconds(1000));

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
    }
}
