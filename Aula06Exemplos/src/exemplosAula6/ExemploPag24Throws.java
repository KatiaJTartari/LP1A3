package exemplosAula6;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExemploPag24Throws {

	public static void main(String[] args) throws IOException {
		DataInputStream arq = null;
		try { // Lan�a a exce��o.
			// Abre a arquivo texto.
			arq = new DataInputStream(new FileInputStream("C:\\teste\\dados.txt"));
			System.out.println("Arquivo aberto!");
		} catch (FileNotFoundException e) { // Captura a exce��o.
			// Trata a exce��o.
			System.out.println("A opera��o retornou o seguinte erro: ");
			System.out.println(e.getMessage());
		} finally { // Executa o c�digo independemente se houve ou n�o exce��o.
			if (arq != null) {
				arq.close(); // Fecha o arquivo texto.
				System.out.println("Arquivo fechado!");
			} else
				System.out.println("Erro na abertura do arquivo!");
		}
	}
}
