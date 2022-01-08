package exercicio2;

import java.util.LinkedList;

public class Fila {
	LinkedList<String> pessoas = new LinkedList<String>();

	public String InserirPessoa(String pessoa) {
		pessoas.addLast(pessoa);
		return "Pessoa Inserida!\n";
	}

	public String RemoverPessoa(String pessoa) {
		pessoas.pollFirst();
		return "Pessoa Removida!\n";
	}

	public String ImprimirFila(String pessoa) {
		if (pessoas.isEmpty()) // Verifica se a fila está vazia.
			System.out.println("A fila está vazia.");
		else
			System.out.println(pessoas);
		return "\n";
	}
}
