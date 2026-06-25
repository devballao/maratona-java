package ballao.dev.maratonajava.javacore.Nexecoes.runtime.test;

public class RuntimeExeptionTest02 {
    public static void main(String[] args) {
        try {
            System.out.println(divisao(10, 0));
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }

    /**
     *
     * @param num1
     * @param num2 divisor não pode ser 0 (zero)
     * @return num1 / num2
     * @throws IllegalArgumentException se o divisor for 0 (zero)
     */
    public static int divisao(int num1, int num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("Não é possível dividir por zero");
        }
        return num1 / num2;
    }
}
