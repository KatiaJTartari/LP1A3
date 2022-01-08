package exercicio1ProfessorResolucao;

import java.util.ArrayList;
import java.util.List;

public class Lista {
	private List<String> produtos;
	private List<String> textos;

	public Lista() {
		produtos = new ArrayList<>();
		textos = new ArrayList<>();
		textos = Localizacao.getTextos();
	}

	public String inserirProduto(String produto) {
		produtos.add(produto);
		return textos.get(31) + "\n"; // "Produto Inserido!"
	}

	public String inserirProdutoPosicao(String produto, int posicao) {
		produtos.add(posicao, produto);
		return textos.get(30) + "\n"; // "Produto Inserido em Posição Específica!"
	}

	public String consultarProdutoNome(String produto) {
		if (produtos.contains(produto))
			return textos.get(8) + "\n"; // "Este Produto Existe!"
		else
			return textos.get(9) + "\n"; // "Este Produto Não Existe!"
	}

	public String consultarProdutoPosicao(int posicao) {
		return textos.get(20) + produtos.get(posicao) + "\n"; // "O Produto que está nessa Posição é: "
	}

	public String substituirProduto(String produto, int posicao) {
		produtos.set(posicao, produto);
		return textos.get(34) + "\n"; // "Produto Substituído!"
	}

	public String removerProdutoNome(String produto) {
		produtos.remove(produto);
		return textos.get(33) + "\n"; // "Produto Removido pelo Nome!"
	}

	public String removerProdutoPosicao(int posicao) {
		produtos.remove(posicao);
		return textos.get(32) + "\n"; // "Produto Removido pelo Posição!"
	}

}
