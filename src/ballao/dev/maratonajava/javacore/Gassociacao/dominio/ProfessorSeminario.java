package ballao.dev.maratonajava.javacore.Gassociacao.dominio;

public class ProfessorSeminario {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    public ProfessorSeminario(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public ProfessorSeminario(String nome, String especialidade, Seminario[] seminarios) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminarios = seminarios;
    }

    public void imprimir() {
        System.out.println("Professor: " + nome + " - " + especialidade);
        if (seminarios != null) {
            System.out.println("Seminários:");
            for (Seminario seminario : seminarios) {
                System.out.println("- " + seminario.getTitulo());
            }
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

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }
}
