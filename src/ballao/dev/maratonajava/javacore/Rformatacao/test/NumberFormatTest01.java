package ballao.dev.maratonajava.javacore.Rformatacao.test;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest01 {
    public static void main(String[] args) {
        Locale localeBrazil = new Locale ("pt", "BR");
        Locale localeJapan = new Locale ("jp", "JP");
        Locale localeItaly = new Locale ("it", "IT");

        NumberFormat[] nfa = new NumberFormat[4];
        nfa[0] = NumberFormat.getInstance();
        nfa[1] = NumberFormat.getInstance(localeBrazil);
        nfa[2] = NumberFormat.getInstance(localeJapan);
        nfa[3] = NumberFormat.getInstance(localeItaly);

        double valor = 10_000.2130;

        for (NumberFormat nf : nfa) {
            System.out.println(nf.format(valor));
        }
    }
}
