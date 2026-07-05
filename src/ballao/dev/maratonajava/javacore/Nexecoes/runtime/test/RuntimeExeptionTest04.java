package ballao.dev.maratonajava.javacore.Nexecoes.runtime.test;

public class RuntimeExeptionTest04 {
    public static void main(String[] args) {
        try {
            throw new ArrayIndexOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Dentro do ArrayIndexOutOfBoundsException");
            e.printStackTrace();
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Dentro do IndexOutOfBoundsException");
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            System.out.println("Dentro do IllegalArgumentException");
            e.printStackTrace();
        } catch (ArithmeticException e) {
            System.out.println("Dentro do ArithmeticException");
            e.printStackTrace();
        } catch (RuntimeException e) {
            System.out.println("Dentro do RuntimeException");
            e.printStackTrace();
        }
    }
}
