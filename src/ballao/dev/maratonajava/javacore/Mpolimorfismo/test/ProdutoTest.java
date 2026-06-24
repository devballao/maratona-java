package ballao.dev.maratonajava.javacore.Mpolimorfismo.test;

import ballao.dev.maratonajava.javacore.Mpolimorfismo.dominio.Computador;
import ballao.dev.maratonajava.javacore.Mpolimorfismo.dominio.Produto;
import ballao.dev.maratonajava.javacore.Mpolimorfismo.dominio.Tomate;
import ballao.dev.maratonajava.javacore.Mpolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest {
    public static void main(String[] args) {
        Computador computador = new Computador("NUC10i7", 11000.0);
        Tomate tomate = new Tomate("Tomate Siciliano", 10.0);

        CalculadoraImposto.calcularImpostoComputador(computador);
        System.out.println("---------------------");
        CalculadoraImposto.calcularImpostoTomate(tomate);

        System.out.println("---------------------");
        System.out.println("Polimorfismo");
        Produto produto = new Computador("Ryzen 9", 3000.0);
        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
        System.out.println("---------------------");

        Produto produto2 = new Tomate("Tomate Siciliano", 10.0);
        System.out.println(produto2.getNome());
        System.out.println(produto2.getValor());
    }
}
