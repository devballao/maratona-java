package ballao.dev.maratonajava.javacore.Nexecoes.test;

public class StackOverflowTest {
    public static void main(String[] args) {
        recursividade();
    }

    public static void recursividade() {
        recursividade();
    }
}
