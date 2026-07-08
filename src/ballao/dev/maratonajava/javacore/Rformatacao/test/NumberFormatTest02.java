package ballao.dev.maratonajava.javacore.Rformatacao.test;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest02 {
    public static void main(String[] args) {
        Locale localeBrazil = new Locale("pt", "BR");
        Locale localeJapan = new Locale("jp", "JP");
        Locale localeItaly = new Locale("it", "IT");

        NumberFormat[] nfa = new NumberFormat[4];
        nfa[0] = NumberFormat.getCurrencyInstance();
        nfa[1] = NumberFormat.getCurrencyInstance(localeBrazil);
        nfa[2] = NumberFormat.getCurrencyInstance(localeJapan);
        nfa[3] = NumberFormat.getCurrencyInstance(localeItaly);

        double valor = 100_000_000.2130;

        for (NumberFormat nf : nfa) {
            System.out.println(nf.format(valor));
        }

        String valorString = "JP¥100,000,000";
        try {
            System.out.println(nfa[2].parse(valorString));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
