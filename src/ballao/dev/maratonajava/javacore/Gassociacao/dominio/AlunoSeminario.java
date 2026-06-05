package ballao.dev.maratonajava.javacore.Gassociacao.dominio;

public class AlunoSeminario {
    private String nome;
    private int idade;
    private Seminario seminario;

    public AlunoSeminario(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public AlunoSeminario(String nome, int idade, Seminario seminario) {
        this.nome = nome;
        this.idade = idade;
        this.seminario = seminario;
    }

    public void imprimir() {
        System.out.println("Aluno: " + nome + ", " + idade + " anos");
        if (seminario != null) {
            System.out.println("Seminário: " + seminario.getTitulo());
        } else {
            System.out.println("Nenhum seminário associado.");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Seminario getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario seminario) {
        this.seminario = seminario;
    }
}
