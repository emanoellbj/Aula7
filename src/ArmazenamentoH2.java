import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.List;

public class ArmazenamentoH2 implements Armazenamento {
    private Connection connection;

    public ArmazenamentoH2() {
        try {
            // Carrega o driver JDBC do H2 e cria a conexão com o banco de dados
            Class.forName("org.h2.Driver");
            connection = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test", "sa", "");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

	@Override
	public void salvarExpressao(String id, String expressao) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void salvarOperacao(String id, Operacao operacao) {
        try (PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO operacoes (id, operacao) VALUES (?, ?)")) {
            preparedStatement.setString(1, id);
            preparedStatement.setObject(2, operacao, Types.OTHER);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
	}

	@Override
	public void salvarResultado(String id, int resultado) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String recuperarExpressao(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Operacao recuperarOperacao(String id) {
        try (PreparedStatement preparedStatement = connection.prepareStatement("SELECT operacao FROM operacoes WHERE id = ?")) {
            preparedStatement.setString(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
            	return  (Operacao) resultSet.getObject("operacao"); 
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
	}

	@Override
	public int recuperarResultado(String id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<String> listarExpressoes() {
		// TODO Auto-generated method stub
		return null;
	}

}
