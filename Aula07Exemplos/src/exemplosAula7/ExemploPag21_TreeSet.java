package exemplosAula7;

import java.util.TreeSet;

public class ExemploPag21_TreeSet {

	public static void main(String[] args) {
		// Cria um conjunto de objetos TreeSet vazio.
		TreeSet<String> alunos = new TreeSet<>();
				
		/* HashSet e TreeSet também podem ser inicializados já em sua declaração por meio da 
		classe Arrays. Sendo necessário: import java.util.Arrays.
		TreeSet<String> alunos = new TreeSet<>(Arrays.asList("João", "Maria", "Pedro", "Carlos"));  */
		
		// Adiciona os elementos ao conjunto.
		alunos.add("João");
		alunos.add("Maria");
		alunos.add("Pedro");
		alunos.add("João"); // Tentando adicionar o elemento "João" novamente.
		alunos.add("Carlos");  
		// Os alunos são armazenados em ordem alfabética no conjunto.
		System.out.println(alunos); // Imprime os elementos do conjunto.
				
		alunos.remove("Pedro"); // Remove o elemento "Pedro" do conjunto.
				
		if (alunos.isEmpty()) // Verifica se o conjunto está vazio.
			System.out.println("O conjunto está vazio.");
		else
			System.out.println("O conjunto não está vazio.");
				
		if (alunos.contains("Maria")) // Verifica se o conjunto contém o elemento "Maria".
			System.out.println("O conjunto contém contém a aluna Maria.");	
				
		// Retorna o número de elementos contidos no conjunto.
		System.out.println("Número de alunos: " + alunos.size());
						
		// Os alunos são armazenados em ordem alfabética no conjunto.
		System.out.println(alunos); // Imprime os elementos do conjunto.

	}
}
