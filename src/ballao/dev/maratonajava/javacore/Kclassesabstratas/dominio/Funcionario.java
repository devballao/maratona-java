package ballao.dev.maratonajava.javacore.Kclassesabstratas.dominio;

public abstract class Funcionario extends Pessoa{
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        calcularBonificacao();
    }

    @Override
    public void imprimir() {
        System.out.println("imprimindo...");
    }

    public abstract void calcularBonificacao();
}
