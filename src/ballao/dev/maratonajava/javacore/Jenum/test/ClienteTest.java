package ballao.dev.maratonajava.javacore.Jenum.test;

import ballao.dev.maratonajava.javacore.Jenum.dominio.Cliente;
import ballao.dev.maratonajava.javacore.Jenum.dominio.TipoCliente;

public class ClienteTest {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Tsubasa", TipoCliente.PESSOA_FISICA);
        Cliente cliente2 = new Cliente("Kuririn", TipoCliente.PESSOA_JURIDICA);
        Cliente cliente3 = new Cliente("Jyraia", TipoCliente.PESSOA_FISICA);
        Cliente cliente4 = new Cliente("Zoro", TipoCliente.PESSOA_JURIDICA);

        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(cliente3);
        System.out.println(cliente4);
    }
}
