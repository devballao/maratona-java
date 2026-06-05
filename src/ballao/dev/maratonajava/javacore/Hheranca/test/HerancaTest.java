package ballao.dev.maratonajava.javacore.Hheranca.test;

import ballao.dev.maratonajava.javacore.Hheranca.dominio.Endereco;
import ballao.dev.maratonajava.javacore.Hheranca.dominio.Funcionario;
import ballao.dev.maratonajava.javacore.Hheranca.dominio.Pessoa;

public class HerancaTest {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setLogradouro("Rua dos Bobos");
        endereco.setCep("12345");

        Pessoa pessoa = new Pessoa("Maria", "12345678900", endereco);
        Funcionario funcionario = new Funcionario("João", "0987654321", endereco, 5000);

        funcionario.imprime();
        funcionario.relatorioPagamento();
    }
}
