package ballao.dev.maratonajava.javacore.Gassociacao.dominio;

public class LocalSeminario {
    private String endereco;

    public LocalSeminario(String endereco) {
        this.endereco = endereco;
    }

    public void imprimir() {
        System.out.println("Local do Seminário: " + endereco);
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
