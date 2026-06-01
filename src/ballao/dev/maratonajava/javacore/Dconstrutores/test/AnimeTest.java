package ballao.dev.maratonajava.javacore.Dconstrutores.test;

import ballao.dev.maratonajava.javacore.Dconstrutores.dominio.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime = new Anime("TV", "Akudama Drive", 12, "Ação, Sci-fi");
        Anime anime2 = new Anime();

        System.out.println(anime);
        System.out.println(anime2);
    }
}
