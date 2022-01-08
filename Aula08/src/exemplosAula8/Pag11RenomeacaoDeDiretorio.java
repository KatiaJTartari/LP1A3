package exemplosAula8;

import java.io.File;

public class Pag11RenomeacaoDeDiretorio {

	public static void main(String[] args) {
		// Cria um objeto para referenciar o diretório a ser renomeado (Testes).
		File dir = new File("C:\\Testes"); // Nome original
		File dir2 = new File("C:\\Testes2"); // Novo nome 
		if (dir.exists()) { // Verifica se o diretório existe.
			// Renomeia o diretório para o nome recebido no método renameTo.
			if (dir.renameTo(dir2)) // Retorna true ou false.
				System.out.println("Diretório renomeado!");
			else
				System.out.println("O caminho de destino não existe ou o diretório" 
						           + " de origem não está vazio");
			} else
				System.out.println("O caminho ou o diretório de origem não existe!");
	}
}
