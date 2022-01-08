package exercicio1ProfessorResolucao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Localizacao {
	private static List<String> textos = new ArrayList<>();

	public static void defineIdioma(String arquivoLocalizacao) {
		try {
			BufferedReader br = new BufferedReader(new FileReader(arquivoLocalizacao));
			String linha;
			while ((linha = br.readLine()) != null) // Lê uma linha do arquivo.
				textos.add(linha);
			br.close(); // Fecha o arquivo.
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	public static List<String> getTextos() {
		return textos;
	}

}
