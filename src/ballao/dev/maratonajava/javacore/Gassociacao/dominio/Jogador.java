package ballao.dev.maratonajava.javacore.Gassociacao.dominio;

public class Jogador {
    private String nome;
    private Time time;

    public Jogador(String nome) {
        this.nome = nome;
    }

    public Jogador(String nome, Time time) {
        this.nome = nome;
        this.time = time;
    }

    public void imprimir() {
        System.out.println("------------------");
        System.out.println("Nome: " + this.nome);
        if (this.time != null) {
            System.out.println("Time: " + this.time.getNome());
        } else {
            System.out.println("O jogador não tem time");
        }
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
