package exemplosAula2;

import java.util.Arrays;

public class ExemploPagina19 {

	public static void main(String[] args) {
		
//Laço de Repetição Não Controlado por Índice
		
		String[][] pessoas = { {"João", "36"}, {"Maria", "28"}, {"Pedro", "45"} };
		
		for (String[] p : pessoas) //Trata cada linha da matriz como um vetor unidimensional.
			System.out.println(Arrays.toString(p));

	}

}
