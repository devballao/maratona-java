package ballao.dev.maratonajava.javacore.Kclassesabstratas.test;

import ballao.dev.maratonajava.javacore.Kclassesabstratas.dominio.Desenvolvedor;
import ballao.dev.maratonajava.javacore.Kclassesabstratas.dominio.Funcionario;
import ballao.dev.maratonajava.javacore.Kclassesabstratas.dominio.Gerente;

public class FuncionarioTest {
    static void main() {
        Gerente gerente1 = new Gerente("Nami", 5000);
        Desenvolvedor desenvolvedor1 = new Desenvolvedor("Touya", 12000);

        System.out.println(gerente1);
        System.out.println(desenvolvedor1);
        gerente1.imprimir();
        desenvolvedor1.imprimir();
    }
}
