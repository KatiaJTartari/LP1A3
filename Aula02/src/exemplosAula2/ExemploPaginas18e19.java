package exemplosAula2;

public class ExemploPaginas18e19 {

	public static void main(String[] args) {
		
		char[] elementos = { 'A', 'B', 'C', 'D', 'E' };
		
//Exemplo p�gina 18 imprime at� 3 elementos do vetor - La�o de Repeti��o Controlado por �ndice
		for (int i=0; i<3; i++)
			System.out.println("O valor do elemento � " + elementos[i]);
		
//Exemplo p�gina 19 imprime todos os elementos do vetor - La�o de Repeti��o N�o Controlado por �ndice
		for (char x : elementos)
			System.out.println("O valor do elemento � " + x);  

	}

}
