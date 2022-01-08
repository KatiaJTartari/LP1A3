package exemplosAula7;

import java.util.HashSet;

public class Exemplopag20_HashSet {

	public static void main(String[] args) {
		// Cria um conjunto de objetos HashSet vazio.
		HashSet<String> alunos = new HashSet<>();
		
		/* HashSet e TreeSet tamb�m podem ser inicializados j� em sua declara��o por meio da 
		classe Arrays. Sendo necess�rio: import java.util.Arrays.
		HashSet<String> alunos = new HashSet<>(Arrays.asList("Jo�o", "Maria", "Pedro", "Carlos")); */
		
		// Adiciona os elementos ao conjunto.
		alunos.add("Jo�o");
		alunos.add("Maria");
		alunos.add("Pedro");
		alunos.add("Jo�o"); // Tentando adicionar o elemento "Jo�o" novamente.
		alunos.add("Carlos");  
		// Os alunos n�o s�o armazenados em ordem alfab�tica no conjunto.
		System.out.println(alunos); // Imprime os elementos do conjunto.
		
		alunos.remove("Pedro"); // Remove o elemento "Pedro" do conjunto.
		
		if (alunos.isEmpty()) // Verifica se o conjunto est� vazio.
			System.out.println("O conjunto est� vazio.");
			else
				System.out.println("O conjunto n�o est� vazio.");
		
		if (alunos.contains("Maria")) // Verifica se o conjunto cont�m o elemento "Maria".
			System.out.println("O conjunto cont�m cont�m a aluna Maria.");	
		
		// Retorna o n�mero de elementos contidos no conjunto.
		System.out.println("N�mero de alunos: " + alunos.size());
				
		// Os alunos n�o s�o armazenados em ordem alfab�tica no conjunto.
		System.out.println(alunos); // Imprime os elementos do conjunto.		
        
	}
}
