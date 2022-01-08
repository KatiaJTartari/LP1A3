package exemplosAula7;

import java.util.ArrayList;

// Este exemplo serve tamb�m para LinkedList, bastando incluir: import java.util.LikedList.

public class ExemploPag12_ArrayList2_E_LinkedList {

	public static void main(String[] args) {
		// Cria uma lista de objetos ArrayList vazia.
		ArrayList<String> alunos = new ArrayList<>();
		
		// Adiciona os elementos � lista.
		alunos.add("Jo�o");
		alunos.add("Maria");
		alunos.add("Pedro");
		alunos.add("Carlos");  
		
		alunos.set(2, "Julia"); // Substitui o elemento "Pedro" por "Julia".
		System.out.println(alunos); // Imprime os elementos da lista.
		
		if (alunos.contains("Julia")) // Verifica se a lista cont�m o elemento "Julia".
		System.out.println("A lista cont�m a aluna Julia.");
						
		// Retorna a posi��o da 1� ocorr�ncia do elemento "Maria".
		System.out.println("Posi��o da 1� ocorr�ncia de elemento'Maria': " + alunos.indexOf("Maria"));
		
		// Retorna a posi��o da �ltima ocorr�ncia do elemento "Carlos".
		System.out.println("Posi��o da �ltima ocorr�ncia de elemento'Carlos': " + alunos.lastIndexOf("Carlos"));
		
		if (alunos.isEmpty()) // Verifica se a lista est� vazia.
		System.out.println("A lista est� vazia.");
		else
			System.out.println("A lista n�o est� vazia.");
		
	}
}
