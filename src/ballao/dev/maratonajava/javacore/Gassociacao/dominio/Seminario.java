package ballao.dev.maratonajava.javacore.Gassociacao.dominio;

public class Seminario {
    private String titulo;
    private ProfessorSeminario professor;
    private AlunoSeminario[] alunos;
    private LocalSeminario local;

    public Seminario(String titulo, ProfessorSeminario professor, LocalSeminario local) {
        this.titulo = titulo;
        this.professor = professor;
        this.local = local;
    }

    public Seminario(String titulo, ProfessorSeminario professor, AlunoSeminario[] alunos, LocalSeminario local) {
        this.titulo = titulo;
        this.professor = professor;
        this.alunos = alunos;
        this.local = local;
    }

    public void imprimir() {
        System.out.println("Título: " + titulo);
        System.out.println("Professor: " + professor.getNome() + " - " + professor.getEspecialidade());
        System.out.println("Local: " + local.getEndereco());
        if (alunos != null) {
            System.out.println("Alunos:");
            for (AlunoSeminario aluno : alunos) {
                System.out.println("- " + aluno.getNome() + ", " + aluno.getIdade() + " anos");
            }
        } else {
            System.out.println("Nenhum aluno inscrito.");
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public ProfessorSeminario getProfessor() {
        return professor;
    }

    public void setProfessor(ProfessorSeminario professor) {
        this.professor = professor;
    }

    public AlunoSeminario[] getAlunos() {
        return alunos;
    }

    public void setAlunos(AlunoSeminario[] alunos) {
        this.alunos = alunos;
    }

    public LocalSeminario getLocal() {
        return local;
    }

    public void setLocal(LocalSeminario local) {
        this.local = local;
    }
}
