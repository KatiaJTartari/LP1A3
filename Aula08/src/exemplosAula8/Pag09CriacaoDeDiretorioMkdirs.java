package exemplosAula8;

import java.io.File;

public class Pag09CriacaoDeDiretorioMkdirs {

	public static void main(String[] args) {
		// CRIAÇÃO DE DIRETÓRIO - MKDIRS
	    // Cria um objeto para referenciar o(s) diretório(s) a ser(em) criado(s).
		File dir = new File("C:\\Testes\\Subtestes");
		if (!dir.exists()) { // Verifica se o diretório não existe.
		    // Cria o diretório Subtestes, e os diretórios anteriores caso não existam.
			if (dir.mkdirs()) // Retorna true ou false.
				System.out.println("Diretório(s) criado(s)!");
		} else
			System.out.println("O diretório já existe!");

	}
}
