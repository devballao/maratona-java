package ballao.dev.maratonajava.javacore.Csobrecargametodos.test;

import ballao.dev.maratonajava.javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("TV", "Akudama Drive", 12, "Ação, Sci-fi");

        System.out.println(anime);
    }
}
