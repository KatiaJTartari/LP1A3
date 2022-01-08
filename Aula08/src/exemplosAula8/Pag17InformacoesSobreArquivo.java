package exemplosAula8;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Pag17InformacoesSobreArquivo {

	public static void main(String[] args) {
		// Cria um objeto para referenciar o arquivo.
		File arq = new File("C:\\Testes\\teste.txt");
		if (arq.exists()) { // Verifica se o arquivo existe.
			Calendar cal = Calendar.getInstance(); // Cria um objeto Calendar.
			// Atribui ao objeto Calendar a data e a hora da última modificação no arquivo.
			cal.setTimeInMillis(arq.lastModified());
			// Obtém a data armazenada no objeto Calendar no formato "dd/MM/yyyy HH:mm:ss".
			String dataHora = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(cal.getTime());
			
			// Imprime as informações do arquivo.
			System.out.println("Última Modificação: " + dataHora);
			System.out.println("Caminho: " + arq.getPath());
			System.out.println("Diretório Pai: " + arq.getParent());
			System.out.println("Tamanho: " + arq.length() + "bytes");
		} else
			System.out.println("O arquivo não existe!");

	}
}
