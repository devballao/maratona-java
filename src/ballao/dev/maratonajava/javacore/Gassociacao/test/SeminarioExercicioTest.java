package ballao.dev.maratonajava.javacore.Gassociacao.test;

import ballao.dev.maratonajava.javacore.Gassociacao.dominio.AlunoSeminario;
import ballao.dev.maratonajava.javacore.Gassociacao.dominio.LocalSeminario;
import ballao.dev.maratonajava.javacore.Gassociacao.dominio.ProfessorSeminario;
import ballao.dev.maratonajava.javacore.Gassociacao.dominio.Seminario;

public class SeminarioExercicioTest {
    public static void main(String[] args) {
        //Endereço
        LocalSeminario local1 = new LocalSeminario("Rua dos Bobos, 0");

        //Professores
        ProfessorSeminario professor1 = new ProfessorSeminario("Dr. Smith", "Matemática");
        ProfessorSeminario professor2 = new ProfessorSeminario("Dr. Johnson", "Física");

        //Seminarios
        Seminario seminario1 = new Seminario("Seminário de Matemática", professor1, local1);
        Seminario seminario2 = new Seminario("Seminário de Matemática Avançada", professor1, local1);
        Seminario seminario3 = new Seminario("Seminário de Física", professor2, local1);
        Seminario seminario4 = new Seminario("Seminário de Física Avançada", professor2, local1);

        //Alunos
        AlunoSeminario aluno1 = new AlunoSeminario("Alice", 20, seminario1);
        AlunoSeminario aluno2 = new AlunoSeminario("Bob", 22, seminario1);
        AlunoSeminario aluno3 = new AlunoSeminario("Charlie", 21, seminario2);
        AlunoSeminario aluno4 = new AlunoSeminario("Diana", 23, seminario2);

        professor1.setSeminarios(new Seminario[]{seminario1, seminario2});
        professor2.setSeminarios(new Seminario[]{seminario3, seminario4});

        seminario1.setAlunos(new AlunoSeminario[]{aluno1, aluno2});
        seminario2.setAlunos(new AlunoSeminario[]{aluno3, aluno4});
        seminario3.setAlunos(new AlunoSeminario[]{aluno1, aluno3});
        seminario4.setAlunos(new AlunoSeminario[]{aluno2, aluno4});

        //Imprimindo informações
        System.out.println("--- Local do Seminário ---");
        local1.imprimir();

        System.out.println("\n--- Professores ---");
        professor1.imprimir();
        professor2.imprimir();

        System.out.println("\n--- Alunos ---");
        aluno1.imprimir();
        aluno2.imprimir();
        aluno3.imprimir();
        aluno4.imprimir();

        System.out.println("\n--- Seminário 1 ---");
        seminario1.imprimir();
        System.out.println("\n--- Seminário 2 ---");
        seminario2.imprimir();
        System.out.println("\n--- Seminário 3 ---");
        seminario3.imprimir();
        System.out.println("\n--- Seminário 4 ---");
        seminario4.imprimir();
    }
}
