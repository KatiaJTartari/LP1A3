package exemplosAula7;

import java.util.LinkedList;

public class ExemploPag16_LinkedList_Pilha {

	public static void main(String[] args) {
		// Cria uma pilha de objetos LinkedList vazia.
		LinkedList<String> pilha = new LinkedList<>();
				
		// Adiciona os elementos à pilha.
		pilha.add("João");
		pilha.add("Maria");
		pilha.add("Pedro");
		pilha.add("Carlos");  
				
		// Adiciona o elemento "Julia" no topo da pilha (última posição).
		pilha.addLast("Julia");
		System.out.println(pilha); // Imprime os elementos da pilha.
				
		// Retorna o elemento que está no topo da pilha (último elemento).
		System.out.println("Elemento que está no topo da pilha: " + pilha.peekLast());
				
		pilha.pollLast(); // Remove o elemento que está no topo da pilha (último elemento).
	    System.out.println(pilha); // Imprime os elementos da pilha.
	}
}
