package exemplosAula8;

import java.io.File;

public class Pag12MovimentacaoDeDiretorio {

	public static void main(String[] args) {
		// Cria um objeto para referenciar o diret�rio a ser movido (Testes).
		File dir = new File("C:\\Testes"); // Local original
		File dir2 = new File("C:\\Fase1\\Testes"); // Novo local 
		if (dir.exists()) { // Verifica se o diret�rio existe.
			// Move o diret�rio para o local recebido no m�todo renameTo.
			if (dir.renameTo(dir2)) // Retorna true ou false.
				System.out.println("Diret�rio movido!");
			else
				System.out.println("O caminho de destino n�o existe ou o diret�rio" 
						           + " de origem n�o est� vazio");
			} else
				System.out.println("O caminho ou o diret�rio de origem n�o existe!");
			
	}
}
