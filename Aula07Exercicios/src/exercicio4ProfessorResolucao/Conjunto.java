package exercicio4ProfessorResolucao;

import java.util.Set;
import java.util.TreeSet;

public class Conjunto {

	// Cria conjuntos de objetos TreeSet vazios.
	Set<String> produtos1 = new TreeSet<String>();
	Set<String> produtos2 = new TreeSet<String>();
	Set<String> resultado = new TreeSet<String>();

	public void EsvaziarConjunto(int numConjunto) {
		if (numConjunto == 1)
			produtos1.clear();
		else
			produtos2.clear();
	}

	public void InserirProdutoConjunto(int numConjunto, String produto) {
		if (numConjunto == 1)
			produtos1.add(produto);
		else
			produtos2.add(produto);
	}

	public void ConsultarTodosProdutosDosConjuntos() {
		resultado.addAll(produtos1); // O Set resultado, que está vazio, acumulará os produtos do Set produtos1.
		resultado.addAll(produtos2); // O Set resultado, que agora tem os produtos de produtos1, acumulará os produtos do Set produtos2.
		System.out.println("Todos produtos dos dois conjuntos (união):");
		if (resultado.size() > 0) // Verifica se o tamanho do conjunto resultado é maior que zero.
			System.out.println(resultado);
		else
			System.out.println("O Conjunto resultante não possui nenhum produto.");
		resultado.clear(); // Esvazia o resultado para as próximas operações que usuário possa realizar.
	}

	public void ConsultarProdutosEmComumNosConjuntos() {
		resultado.addAll(produtos1);
		resultado.retainAll(produtos2);
		System.out.println("Produtos em comum dos dois conjuntos (intersecção):");
		if (resultado.size() > 0) // Verifica se o tamanho do conjunto resultado é maior que zero.
			System.out.println(resultado);
		else
			System.out.println("O Conjunto resultante não possui nenhum produto.");
		resultado.clear(); // Esvazia o resultado para as próximas operações que usuário possa realizar.
	}

	public void ConsultarDiferencaEntreConjuntos() {
		resultado.addAll(produtos1);
		resultado.removeAll(produtos2);
		System.out.println("produtos do 1º conjunto que não existem no 2º conjunto (diferença):");
		if (resultado.size() > 0) // Verifica se o tamanho do conjunto resultado é maior que zero.
			System.out.println(resultado);
		else
			System.out.println("O Conjunto resultante não possui nenhum produto.");
		resultado.clear(); // Esvazia o resultado para as próximas operações que usuário possa realizar.
	}

	public void ConsultarSeConjunto1EstaContidoNoConjunto2() {
		if (produtos2.containsAll(produtos1))
			System.out.println("Sim, o 1º conjunto está contido no 2º conjunto.");
		else
			System.out.println("Não, o 1º conjunto não está contido no 2º conjunto.");

	}
}
