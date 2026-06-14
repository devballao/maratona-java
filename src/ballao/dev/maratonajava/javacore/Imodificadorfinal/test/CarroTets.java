package ballao.dev.maratonajava.javacore.Imodificadorfinal.test;

import ballao.dev.maratonajava.javacore.Imodificadorfinal.dominio.Carro;

public class CarroTets {
    public static void main(String[] args) {
        Carro carro = new Carro();

        System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(carro.getCOMPRADOR());
    }
}
