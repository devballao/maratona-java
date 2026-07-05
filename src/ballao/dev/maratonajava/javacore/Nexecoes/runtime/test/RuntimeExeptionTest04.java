package ballao.dev.maratonajava.javacore.Nexecoes.runtime.test;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class RuntimeExeptionTest04 {
    public static void main(String[] args) {
        try {
            throw new IllegalArgumentException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Dentro do ArrayIndexOutOfBoundsException");
            e.printStackTrace();
        } catch (IndexOutOfBoundsException | IllegalArgumentException | ArithmeticException e) {
            System.out.println("Dentro do IndexOutOfBoundsException | IllegalArgumentException | ArithmeticException");
            e.printStackTrace();
        } catch (RuntimeException e) {
            System.out.println("Dentro do RuntimeException");
            e.printStackTrace();
        }

        try {
            talvezLanceExeption();
        } catch (SQLException | FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void talvezLanceExeption() throws SQLException, FileNotFoundException {
    }
}
