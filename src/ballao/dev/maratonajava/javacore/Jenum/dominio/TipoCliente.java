package ballao.dev.maratonajava.javacore.Jenum.dominio;

public enum TipoCliente {
    PESSOA_FISICA(1, "Pessoa Fisica"),
    PESSOA_JURIDICA(2, "Pessoa Juridica");

    public final int VALOR;
    public final String NOME_RELATORIO;

    public static TipoCliente tipoClientePorNomeRelatorio(String NOME_RELATORIO) {
        for (TipoCliente tipoCliente : values()) {
            if (tipoCliente.NOME_RELATORIO.equals(NOME_RELATORIO)) {
                return tipoCliente;
            }
        }
        return null;
    }

    TipoCliente(int valor, String nomeRelatorio) {
        this.VALOR = valor;
        this.NOME_RELATORIO = nomeRelatorio;
    }
}
