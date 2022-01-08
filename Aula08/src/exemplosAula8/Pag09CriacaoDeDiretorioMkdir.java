package exemplosAula8;

import java.io.File;

public class Pag09CriacaoDeDiretorioMkdir {

	public static void main(String[] args) {
		// CRIAÇÃO DE DIRETÓRIO - MKDIR
		// Cria um objeto para referenciar o diretório a ser criado.
		File dir = new File("C:\\Testes\\Subtestes");
		if (!dir.exists()) { // Verifica se o diretório não existe.
			// Cria o diretório Subtestes (os diretórios anteriores precisam existir),
			// caso contrário, o diretório não é criado, nem é gerada uma exceção.
			if (dir.mkdir()) // Retorna true ou false.
				System.out.println("Diretório criado!");
		} else
			System.out.println("O diretório já existe!");

	}
}
