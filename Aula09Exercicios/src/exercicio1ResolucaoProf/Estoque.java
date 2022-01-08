package exercicio1ResolucaoProf;

import java.util.ArrayList;
import java.util.List;

public class Estoque {
	private String loja;
	private List<Produto> produtos; 
	
	public Estoque(String loja) {
		this.loja = loja;
		this.produtos = new ArrayList<Produto>();
	}
	
	public void armazena(Produto produto) { 
		//Insere Condição
		if(produtos.isEmpty() || qtdDeOcorrenciasDoProdutoNoEstoque(produto.getNome()) == 0)
		produtos.add(produto); 
	}
		
	public String getLoja() { return loja; }
		
	public List<Produto> getProdutos() { return produtos; }
	
	//Insere método condição
	private int qtdDeOcorrenciasDoProdutoNoEstoque(String produto) {
		int total = 0;
		
		for (Produto p : produtos)
			if (p.getNome().equals(produto))
				total++;
			
		return total;
	}

}
