package ballao.dev.maratonajava.javacore.Gassociacao.test;

import ballao.dev.maratonajava.javacore.Gassociacao.dominio.Jogador;
import ballao.dev.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTeste {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pelé");
        Jogador jogador2 = new Jogador("Romário");
        Jogador jogador3 = new Jogador("Cafu");
        Jogador[] jogadores = {jogador1, jogador2, jogador3};

        Time time = new Time("Brasil", jogadores);
        time.imprimir();

        jogador1.imprimir();
    }
}
