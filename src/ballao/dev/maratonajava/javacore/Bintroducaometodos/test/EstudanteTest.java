package ballao.dev.maratonajava.javacore.Bintroducaometodos.test;

import ballao.dev.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import ballao.dev.maratonajava.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante01.nome = "Midoriya";
        estudante01.idade = 15;
        estudante01.sexo = 'M';

        estudante02.nome = "Sakura";
        estudante02.idade = 16;
        estudante02.sexo = 'F';

        impressora.imprimir(estudante01);
        impressora.imprimir(estudante02);

        // Usando o metodo direto da classe com this
        estudante01.imprimir();
        estudante02.imprimir();
    }
}
