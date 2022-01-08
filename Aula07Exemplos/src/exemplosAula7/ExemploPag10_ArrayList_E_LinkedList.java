package exemplosAula7;

import java.util.ArrayList;

/* Este exemplo serve também para LinkedList, bastando incluir: import java.util.LikedList e
  colocar LinkedList<String> alunos = new LinkedList<>() .*/

public class ExemploPag10_ArrayList_E_LinkedList {

	public static void main(String[] args) {
		// Cria uma lista de objetos ArrayList vazia.
		ArrayList<String> alunos = new ArrayList<>();
		
		/* ArraysList e LinkedLists também podem ser inicializados já em sua declaração por meio da 
		classe Arrays. Sendo necessário: import java.util.Arrays.
		ArrayList<String> alunos = new ArrayList<>(Arrays.asList("João", "Maria", "Pedro", "Carlos"));*/
		
		// Adiciona os elementos à lista.
		alunos.add("João");
		alunos.add("Maria");
		alunos.add("Pedro");
		alunos.add("Carlos");  
		// Adicionando o elemento "João" novamente, agora na posição 2.
		alunos.add(2, "João");
		System.out.println(alunos); // Imprime os elementos da lista.
		
		alunos.remove("Pedro"); // Remove o elemento "Pedro" da lista.
		alunos.remove(0); // Remove o elemento que está na posição zero na lista.
		System.out.println(alunos); // Imprime os elementos da lista.
		
		// Obtem o elemento que está na posição 1 na lista.
		System.out.println("2º aluno: " + alunos.get(1));
		
		// Retorna o número de elementos contidos na lista.
		System.out.println("Número de alunos: " + alunos.size());
	}
}
