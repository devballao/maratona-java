package ballao.dev.maratonajava.javacore.Mpolimorfismo.test;

import ballao.dev.maratonajava.javacore.Mpolimorfismo.dominio.Computador;
import ballao.dev.maratonajava.javacore.Mpolimorfismo.dominio.Tomate;
import ballao.dev.maratonajava.javacore.Mpolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest {
    public static void main(String[] args) {
        Computador computador = new Computador("NUC10i7", 11000.0);
        Tomate tomate = new Tomate("Tomate Siciliano", 10.0);

        CalculadoraImposto.calcularImpostoComputador(computador);
        System.out.println("---------------------");
        CalculadoraImposto.calcularImpostoTomate(tomate);
    }
}
