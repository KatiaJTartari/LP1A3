package exercicio1ResolucaoProf;

public class CriadorDeEstoque {
	private Estoque estoque;

	public CriadorDeEstoque para(String loja) {
		this.estoque = new Estoque(loja);
		return this;
	}

	public CriadorDeEstoque produto(String nome, double quantidade, double estoqueMinimo, double estoqueMaximo) {
		estoque.armazena(new Produto(nome, quantidade, estoqueMinimo, estoqueMaximo));
		return this;
	}

	public Estoque cria() { return estoque; }

}
