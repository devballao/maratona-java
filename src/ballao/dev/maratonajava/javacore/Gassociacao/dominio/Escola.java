package ballao.dev.maratonajava.javacore.Gassociacao.dominio;

public class Escola {
    private String nome;
    private Professor[] professores;

    public Escola(String nome) {
        this.nome = nome;
    }

    public Escola(String nome, Professor[] professores) {
        this.nome = nome;
        this.professores = professores;
    }

    public void imprimir() {
        System.out.println("------------------");
        System.out.println("Nome: " + this.nome);
        if (this.professores != null) {
            System.out.println("Professores: ");
            for (Professor professor : this.professores) {
                System.out.println(professor.getNome());
            }
        } else {
            System.out.println("A escola não tem professores");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Professor[] getProfessores() {
        return professores;
    }

    public void setProfessores(Professor[] professores) {
        this.professores = professores;
    }
}
