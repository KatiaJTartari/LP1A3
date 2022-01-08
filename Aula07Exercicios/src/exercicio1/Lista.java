package exercicio1;

import java.util.ArrayList;

public class Lista {
	ArrayList<String> produtos = new ArrayList<String>();
	
// Ou 
// List<String> produtos = new ArrayList<String>(); com import java.util.List;

	
	public String InserirProduto(String produto) {
		produtos.add(produto);
		return "Produto Inserido!\n";
	}

	public String InserirProdutoPosicao(String produto, int posicao) {
		produtos.add(posicao, produto);
		return "Produto Inserido em Posição Específica!\n";
	}

	public String ConsultarProdutoNome(String produto) {
		if (produtos.contains(produto))
			return "Produto Existente!\n";
		else
			return "Produto Inexistente!\n";
	}

	public String ConsultarProdutoPosicao(int posicao) {
		return "O Produto que está nessa Posição é: " + produtos.get(posicao) + "\n";
	}

	public String SubstituirProduto(String produto, int posicao) {
		produtos.set(posicao, produto);
		return "Produto Substituído!\n";
	}

	public String RemoverProdutoNome(String produto) {
		produtos.remove(produto);
		return "Produto Removido pelo Nome!\n";
	}

	public String RemoverProdutoPosicao(int posicao) {
		produtos.remove(posicao);
		return "Produto Removido pelo Posição!\n";
	}
}
