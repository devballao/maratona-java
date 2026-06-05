package ballao.dev.maratonajava.javacore.Gassociacao.test;

import ballao.dev.maratonajava.javacore.Gassociacao.dominio.Escola;
import ballao.dev.maratonajava.javacore.Gassociacao.dominio.Professor;

public class EscolaTest {
    public static void main(String[] args) {
        Professor professor1 = new Professor("João");
        Professor professor2 = new Professor("Maria");
        Professor professor3 = new Professor("Carlos");
        Escola escola = new Escola("Escola Estadual", new Professor[]{professor1, professor2, professor3});

        escola.imprimir();
    }
}
