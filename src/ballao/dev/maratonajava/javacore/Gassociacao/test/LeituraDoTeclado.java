package ballao.dev.maratonajava.javacore.Gassociacao.test;

import java.util.Scanner;

public class LeituraDoTeclado {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("Digite seu nome: ");
        String nome = input.nextLine();

        System.out.printf("Digite sua idade: ");
        int idade = input.nextInt();

        System.out.printf("Digite M ou F para seu sexo: ");
        char sexo = input.next().charAt(0);

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Sexo: " + sexo);
    }
}
