package ballao.dev.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salario;
    private double media;

    // SETERS
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSalario(double[] salario) {
        this.salario = salario;
    }

    // METHODS
    public void imprimeDados() {
        System.out.println("Nome:" + this.nome);
        System.out.println("Idade: " + this.idade);

        if (this.salario == null) {
            return;
        }

        for (double s : this.salario) {
            System.out.println("Salario: " + s);
        }
    }

    public void mediaSalario() {
        if (this.salario == null) {
            return;
        }

        media = 0;
        int tamanho = this.salario.length;

        for (double s : this.salario) {
            media += s;
        }
        media /= tamanho;
        System.out.println("Media salarial: " + media);
    }
}
