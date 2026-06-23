package ballao.dev.maratonajava.javacore.Linterfaces.test;

import ballao.dev.maratonajava.javacore.Linterfaces.dominio.DatabaseLoader;
import ballao.dev.maratonajava.javacore.Linterfaces.dominio.FileLoader;

public class DatabaseLoaderTest {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();

        databaseLoader.load();
        fileLoader.load();

        databaseLoader.remove();
        fileLoader.remove();

        databaseLoader.checkPermission();
        fileLoader.checkPermission();
    }
}
