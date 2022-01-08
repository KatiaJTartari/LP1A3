package exercicio1ResolucaoProf;

import java.util.ArrayList;
import java.util.List;

public class Controle {
	private List<Produto> estoqueInsuficiente;
	private List<Produto> estoqueExcedente;
	private List<Produto> estoqueZerado;
	private List<Produto> estoqueAdequado;
	
	public void controlaEstoques(Estoque estoque) { 
		//Insere Condições
		if (estoque.getProdutos().size() == 0)
		throw new RuntimeException("Este estoque não tem produtos!");
		
		estoqueInsuficiente = new ArrayList<Produto>();
		estoqueExcedente = new ArrayList<Produto>();
		estoqueZerado = new ArrayList<Produto>();
		estoqueAdequado = new ArrayList<Produto>();
		
		for (Produto produto : estoque.getProdutos()) {
			if (produto.getQuantidade() < produto.getEstoqueMinimo())
				estoqueInsuficiente.add(produto);
			if (produto.getQuantidade() > produto.getEstoqueMaximo())
				estoqueExcedente.add(produto);
			if (produto.getQuantidade() == 0)
				estoqueZerado.add(produto);
			if (produto.getQuantidade() >= produto.getEstoqueMinimo() && produto.getQuantidade() <= produto.getEstoqueMaximo())
				estoqueAdequado.add(produto);
		}
	}
	
	public List<Produto> getProdutosComEstoqueInsuficiente() { return estoqueInsuficiente; }
	public List<Produto> getProdutosComEstoqueExcedente() { return estoqueExcedente; }
	public List<Produto> getProdutosComEstoqueZerado() { return estoqueZerado; }
	public List<Produto> getProdutosComEstoqueAdequado() { return estoqueAdequado; }
	
}
