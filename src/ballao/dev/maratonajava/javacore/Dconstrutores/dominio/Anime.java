package ballao.dev.maratonajava.javacore.Dconstrutores.dominio;

public class Anime {
    private String tipo;
    private String nome;
    private int episodios;
    private String genero;
    private String studio;

    // CONSTRUCTORS
    public Anime(String tipo, String nome, int episodios, String genero) {
        this();
        this.tipo = tipo;
        this.nome = nome;
        this.episodios = episodios;
        this.genero = genero;
    }

    public Anime(String tipo, String nome, int episodios, String genero, String studio) {
        this(tipo, nome, episodios, genero);
        this.studio = studio;
    }

    public Anime() {

    }

    // METHODS
    public void init(String tipo, String nome, int episodios) {
        this.tipo = tipo;
        this.nome = nome;
        this.episodios = episodios;
    }

    public void init(String tipo, String nome, int episodios, String genero) {
        this.init(tipo, nome, episodios);
        this.genero = genero;
    }

    // GETTERS

    public String getTipo() {
        return tipo;
    }

    public int getEpisodios() {
        return episodios;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    // SETTERS

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Nome: " + nome +
                "\nTipo: " + tipo +
                "\nEpisodios: " + episodios +
                "\nGenero: " + genero +
                "\nStudio: " + studio;
    }
}
