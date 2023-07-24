import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ArmazenamentoMySQL {
    private Connection conexao;

    public ArmazenamentoMySQL() {
        try {
            String url = "jdbc:mysql://localhost:3306/meu_banco_dados";
            String usuario = "usuario";
            String senha = "senha";
            conexao = DriverManager.getConnection(url, usuario, senha);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
