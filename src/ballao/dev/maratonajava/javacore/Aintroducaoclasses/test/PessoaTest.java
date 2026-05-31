package ballao.dev.maratonajava.javacore.Aintroducaoclasses.test;

import ballao.dev.maratonajava.javacore.Aintroducaoclasses.dominio.Estudante;

public class PessoaTest {
    public static void main(String[] args) {
        Estudante estudanteTest = new Estudante();
        estudanteTest.nome = "Luffy";
        estudanteTest.idade = 21;
        estudanteTest.sexo = 'M';

        System.out.println("Nome: " + estudanteTest.nome);
        System.out.println("Idade: " + estudanteTest.idade);
        System.out.println("Sexo: " + estudanteTest.sexo);
    }
}
