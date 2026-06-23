package ballao.dev.maratonajava.javacore.Linterfaces.dominio;

public class DatabaseLoader implements DataLoader {
    @Override
    public void load() {
        System.out.println("Loading data from database...");
    }
}
