package exemplosAula8;

import java.io.File;
import java.io.IOException;

public class Pag05CriacaoDeArquivo {

	public static void main(String[] args) {
		// Cria um objeto para referenciar o arquivo a ser criado.
		File arq = new File("C:\\Testes\\teste.txt");
		/* Aqui, a 1ª barra invertida serve para indicar que a 2ª barra faz parte da string,
		  e não de uma sequência de escape. */
		
		if (!arq.exists()) { // Verifica se o arquivo não existe.
			// Cria o arquivo recebido no construtor da classe File.
			try {
				if (arq.createNewFile()) // Retorna true ou false.
					System.out.println("Arquivo criado!");
			} catch (IOException e) { 
				/* O método createNewFile exige o lançamento da exceção IOException para
				   tratar erros de entrada e saída de dados, por exemplo um caminho inválido. */
				System.out.println(e.getMessage());
			}
		}else
			System.out.println("O arquivo já existe!");
			
	}
}
