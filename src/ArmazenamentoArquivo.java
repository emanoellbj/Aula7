import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class ArmazenamentoArquivo implements Armazenamento {
	private String diretorio = "./";

	@Override
	public void salvarExpressao(String id, String expressao) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void salvarOperacao(String id, Operacao operacao) {
		try (FileOutputStream fileOutputStream = new FileOutputStream(diretorio + id + "_operacao.obj");
				ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
			objectOutputStream.writeObject(operacao);
		} catch (IOException e) {
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
		try (FileInputStream fileInputStream = new FileInputStream(diretorio + id + "_operacao.obj");
				ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
			return (Operacao) objectInputStream.readObject();
		} catch (IOException | ClassNotFoundException e) {
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
