package ballao.dev.maratonajava.javacore.Linterfaces.dominio;

public class DatabaseLoader implements DataLoader, DataRomover {
    @Override
    public void load() {
        System.out.println("Loading data from database...");
    }

    @Override
    public void remove() {
        System.out.println("Removing data from database...");
    }
}
