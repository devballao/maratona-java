package ballao.dev.maratonajava.introducao;

public class Aula08ArraysMultidimensionais01 {
    public static void main(String[] args) {
        // Fazer Array01 para os meses e Array02 para os dias
        int[][] dias = new int[3][3];
        dias[0][0] = 31;
        dias[0][1] = 28;
        dias[0][2] = 31;

        dias[1][0] = 31;
        dias[1][1] = 28;
        dias[1][2] = 31;

        System.out.println("Impromindo com for normal");
        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[i].length; j++) {
                System.out.println(dias[i][j]);
            }
        }

        System.out.println("Imprimindo com for each");
        for (int[] d : dias) {
            for (int i : d) {
                System.out.println(i);
            }
        }
    }
}
