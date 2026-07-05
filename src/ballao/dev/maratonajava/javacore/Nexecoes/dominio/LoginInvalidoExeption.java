package ballao.dev.maratonajava.javacore.Nexecoes.dominio;

public class LoginInvalidoExeption extends Exception {
    public LoginInvalidoExeption() {
        super("Login Invalido");
    }

    public LoginInvalidoExeption(String message) {
        super(message);
    }
}
