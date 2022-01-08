package exemplosAula2;

//import java.util.Arrays;

public class ExemploPagina10 {

	public static void main(String[] args) {
		
		String[][] dados_alunos = new String[3][2];
		dados_alunos[0][0] = "João";
		dados_alunos[0][1] = "joao@gmail.com";
		dados_alunos[1][0] = "Maria";
		dados_alunos[1][1] = "maria@gmail.com";
		dados_alunos[2][0] = "Carlos"; 
		dados_alunos[2][1] = "carlos@gmail.com"; 
		
		// Outra forma de inicialização da matriz:
		/*String[][] dados_alunos = { {"João", "joao@gmail.com"},
				                    {"Maria", "maria@gmail.com"},
				                    {"Carlos", "carlos@gmail.com"}};*/
			
		
		
		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 2; j++)
			System.out.println(dados_alunos [i][j]);
		
//Ou Imprime com Laço de Repetição Não Controlado por Índice usando o: import java.util.Arrays
		/*for (String[] d_a : dados_alunos) //Trata cada linha da matriz como um vetor unidimensional.
			System.out.println(Arrays.toString(d_a));*/
	}
}



