package exercicio4MinhaVersao;

import java.util.TreeSet;

public class Conjunto {
	// Cria conjuntos de objetos TreeSet vazios.
	TreeSet<String> c1 = new TreeSet<>();
	TreeSet<String> c2 = new TreeSet<>();
	TreeSet<String> aux = new TreeSet<>();

	public String InserirProdutoConjunto1(String produto) {
		c1.add(produto);
		return "Produto Inserido no Conjunto 1 !\n";
	}

	public String InserirProdutoConjunto2(String produto) {
		c2.add(produto);
		return "Produto Inserido no Conjunto 2 !\n";
	}

	public void ConsultarProdutoUniao() {
		aux.addAll(c1); // O TreeSet aux, que está vazio, acumulará os produtos do TreeSet c1.
		aux.addAll(c2); // O TreeSet aux, que agora tem os produtos de c1, acumulará os produtos do TreeSet c2.
		System.out.println("Conjunto 1 U Conjunto 2: ");
		if (c1.isEmpty()) // Verifica se o conjunto está vazio.
			 System.out.println("O Conjunto está vazio!"); 
		else
			 System.out.println(aux);
		aux.clear(); // Esvazia o aux para as próximas operações que usuário possa realizar.
    }

	public void ConsultarProdutoInterseccao() {
		aux.addAll(c1);
		aux.retainAll(c2);
		System.out.println("Conjunto 1 Intersecção Conjunto 2: " );
		if (c1.isEmpty()) // Verifica se o conjunto está vazio.
			 System.out.println("O Conjunto está vazio!"); 
		else
			 System.out.println(aux);
		aux.clear();
	}

	public void ConsultarProdutoDiferenca() {
		aux.addAll(c1);
		aux.removeAll(c2);
		System.out.println("Conjunto 1 Diferença Conjunto 2: ");
		if (c1.isEmpty()) // Verifica se o conjunto está vazio.
			System.out.println("O Conjunto está vazio!");
		else
			System.out.println(aux);
		aux.clear();
	}

	public void VerificarSubconjunto() {
		if (c1.containsAll(c2)) 
			System.out.println("O conjunto 1 contém o conjunto 2.");
		else
			System.out.println("O conjunto 1 não contém o conjunto 2.");
	}

}
