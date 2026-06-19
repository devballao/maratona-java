package ballao.dev.maratonajava.javacore.Kclassesabstratas.dominio;

public abstract class Funcionario {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        calcularBonificacao();
    }

    public abstract void calcularBonificacao();
}
