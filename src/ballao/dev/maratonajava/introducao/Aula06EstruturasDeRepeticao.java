package ballao.dev.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao {
    public static void main(String[] args) {
        // while, do while, for
        System.out.println("Usando While");
        int count = 0;
        while(count < 10){
            System.out.println(count);
            count++;
        }

        System.out.println("\nUsando Do While");
        count = 12;
        do {
            System.out.println(count);
            count++;
        } while(count < 10);

        System.out.println("\nUsando For");
        for(int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        System.out.println("\nExercicio usando loop");
        // Imprimir os numeros pares de 0 a 1000000
        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        System.out.println("\nExercicio 01 usando loop e break");
        // Imprima os primeiros 25 numero de um valor (Ex: 50)
        int valorMax = 50;
        for (int i = 0; i <= valorMax; i++) {
            if (i > 25) {
                break;
            } else {
                System.out.println(i);
            }
        }

        System.out.println("\nExercicio 02 usando loop e break");
        // Dado o valo de um carro descubra quantas vezes ele pode ser parcelado. (condição: valor da parcela >= 1000)
        double valorTotal = 30000.00;
        for (int parcela = 0; parcela <= valorTotal; parcela++) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela < 1000) {
                break;
            } else {
                System.out.println("Valor da parcela " + parcela + ": " + valorParcela);
            }
        }

        System.out.println("\nExercicio 03 usando loop e continue");
        // Imprima os numeros impares de 0 a 100
        for (int parcela = (int) valorTotal; parcela >= 1; parcela--) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela < 1000) {
                continue;
            } else {
                System.out.println("Valor da parcela " + parcela + ": " + valorParcela);
            }
        }
    }
}
