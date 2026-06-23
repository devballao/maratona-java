package ballao.dev.maratonajava.javacore.Linterfaces.dominio;

public class FileLoader implements DataLoader, DataRomover {
    @Override
    public void load() {
        System.out.println("Carregando dados de um arquivo...");
    }

    @Override
    public void remove() {
        System.out.println("Removendo dados de um arquivo...");
    }
}
