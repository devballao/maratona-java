package ballao.dev.maratonajava.javacore.Qdata.test;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Locale;

public class InstantTest01 {
    public static void main(String[] args) {
        Instant now =  Instant.now();
        System.out.println(now);
        System.out.println(LocalDateTime.now());

        System.out.println(now.getEpochSecond());
        System.out.println(now.getNano());

        System.out.println(now.atZone(ZoneId.of("America/Sao_Paulo")));
        System.out.println(now.atZone(ZoneId.of("Asia/Tokyo")));
        System.out.println(now.atZone(ZoneId.of("Europe/London")));
    }
}
