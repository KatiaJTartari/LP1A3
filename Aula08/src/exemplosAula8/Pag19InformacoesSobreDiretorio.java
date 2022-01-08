package exemplosAula8;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Pag19InformacoesSobreDiretorio {

	public static void main(String[] args) {
		// Cria um objeto para referenciar o diret�rio.
		File dir = new File("C:\\Livro");
		if (dir.exists()) { // Verifica se o diret�rio existe.
			Calendar cal = Calendar.getInstance(); // Cria um objeto Calendar.
			// Atribui ao objeto Calendar a data e a hora da �ltima modifica��o no diret�rio.
			cal.setTimeInMillis(dir.lastModified());
			// Obt�m a data armazenada no objeto Calendar no formato "dd/MM/yyyy HH:mm:ss".
			String dataHora = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(cal.getTime());
			
			// Imprime as informa��es do diret�rio.
			System.out.println("�ltima Modifica��o: " + dataHora);
			System.out.println("Caminho: " + dir.getPath());
			System.out.println("Diret�rio Pai: " + dir.getParent());
			
			// Retorna apenas os arquivos e diret�rios imediatamente abaixo do diret�rio informado.
			System.out.println("Arquivos e Diret�rios Existentes: ");
			for (String a : dir.list())
				System.out.println(a);
			System.out.println("Arquivos e Diret�rios Existentes (com caminho): ");
			for (File a : dir.listFiles())
				System.out.println(a);
		} else
			System.out.println("O diret�rio n�o existe!");
			
	}
}
