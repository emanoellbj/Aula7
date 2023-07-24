
public class ArmazenamentoFactory {
    public static Armazenamento criarArmazenamento(String tipo) {
        if ("arquivo".equalsIgnoreCase(tipo)) {
            return new ArmazenamentoArquivo();
        } else if ("bancoDados".equalsIgnoreCase(tipo)) {
            return new ArmazenamentoBancoDados();
        } else {
            throw new IllegalArgumentException("Tipo de armazenamento inválido: " + tipo);
        }
    }
}