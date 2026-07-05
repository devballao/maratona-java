package ballao.dev.maratonajava.javacore.Nexecoes.exceptio.test;

import ballao.dev.maratonajava.javacore.Nexecoes.dominio.LoginInvalidoExeption;

import java.util.Scanner;

public class LoginInvalidoExeptionTest01 {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoExeption e) {
            throw new RuntimeException(e);
        }
    }

    private static void logar() throws LoginInvalidoExeption {
        Scanner sc = new Scanner(System.in);
        String username = "Goku";
        String password = "ssj";

        System.out.println("Digite o username: ");
        String usernameDigitado = sc.nextLine();
        System.out.println("Digite o password: ");
        String passwordDigitado = sc.nextLine();

        if (username.equals(usernameDigitado) && password.equals(passwordDigitado)) {
            System.out.println("Login realizado com sucesso");
        } else {
            throw new LoginInvalidoExeption("Usuario ou senha invalido");
        }
    }
}
