package exemplosAula2;

public class ExemploPaginas18e19 {

	public static void main(String[] args) {
		
		char[] elementos = { 'A', 'B', 'C', 'D', 'E' };
		
//Exemplo página 18 imprime até 3 elementos do vetor - Laço de Repetição Controlado por Índice
		for (int i=0; i<3; i++)
			System.out.println("O valor do elemento é " + elementos[i]);
		
//Exemplo página 19 imprime todos os elementos do vetor - Laço de Repetição Não Controlado por Índice
		for (char x : elementos)
			System.out.println("O valor do elemento é " + x);  

	}

}
