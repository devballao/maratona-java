package ballao.dev.maratonajava.javacore.Bintroducaometodos.test;

import ballao.dev.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Satoru";
        funcionario.idade = 20;
        funcionario.salario = new double[]{1000, 2000, 3000};

        funcionario.imprimeDados();
        funcionario.mediaSalario();
    }
}
