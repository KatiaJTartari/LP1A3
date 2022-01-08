package exemplosAula8;

import java.io.File;
import java.io.IOException;

public class Pag05CriacaoDeArquivo {

	public static void main(String[] args) {
		// Cria um objeto para referenciar o arquivo a ser criado.
		File arq = new File("C:\\Testes\\teste.txt");
		/* Aqui, a 1� barra invertida serve para indicar que a 2� barra faz parte da string,
		  e n�o de uma sequ�ncia de escape. */
		
		if (!arq.exists()) { // Verifica se o arquivo n�o existe.
			// Cria o arquivo recebido no construtor da classe File.
			try {
				if (arq.createNewFile()) // Retorna true ou false.
					System.out.println("Arquivo criado!");
			} catch (IOException e) { 
				/* O m�todo createNewFile exige o lan�amento da exce��o IOException para
				   tratar erros de entrada e sa�da de dados, por exemplo um caminho inv�lido. */
				System.out.println(e.getMessage());
			}
		}else
			System.out.println("O arquivo j� existe!");
			
	}
}
