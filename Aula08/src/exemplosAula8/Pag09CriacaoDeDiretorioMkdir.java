package exemplosAula8;

import java.io.File;

public class Pag09CriacaoDeDiretorioMkdir {

	public static void main(String[] args) {
		// CRIA��O DE DIRET�RIO - MKDIR
		// Cria um objeto para referenciar o diret�rio a ser criado.
		File dir = new File("C:\\Testes\\Subtestes");
		if (!dir.exists()) { // Verifica se o diret�rio n�o existe.
			// Cria o diret�rio Subtestes (os diret�rios anteriores precisam existir),
			// caso contr�rio, o diret�rio n�o � criado, nem � gerada uma exce��o.
			if (dir.mkdir()) // Retorna true ou false.
				System.out.println("Diret�rio criado!");
		} else
			System.out.println("O diret�rio j� existe!");

	}
}
