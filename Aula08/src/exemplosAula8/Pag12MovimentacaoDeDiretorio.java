package exemplosAula8;

import java.io.File;

public class Pag12MovimentacaoDeDiretorio {

	public static void main(String[] args) {
		// Cria um objeto para referenciar o diretório a ser movido (Testes).
		File dir = new File("C:\\Testes"); // Local original
		File dir2 = new File("C:\\Fase1\\Testes"); // Novo local 
		if (dir.exists()) { // Verifica se o diretório existe.
			// Move o diretório para o local recebido no método renameTo.
			if (dir.renameTo(dir2)) // Retorna true ou false.
				System.out.println("Diretório movido!");
			else
				System.out.println("O caminho de destino não existe ou o diretório" 
						           + " de origem não está vazio");
			} else
				System.out.println("O caminho ou o diretório de origem não existe!");
			
	}
}
