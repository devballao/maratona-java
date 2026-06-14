package ballao.dev.maratonajava.javacore.Jenum.test;

import ballao.dev.maratonajava.javacore.Jenum.dominio.Cliente;
import ballao.dev.maratonajava.javacore.Jenum.dominio.TipoCliente;

public class ClienteTest {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Tsubasa", TipoCliente.PESSOA_FISICA, Cliente.TipoPagamento.DEBITO);
        Cliente cliente2 = new Cliente("Akira", TipoCliente.PESSOA_JURIDICA,  Cliente.TipoPagamento.CREDITO);

        System.out.println(cliente1);
        System.out.println(cliente2);
    }
}
