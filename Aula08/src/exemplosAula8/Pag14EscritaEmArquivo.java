package exemplosAula8;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Pag14EscritaEmArquivo {

	public static void main(String[] args) {
		try {
			// Cria e abre o arquivo especificado para a opera��o de escrita.
			// Caso o arquivo j� exista, ele � sobrescrito.
			FileWriter fw = new FileWriter("C:\\Testes\\teste.txt");
			// Cria um buffer para realizar as opera��es de escrita no arquivo.
			BufferedWriter bw = new BufferedWriter(fw);
			System.out.println("Arquivo aberto!");
			for (int i = 0; i < 5; i++) // Escreve no arquivo.
				bw.write("Esta � a " + (i + 1) + "� linha do arquivo.\n");
			bw.close(); // Fecha o arquivo.
			System.out.println("Arquivo fechado!");

			// Acrescentando mais uma linha ao arquivo.
			fw = new FileWriter("C:\\Testes\\teste.txt", true);
			bw = new BufferedWriter(fw);
			bw.write("Esta � a �ltima linha do arquivo.\n");
			bw.close(); // Fecha o arquivo.
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}
}
