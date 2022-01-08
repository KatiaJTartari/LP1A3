package exemplosAula8;

import java.io.File;

public class Pag08MovimentacaoDeArquivo {

	public static void main(String[] args) {
		// Cria um objeto para referenciar o arquivo a ser movido.
		File arq = new File("C:\\Testes\\teste.txt"); // Local original
		File arq2 = new File("C:\\Testes\\Subtestes\\teste.txt"); // Novo local 
		if (arq.exists()) { // Verifica se o arquivo existe.
			// Move o arquivo para o local recebido no método renameTo.
			if (arq.renameTo(arq2)) // Retorna true ou false.
				System.out.println("Arquivo movido!");
			} else
			System.out.println("O arquivo não existe!");
		
	}
}

