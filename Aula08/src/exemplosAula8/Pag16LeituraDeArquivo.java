package exemplosAula8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Pag16LeituraDeArquivo {

	public static void main(String[] args) {
		try {
			// Abre o arquivo especificado para a opera��o de leitura.
			FileReader fr = new FileReader("C:\\Testes\\teste.txt");
			// Cria um buffer para realizar as opera��es de leitura no arquivo.
			BufferedReader br = new BufferedReader(fr);
			System.out.println("Arquivo aberto!");
			String linha;
			while ((linha = br.readLine()) != null) // L� uma linha do arquivo.
				System.out.println(linha);
			br.close(); // Fecha o arquivo.
			System.out.println("Arquivo fechado!");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}
}
