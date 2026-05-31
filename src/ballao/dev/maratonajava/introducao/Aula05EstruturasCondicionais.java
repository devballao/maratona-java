package ballao.dev.maratonajava.introducao;

public class Aula05EstruturasCondicionais {
    public static void main(String[] args) {
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

        // Switch
        // Imprimir o dia da semana considerando o domingo como dia 1
        byte dia = 5;
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda faixa");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Dia inválido");
        }

        // Exercicio com switch
        /*
        * Dado os valores de 1 a 7, improma se é dia últio ou final de semana
        * considerando 1 como  domingo
        */
        switch (dia) {
            case 1:
            case 7:
                System.out.println("Final de semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia útil");
                break;
            default:
                System.out.println("Dia inválido");
        }
    }
}
