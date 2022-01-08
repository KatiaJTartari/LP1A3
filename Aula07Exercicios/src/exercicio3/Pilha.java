package exercicio3;

import java.util.LinkedList;

public class Pilha {
	LinkedList<String> livros = new LinkedList<String>();

	public String InserirLivro(String livro) {
		livros.addLast(livro);
		return "Livro Inserido!\n";
	}

	public String RemoverLivro(String livro) {
		livros.pollLast();
		return "Livro Removido!\n";
	}

	public String ImprimirPilha(String livro) {
		if (livros.isEmpty()) // Verifica se a pilha está vazia.
			System.out.println("A pilha está vazia.");
		else
			System.out.println(livros);
		return "\n";
	}
}
