package ballao.dev.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // + - / *
        int numero1 = 10;
        int numero2 = 20;

        int resultado = numero1 + numero2;
        System.out.println("Soma: " + resultado);

        resultado = numero1 - numero2;
        System.out.println("Subtração: " + resultado);

        resultado = numero1 * numero2;
        System.out.println("Multiplicação: " + resultado);

        resultado = numero1 / numero2;
        System.out.println("Divisão: " + resultado);

        resultado = numero1 % numero2;
        System.out.println("Resto da divisão: " + resultado);

        //< > <= >= == !=
        boolean isDezMaiorQueVinte = numero1 > numero2;
        System.out.println("Dez é maior que vinte? " + isDezMaiorQueVinte);

        boolean isDezMenorQueVinte = numero1 < numero2;
        System.out.println("Dez é menor que vinte? " + isDezMenorQueVinte);

        boolean isDezIgualAVinte = numero1 == numero2;
        System.out.println("Dez é igual a vinte? " + isDezIgualAVinte);

        boolean isDezDiferenteDeVinte = numero1 != numero2;
        System.out.println("Dez é diferente de vinte? " + isDezDiferenteDeVinte);

        // && (AND) || (OR) ! (NOT)
        boolean isDezMaiorQueVinteEDezMenorQueTrinta = numero1 > numero2 && numero1 < 30;
        System.out.println("Dez é maior que vinte e menor que trinta? " + isDezMaiorQueVinteEDezMenorQueTrinta);

        boolean isDezMaiorQueVinteOuDezMenorQueTrinta = numero1 > numero2 || numero1 < 30;
        System.out.println("Dez é maior que vinte ou menor que trinta? " + isDezMaiorQueVinteOuDezMenorQueTrinta);

        boolean isDezNaoMaiorQueVinte = !(numero1 > numero2);
        System.out.println("Dez não é maior que vinte? " + isDezNaoMaiorQueVinte);

        // = += -= *= /= %=
        double bonus = 1800;
        System.out.println("Bonus: " + bonus);

        bonus += 1000; // bonus = bonus + 1000
        System.out.println("Bonus de aumento: " + bonus);

        bonus -= 1000; // bonus - 1000
        System.out.println("Bonus de aumento: " + bonus);

        bonus /= 1000; // bonus / 1000
        System.out.println("Bonus de aumento: " + bonus);

        bonus *= 1000; // bonus * 1000
        System.out.println("Bonus de aumento: " + bonus);

        // ++ --
        int contador = 0;
        contador++;
        System.out.println("Contador: " + contador);

        contador--;
        System.out.println("Contador: " + contador);

        ++contador;
        System.out.println("Contador: " + contador);

        --contador;
        System.out.println("Contador: " + contador);
    }
}
