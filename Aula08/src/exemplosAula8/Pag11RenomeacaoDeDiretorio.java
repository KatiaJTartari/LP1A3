package exemplosAula8;

import java.io.File;

public class Pag11RenomeacaoDeDiretorio {

	public static void main(String[] args) {
		// Cria um objeto para referenciar o diret�rio a ser renomeado (Testes).
		File dir = new File("C:\\Testes"); // Nome original
		File dir2 = new File("C:\\Testes2"); // Novo nome 
		if (dir.exists()) { // Verifica se o diret�rio existe.
			// Renomeia o diret�rio para o nome recebido no m�todo renameTo.
			if (dir.renameTo(dir2)) // Retorna true ou false.
				System.out.println("Diret�rio renomeado!");
			else
				System.out.println("O caminho de destino n�o existe ou o diret�rio" 
						           + " de origem n�o est� vazio");
			} else
				System.out.println("O caminho ou o diret�rio de origem n�o existe!");
	}
}
