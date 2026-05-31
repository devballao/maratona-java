package ballao.dev.maratonajava.javacore.Aintroducaoclasses.test;

import ballao.dev.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Mestre Kami";
        professor.sexo = "M";
        professor.idade = 140;

        System.out.println("Nome: " + professor.nome);
        System.out.println("Sexo: " + professor.sexo);
        System.out.println("Idade: " + professor.idade);
    }
}
