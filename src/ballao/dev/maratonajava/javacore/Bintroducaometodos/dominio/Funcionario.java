package ballao.dev.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salario;

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

        double total = 0;
        int tamanho = this.salario.length;
        double resultado = 0;

        for (double s : this.salario) {
            total += s;
        }
        resultado = total / tamanho;
        System.out.println("Media salarial: " + resultado);
    }
}
