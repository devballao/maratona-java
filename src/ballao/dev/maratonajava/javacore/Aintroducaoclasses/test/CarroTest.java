package ballao.dev.maratonajava.javacore.Aintroducaoclasses.test;

import ballao.dev.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.nome = "BMW";
        carro1.modelo = "X5";
        carro1.ano = 2023;

        System.out.println("Nome: " + carro1.nome);
        System.out.println("Modelo: " + carro1.modelo);
        System.out.println("Ano: " + carro1.ano);

        Carro carro2 = new Carro();
        carro2.nome = "Mercedes";
        carro2.modelo = "C300";
        carro2.ano = 2022;

        System.out.println("\nNome: " + carro2.nome);
        System.out.println("Modelo: " + carro2.modelo);
        System.out.println("Ano: " + carro2.ano);
    }
}
