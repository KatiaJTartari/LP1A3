package exemplosAula8;

import java.io.File;

public class Pag06ExclusaoDeArquivo {

	public static void main(String[] args) {
		// Cria um objeto para referenciar o arquivo a ser excluído.
		File arq = new File("C:\\Testes\\teste2.txt");
		if (arq.exists()) { // Verifica se o arquivo existe.
			// Exclui o arquivo recebido no construtor da classe File.
			if (arq.delete()) // Retorna true ou false.
				System.out.println("Arquivo excluído!");
		} else
			System.out.println("O arquivo não existe!");
	}
}
