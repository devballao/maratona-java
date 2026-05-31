package ballao.dev.maratonajava.introducao;

public class Aula07Arrays03 {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};

        for (int num : numeros) {
            if (num > 3) {
                break;
            } else {
                System.out.println(num);
            }
        }
    }
}
