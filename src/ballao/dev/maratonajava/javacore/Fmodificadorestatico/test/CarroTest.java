package ballao.dev.maratonajava.javacore.Fmodificadorestatico.test;

import ballao.dev.maratonajava.javacore.Fmodificadorestatico.dominio.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro1 = new Carro("BMW", 280);
        Carro carro2 = new Carro("Mercedez", 275);
        Carro carro3 = new Carro("Audi", 290);

        Carro.setVelocidadeLimite(185);

        System.out.println(carro1);
        System.out.println(carro2);
        System.out.println(carro3);
    }


}
