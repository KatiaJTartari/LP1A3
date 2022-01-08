package exemplosAula7;

import java.util.ArrayList;

/* Este exemplo serve tamb�m para LinkedList, bastando incluir: import java.util.LikedList e
  colocar LinkedList<String> alunos = new LinkedList<>() .*/

public class ExemploPag10_ArrayList_E_LinkedList {

	public static void main(String[] args) {
		// Cria uma lista de objetos ArrayList vazia.
		ArrayList<String> alunos = new ArrayList<>();
		
		/* ArraysList e LinkedLists tamb�m podem ser inicializados j� em sua declara��o por meio da 
		classe Arrays. Sendo necess�rio: import java.util.Arrays.
		ArrayList<String> alunos = new ArrayList<>(Arrays.asList("Jo�o", "Maria", "Pedro", "Carlos"));*/
		
		// Adiciona os elementos � lista.
		alunos.add("Jo�o");
		alunos.add("Maria");
		alunos.add("Pedro");
		alunos.add("Carlos");  
		// Adicionando o elemento "Jo�o" novamente, agora na posi��o 2.
		alunos.add(2, "Jo�o");
		System.out.println(alunos); // Imprime os elementos da lista.
		
		alunos.remove("Pedro"); // Remove o elemento "Pedro" da lista.
		alunos.remove(0); // Remove o elemento que est� na posi��o zero na lista.
		System.out.println(alunos); // Imprime os elementos da lista.
		
		// Obtem o elemento que est� na posi��o 1 na lista.
		System.out.println("2� aluno: " + alunos.get(1));
		
		// Retorna o n�mero de elementos contidos na lista.
		System.out.println("N�mero de alunos: " + alunos.size());
	}
}
