package ballao.dev.maratonajava.javacore.Bintroducaometodos.test;

import ballao.dev.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        calculadora.somaDoisNumeros();
        calculadora.subtraDoisNumeros();
        calculadora.multiplicaDoisNumeros(10, 20);

        // Teste do método de divisão com retorno
        double divisaoResult = calculadora.divideDoisNumeros(20, 10);
        System.out.println("Resultado da divisão: " + divisaoResult);

        // Testando o método de alterar dois numeros
        int num1 = 10;
        int num2 = 20;
        calculadora.alteraDoisNumeros(num1, num2);

        //Soma Array
        int[] numeros = {1, 2, 3, 4, 5};
        calculadora.somaArray(numeros);

        // Usando Varargs
        calculadora.somaVarargs(1, 2, 3, 4, 5);
    }
}
