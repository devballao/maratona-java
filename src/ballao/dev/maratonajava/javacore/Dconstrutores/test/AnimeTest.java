package ballao.dev.maratonajava.javacore.Dconstrutores.test;

import ballao.dev.maratonajava.javacore.Dconstrutores.dominio.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime = new Anime("TV"
                , "Akudama Drive"
                , 12
                , "Ação, Sci-fi"
                , "Production I.G");

        System.out.println(anime);
    }
}
