package ballao.dev.maratonajava.javacore.Hheranca.test;

import ballao.dev.maratonajava.javacore.Hheranca.dominio.Endereco;
import ballao.dev.maratonajava.javacore.Hheranca.dominio.Funcionario;
import ballao.dev.maratonajava.javacore.Hheranca.dominio.Pessoa;

public class HerancaTest {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setLogradouro("Rua dos Bobos");
        endereco.setCep("12345");

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Maria");
        pessoa.setCpf("1234567890");
        pessoa.setEndereco(endereco);

        Funcionario funcionario = new Funcionario();
        funcionario.setNome("João");
        funcionario.setCpf("0987654321");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(5000);

        funcionario.imprime();
        funcionario.relatorioPagamento();
    }
}
