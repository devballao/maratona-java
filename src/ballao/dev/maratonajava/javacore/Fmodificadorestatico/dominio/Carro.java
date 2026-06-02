package ballao.dev.maratonajava.javacore.Fmodificadorestatico.dominio;

public class Carro {
    private String nome;
    private double velocidadeMaxima;
    private static double velocidadeLimite = 250;

    // CONSTRUCTOR
    public Carro(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    // METHODS
    public void imprime() {
        System.out.println(this.nome);
    }

    public static void alterarVerlocidadeLimite(double novaVelocidadeLimite) {
        Carro.velocidadeLimite = novaVelocidadeLimite;
    }

    // SETTERS
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public static void setVelocidadeLimite(double velocidadeLimite) {
        Carro.velocidadeLimite = velocidadeLimite;
    }

    // GETTERS
    public String getNome() {
        return nome;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public static double getVelocidadeLimite() {
        return velocidadeLimite;
    }

    @Override
    public String toString() {
        return "-------------" +
                "\nNome: " + nome +
                "\nVelocidade Máxima: " + velocidadeMaxima +
                "\nVelocidade Limite: " + velocidadeLimite;
    }
}
