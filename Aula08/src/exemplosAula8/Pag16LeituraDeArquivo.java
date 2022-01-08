package exemplosAula8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Pag16LeituraDeArquivo {

	public static void main(String[] args) {
		try {
			// Abre o arquivo especificado para a operação de leitura.
			FileReader fr = new FileReader("C:\\Testes\\teste.txt");
			// Cria um buffer para realizar as operações de leitura no arquivo.
			BufferedReader br = new BufferedReader(fr);
			System.out.println("Arquivo aberto!");
			String linha;
			while ((linha = br.readLine()) != null) // Lê uma linha do arquivo.
				System.out.println(linha);
			br.close(); // Fecha o arquivo.
			System.out.println("Arquivo fechado!");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}
}
