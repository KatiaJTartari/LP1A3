package exemplosAula8;

import java.io.File;

public class Pag10ExclusaoDeDiretorio {

	public static void main(String[] args) {
		// Cria um objeto para referenciar o diret�rio a ser exclu�do (Subtestes).
		File dir = new File("C:\\Testes\\Subtestes");
		if (dir.exists()) { // Verifica se o diret�rio existe.
			// Exclui o diret�rio recebido no construtor da classe File.
			if (dir.delete()) // Retorna true ou false.
				System.out.println("Diret�rio exclu�do!");
		    else
			  System.out.println("O diret�rio n�o est� vazio!");
		} else 
			System.out.println("O caminho ou o diret�rio n�o existe!");
	}
}
