package ballao.dev.maratonajava.javacore.Mpolimorfismo.servico;

import ballao.dev.maratonajava.javacore.Mpolimorfismo.dominio.Computador;
import ballao.dev.maratonajava.javacore.Mpolimorfismo.dominio.Produto;
import ballao.dev.maratonajava.javacore.Mpolimorfismo.dominio.Tomate;

public class CalculadoraImposto {
    public static void calcularImposto(Produto produto){
        System.out.println("Relatorio de imposto do produto");
        double imposto = produto.calcularImposto();
        System.out.println("Computados " + produto.getNome());
        System.out.println("Valor: " + produto.getValor());
        System.out.println("Imposto a ser pago: " + imposto);
    }
}
