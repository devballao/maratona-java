package ballao.dev.maratonajava.javacore.Nexecoes.exceptio.test;

import java.io.*;

public class TryWithResourcesTest01 {
    public static void main(String[] args) {

    }

    public static void lerArquivo() throws IOException {
        try (Reader reader = new BufferedReader(new FileReader("teste.txt"))) {

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void lerArquivo2() {
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("teste.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
