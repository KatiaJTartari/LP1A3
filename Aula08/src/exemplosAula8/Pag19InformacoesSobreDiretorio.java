package exemplosAula8;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Pag19InformacoesSobreDiretorio {

	public static void main(String[] args) {
		// Cria um objeto para referenciar o diretório.
		File dir = new File("C:\\Livro");
		if (dir.exists()) { // Verifica se o diretório existe.
			Calendar cal = Calendar.getInstance(); // Cria um objeto Calendar.
			// Atribui ao objeto Calendar a data e a hora da última modificação no diretório.
			cal.setTimeInMillis(dir.lastModified());
			// Obtém a data armazenada no objeto Calendar no formato "dd/MM/yyyy HH:mm:ss".
			String dataHora = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(cal.getTime());
			
			// Imprime as informações do diretório.
			System.out.println("Última Modificação: " + dataHora);
			System.out.println("Caminho: " + dir.getPath());
			System.out.println("Diretório Pai: " + dir.getParent());
			
			// Retorna apenas os arquivos e diretórios imediatamente abaixo do diretório informado.
			System.out.println("Arquivos e Diretórios Existentes: ");
			for (String a : dir.list())
				System.out.println(a);
			System.out.println("Arquivos e Diretórios Existentes (com caminho): ");
			for (File a : dir.listFiles())
				System.out.println(a);
		} else
			System.out.println("O diretório não existe!");
			
	}
}
