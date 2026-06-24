package ballao.dev.maratonajava.javacore.Mpolimorfismo.test;

import ballao.dev.maratonajava.javacore.Mpolimorfismo.repositorio.Repositorio;
import ballao.dev.maratonajava.javacore.Mpolimorfismo.servico.RepositorioBancoDeDaros;

public class RepositorioTest {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioBancoDeDaros();
        repositorio.salvar();
    }
}
