package exemplosAula7;

import java.util.TreeSet;

public class ExemploPag23_TreeSet2 {

	public static void main(String[] args) {
		// Cria um conjunto de objetos TreeSet vazio.
		TreeSet<String> alunos = new TreeSet<>();
		
		// Adiciona os elementos ao conjunto.
		alunos.add("Jo�o");
		alunos.add("Maria");
		alunos.add("Pedro");
		alunos.add("Carlos"); 
		alunos.add("Raquel"); 
		// Os alunos s�o armazenados em ordem alfab�tica no conjunto.
		System.out.println(alunos); // Imprime os elementos do conjunto.

		// Imprime o 1� elemento do conjunto.
		System.out.println("1� aluno do conjunto: " + alunos.first());
		
		// Imprime o �ltimo elemento do conjunto.
		System.out.println("�ltimo aluno do conjunto: " + alunos.last());
		
		// Imprime os elementos antecessores do elemento "Maria".
		System.out.println("Alunos antecessores de Maria: " + alunos.headSet("Maria"));
		
		// Imprime o elemento "Maria" e seus sucessores.
		System.out.println("Maria e seus alunos sucessores: " + alunos.tailSet("Maria"));
		
		// Imprime o subconjunto que vai do elemento "Jo�o" at� o  antecessor de "Pedro".
		System.out.println("Subconjunto: " + alunos.subSet("Jo�o", "Pedro"));
		
	}
}
