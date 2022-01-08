package exemplosAula8;

import java.io.File;

public class Pag10ExclusaoDeDiretorio {

	public static void main(String[] args) {
		// Cria um objeto para referenciar o diretório a ser excluído (Subtestes).
		File dir = new File("C:\\Testes\\Subtestes");
		if (dir.exists()) { // Verifica se o diretório existe.
			// Exclui o diretório recebido no construtor da classe File.
			if (dir.delete()) // Retorna true ou false.
				System.out.println("Diretório excluído!");
		    else
			  System.out.println("O diretório não está vazio!");
		} else 
			System.out.println("O caminho ou o diretório não existe!");
	}
}
