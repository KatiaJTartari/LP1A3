package exemplosAula8;

import java.io.File;

public class Pag09CriacaoDeDiretorioMkdirs {

	public static void main(String[] args) {
		// CRIA��O DE DIRET�RIO - MKDIRS
	    // Cria um objeto para referenciar o(s) diret�rio(s) a ser(em) criado(s).
		File dir = new File("C:\\Testes\\Subtestes");
		if (!dir.exists()) { // Verifica se o diret�rio n�o existe.
		    // Cria o diret�rio Subtestes, e os diret�rios anteriores caso n�o existam.
			if (dir.mkdirs()) // Retorna true ou false.
				System.out.println("Diret�rio(s) criado(s)!");
		} else
			System.out.println("O diret�rio j� existe!");

	}
}
