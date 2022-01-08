package exemplosAula7;

import java.util.LinkedList;

public class ExemploPag16_LinkedList_Pilha {

	public static void main(String[] args) {
		// Cria uma pilha de objetos LinkedList vazia.
		LinkedList<String> pilha = new LinkedList<>();
				
		// Adiciona os elementos � pilha.
		pilha.add("Jo�o");
		pilha.add("Maria");
		pilha.add("Pedro");
		pilha.add("Carlos");  
				
		// Adiciona o elemento "Julia" no topo da pilha (�ltima posi��o).
		pilha.addLast("Julia");
		System.out.println(pilha); // Imprime os elementos da pilha.
				
		// Retorna o elemento que est� no topo da pilha (�ltimo elemento).
		System.out.println("Elemento que est� no topo da pilha: " + pilha.peekLast());
				
		pilha.pollLast(); // Remove o elemento que est� no topo da pilha (�ltimo elemento).
	    System.out.println(pilha); // Imprime os elementos da pilha.
	}
}
