package ballao.dev.maratonajava.javacore.Owarppers.test;

import java.util.Scanner;

public class WrappersTest01 {
    public static void main(String[] args) {
        byte byteP = 1;
        short shortP = 1;
        int intP = 1;
        long longP = 10L;
        float floatP = 10F;
        double doubleP = 10D;
        char charP = 'W';
        boolean booleanP = false;

        // Mostrando os Wrappers
        Byte byteW = 127; //autoboxing
        Short shortW = 1;
        Integer intW = 1;
        Long longW = 10L;
        Float floatW = 10F;
        Double doubleW = 10D;
        Character charW = 'W';
        Boolean booleanW = false;

        int i = intW; // unboxing
        Integer j = Integer.parseInt("1"); // String to Integer;

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String s = sc.nextLine().toUpperCase();
        System.out.println("Seu nome é " + s);
    }
}
