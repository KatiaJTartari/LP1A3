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
		if (pessoas.isEmpty()) // Verifica se a fila est� vazia.
			System.out.println("A fila est� vazia.");
		else
			System.out.println(pessoas);
		return "\n";
	}
}
