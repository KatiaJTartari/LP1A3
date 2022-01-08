package exemplosAula7;

import java.util.HashSet;

public class Exemplopag20_HashSet {

	public static void main(String[] args) {
		// Cria um conjunto de objetos HashSet vazio.
		HashSet<String> alunos = new HashSet<>();
		
		/* HashSet e TreeSet também podem ser inicializados já em sua declaração por meio da 
		classe Arrays. Sendo necessário: import java.util.Arrays.
		HashSet<String> alunos = new HashSet<>(Arrays.asList("João", "Maria", "Pedro", "Carlos")); */
		
		// Adiciona os elementos ao conjunto.
		alunos.add("João");
		alunos.add("Maria");
		alunos.add("Pedro");
		alunos.add("João"); // Tentando adicionar o elemento "João" novamente.
		alunos.add("Carlos");  
		// Os alunos não são armazenados em ordem alfabética no conjunto.
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
				
		// Os alunos não são armazenados em ordem alfabética no conjunto.
		System.out.println(alunos); // Imprime os elementos do conjunto.		
        
	}
}
