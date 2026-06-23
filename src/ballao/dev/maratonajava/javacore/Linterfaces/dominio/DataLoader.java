package ballao.dev.maratonajava.javacore.Linterfaces.dominio;

public interface DataLoader {
    void load();
    default void checkPermission(){
        System.out.println("Checking permission...");
    }
}
