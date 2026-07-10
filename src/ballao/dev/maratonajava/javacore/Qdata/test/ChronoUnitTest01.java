package ballao.dev.maratonajava.javacore.Qdata.test;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTest01 {
    public static void main(String[] args) {
        LocalDate nowDate = LocalDate.now();
        LocalDate futureDate = LocalDate.now().plusYears(2).plusMonths(3).plusDays(17);

        System.out.println(ChronoUnit.DAYS.between(nowDate,futureDate));
        System.out.println(ChronoUnit.WEEKS.between(nowDate,futureDate));
        System.out.println(ChronoUnit.MONTHS.between(nowDate,futureDate));
    }
}
