package ballao.dev.maratonajava.javacore.Pstring.test;

public class StringPerformaceTest01 {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        concatenarString(100_000);
        long fim = System.currentTimeMillis();
        System.out.println("Tempo gasto String: " + (fim - inicio) + " ms");

        inicio = System.currentTimeMillis();
        concatenarStringBuilder(100_000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto StringBuilder: " + (fim - inicio) + " ms");
    }

    private static void concatenarString(int tamanho) {
        String texto = "";
        for (int i = 0; i < tamanho; i++) {
            texto += i;
        }
    }

    private static void concatenarStringBuilder(int tamanho) {
        StringBuilder texto = new StringBuilder();
        for (int i = 0; i < tamanho; i++) {
            texto.append(i);
        }
    }

    private static void concatenarStringBuffer(int tamanho) {
        StringBuffer texto = new StringBuffer();
        for (int i = 0; i < tamanho; i++) {
            texto.append(i);
        }
    }
}
