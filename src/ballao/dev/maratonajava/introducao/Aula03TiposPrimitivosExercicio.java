package ballao.dev.maratonajava.introducao;
/*
* Exercícios
* 1. Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:
*
* Eu <nome>, morando no endereço <endereco>,
* confirmo que recebi o salário de <salario>, na data <data>.
*/
public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String nome = "Maria";
        String endereco = "Rua dos Bobos, 0";
        double salario = 2500.0;
        String dataRecebimentoSalario = "01/01/2024";
        String mensagem = "Eu " + nome + ", morando no endereço " + endereco + "confirmo que recebi o salário de "
                + salario + ", na data " + dataRecebimentoSalario + ".";

        System.out.println(mensagem);
    }
}
