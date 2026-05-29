package ballao.dev.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    static void main() {
        //Tipos primitivos
        //int, double, float, char, byte, short, long, boolean
        int idade = 10;
        int idadeCasting = (int) 20000000000L; // casting
        double salarioDouble = 2000.0;
        float salarioFloat = 2500.0F;
        char caractere = 'A';
        byte b = 127; // -128 a 127
        short s = 32767; // -32768 a 32767
        long l = 1000000000000000000L; // -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807
        boolean verdadeiro = true;
        boolean falso = false;
        String nome = "Maria"; // String não é um tipo primitivo, mas sim um tipo referencia, elas esta aqui porque também é muito usada

        System.out.println("Idade: " + idade);
        System.out.println("IdadeCasting: " + idadeCasting);
        System.out.println("Salario: " + salarioDouble);
        System.out.println("Salario: " + salarioFloat);
        System.out.println("Caractere: " + caractere);
        System.out.println("B: " + b);
        System.out.println("S: " + s);
        System.out.println("L: " + l);
        System.out.println("Verdadeiro: " + verdadeiro);
        System.out.println("Falso: " + falso);
        System.out.println("Nome: " + nome);
    }
}
