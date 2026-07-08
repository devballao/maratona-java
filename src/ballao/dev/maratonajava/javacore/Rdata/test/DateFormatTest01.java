package ballao.dev.maratonajava.javacore.Rdata.test;

import java.text.DateFormat;
import java.util.Calendar;

public class DateFormatTest01 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        DateFormat[] df = new DateFormat[7];

        df[0] = DateFormat.getInstance();
        df[1] = DateFormat.getDateInstance();
        df[2] = DateFormat.getDateTimeInstance();
        df[3] = DateFormat.getTimeInstance(DateFormat.SHORT);
        df[4] = DateFormat.getTimeInstance(DateFormat.MEDIUM);
        df[5] = DateFormat.getTimeInstance(DateFormat.LONG);
        df[6] = DateFormat.getDateInstance(DateFormat.FULL);

        for (DateFormat df1 : df) {
            System.out.println(df1.format(calendar.getTime()));
        }
    }
}
