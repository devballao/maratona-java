package ballao.dev.maratonajava.javacore.Rformatacao.test;

import java.util.Locale;

public class LocaleTest02 {
    public static void main(String[] args) {
        System.out.println("Locale.getDefault() = " + Locale.getDefault());

        String[] isCountries = Locale.getISOCountries();
        String[] isLanguage = Locale.getISOLanguages();

        for (String s : isLanguage) {
            System.out.print(s + " ");
        }

        System.out.println();

        for (String s : isCountries) {
            System.out.print(s + " ");
        }
    }
}
