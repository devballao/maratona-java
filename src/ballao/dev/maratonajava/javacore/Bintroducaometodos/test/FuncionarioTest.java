package ballao.dev.maratonajava.javacore.Bintroducaometodos.test;

import ballao.dev.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Satoru");
        funcionario.setIdade(20);
        funcionario.setSalario(new double[]{1000, 2000, 3000, 4000, 5000});

        funcionario.imprimeDados();
        funcionario.mediaSalario();
    }
}
