package ballao.dev.maratonajava.javacore.Qdata.test;

import java.time.LocalDate;
import java.time.Period;

public class PeriodTest01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate future = LocalDate.now().plusYears(2);

        Period p1 = Period.between(now, future);

        System.out.println(p1);
        System.out.println(p1.toTotalMonths());
        System.out.println(p1.getDays()); // para trazer os dias, precisa ser entre datas que não sejam do mesmo mês.
    }
}
