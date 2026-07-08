package ballao.dev.maratonajava.javacore.Rformatacao.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest01 {
    public static void main(String[] args) {
        Locale localeItaly = new Locale("it", "IT");
        Locale localeSwitzerland = new Locale("de", "CH");
        Locale localeBrazil = new Locale("pt", "BR");
        Locale localeFrance = new Locale("fr", "FR");
        Locale localeChina = new Locale("zh", "CN");
        Locale localeJapan =  new Locale("ja", "JP");

        Calendar calendar = Calendar.getInstance();
        DateFormat dateFormat1 = DateFormat.getDateInstance(DateFormat.FULL, localeItaly);
        DateFormat dateFormat2 = DateFormat.getDateInstance(DateFormat.FULL, localeSwitzerland);
        DateFormat dateFormat3 = DateFormat.getDateInstance(DateFormat.FULL, localeBrazil);
        DateFormat dateFormat4 = DateFormat.getDateInstance(DateFormat.FULL, localeFrance);
        DateFormat dateFormat5 = DateFormat.getDateInstance(DateFormat.FULL, localeChina);
        DateFormat dateFormat6 = DateFormat.getDateInstance(DateFormat.FULL, localeJapan);

        System.out.println("Italy: " + dateFormat1.format(calendar.getTime()));
        System.out.println("Switzerland: " + dateFormat2.format(calendar.getTime()));
        System.out.println("Brazil: " + dateFormat3.format(calendar.getTime()));
        System.out.println("France: " + dateFormat4.format(calendar.getTime()));
        System.out.println("China: " + dateFormat5.format(calendar.getTime()));
        System.out.println("Japan: " + dateFormat6.format(calendar.getTime()));

        System.out.println(localeBrazil.getDisplayCountry(localeJapan));
        System.out.println(localeBrazil.getDisplayCountry(localeItaly));
        System.out.println(localeBrazil.getDisplayCountry(localeSwitzerland));
    }
}
