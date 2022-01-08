package exemplosAula8;

import java.io.File;

public class Pag07RenomeacaoDeArquivo {

	public static void main(String[] args) {
		// Cria um objeto para referenciar o arquivo a ser renomeado.
		File arq = new File("C:\\Testes\\teste.txt"); // Nome original
		File arq2 = new File("C:\\Testes\\teste2.txt"); // Novo nome 
		if (arq.exists()) { // Verifica se o arquivo existe.
			// Renomeia o arquivo para o nome recebido no método renameTo.
			if (arq.renameTo(arq2)) // Retorna true ou false.
				System.out.println("Arquivo renomeado!");
		} else
			System.out.println("O arquivo não existe!");

	}
}
