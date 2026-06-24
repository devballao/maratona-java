package ballao.dev.maratonajava.javacore.Mpolimorfismo.servico;

import ballao.dev.maratonajava.javacore.Mpolimorfismo.repositorio.Repositorio;

public class RepositorioArquivo implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em arquivo");
    }
}
