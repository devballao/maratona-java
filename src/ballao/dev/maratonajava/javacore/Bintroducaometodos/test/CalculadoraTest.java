package ballao.dev.maratonajava.javacore.Bintroducaometodos.test;

import ballao.dev.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        calculadora.somaDoisNumeros();
        calculadora.subtraDoisNumeros();
        calculadora.multiplicaDoisNumeros(10, 20);

        // Teste do método de divisão com retorno
        double divisaoResult = calculadora.divideDoisNumeros(10, 20);
        System.out.println("Resultado da divisão: " + divisaoResult);
    }
}
