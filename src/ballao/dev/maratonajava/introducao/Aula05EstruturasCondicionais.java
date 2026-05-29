package ballao.dev.maratonajava.introducao;

public class Aula05EstruturasCondicionais {
    static void main(String[] args) {
        int idade = 17;
        boolean isAutorizadoComprarBebidaAlcoolica = idade >= 18;
        if (isAutorizadoComprarBebidaAlcoolica) {
            System.out.println("Pode comprar bebida alcoólica");
        } else {
            System.out.println("Não pode comprar bebida alcoólica");
        }

        int hora = 20;
        if (hora < 12) {
            System.out.println("Bom dia");
        } else if (hora < 18) {
            System.out.println("Boa tarde");
        } else {
            System.out.println("Boa noite");
        }


        // Doar se salario > 5000
        double salario = 3000.00;
        String mensagemDoar = "Vou doar 500 para o DevDojo.";
        String mensagemNaoDoar = "Ainda não tenho condições de doar, mas vou ter!";
        String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;
        System.out.println(resultado);

        // Exercicio
        double salarioAtual = 70000.00;
        double primeiraFaixa = 9.70 / 100;
        double SegundaFaixa = 37.35 / 100;
        double TerceiraFaixa = 49.50 / 100;
        double valorImposto = 0.0;

        if (salarioAtual <= 34712.00) {
            valorImposto = salarioAtual * primeiraFaixa;
        } else if (salarioAtual >= 34713.00 && salarioAtual <= 68507.00) {
            valorImposto = salarioAtual * SegundaFaixa;
        } else {
            valorImposto = salarioAtual * TerceiraFaixa;
        }
        System.out.println("Valor do imposto: " + valorImposto);
    }
}
