package exemplosAula7;

import java.util.ArrayList;

// Este exemplo serve também para LinkedList, bastando incluir: import java.util.LikedList.

public class ExemploPag12_ArrayList2_E_LinkedList {

	public static void main(String[] args) {
		// Cria uma lista de objetos ArrayList vazia.
		ArrayList<String> alunos = new ArrayList<>();
		
		// Adiciona os elementos à lista.
		alunos.add("João");
		alunos.add("Maria");
		alunos.add("Pedro");
		alunos.add("Carlos");  
		
		alunos.set(2, "Julia"); // Substitui o elemento "Pedro" por "Julia".
		System.out.println(alunos); // Imprime os elementos da lista.
		
		if (alunos.contains("Julia")) // Verifica se a lista contém o elemento "Julia".
		System.out.println("A lista contém a aluna Julia.");
						
		// Retorna a posição da 1ª ocorrência do elemento "Maria".
		System.out.println("Posição da 1ª ocorrência de elemento'Maria': " + alunos.indexOf("Maria"));
		
		// Retorna a posição da última ocorrência do elemento "Carlos".
		System.out.println("Posição da última ocorrência de elemento'Carlos': " + alunos.lastIndexOf("Carlos"));
		
		if (alunos.isEmpty()) // Verifica se a lista está vazia.
		System.out.println("A lista está vazia.");
		else
			System.out.println("A lista não está vazia.");
		
	}
}
