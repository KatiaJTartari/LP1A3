package exemplosAula7;

import java.util.LinkedList;

public class ExemploPag15_LinkedList_Fila {

	public static void main(String[] args) {
		// Cria uma fila de objetos LinkedList vazia.
		LinkedList<String> fila = new LinkedList<>();
		
		// Adiciona os elementos � fila.
		fila.add("Jo�o");
		fila.add("Maria");
		fila.add("Pedro");
		fila.add("Carlos");  
		
		// Adiciona o elemento "Julia" na �ltima posi��o da fila.
		fila.addLast("Julia");
		System.out.println(fila); // Imprime os elementos da fila.
		
		// Retorna o 1� elemento da fila.
		System.out.println("1� elemento da fila: " + fila.peekFirst());
		
		fila.pollFirst(); // Remove o 1� elemento da fila.
		System.out.println(fila); // Imprime os elementos da fila.
	}
}
