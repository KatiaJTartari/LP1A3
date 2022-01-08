package exercicio1;

public class Produto {
	private int codigo;
	private String descricao;
	private double preco;
	private boolean ativo;

	public int getCodigo() {
		return this.codigo;
	}
	
	public String getDescricao() {
		return this.descricao;
	}
	
	public double getPreco() {
		return this.preco;
	}
	
	public boolean getAtivo() {
		return this.ativo;
	}
	
	public void setCodigo(int codigo) {
		if (codigo < 1)
			throw new IllegalArgumentException("O código deve ser apartir de 1.");
		this.codigo = codigo;
	}
	
	public void setDescricao(String descricao) {
		if (descricao.length() > 15)
			throw new IllegalArgumentException("A descrição deve conter até 15 caracteres.");
		this.descricao = descricao;
	}
	
	public void setPreco(double preco) {
		if (preco < 1)
			throw new IllegalArgumentException("O preço mínimo é R$ 1,00.");
		this.preco = preco;
	}
	
	public void setAtivo(Boolean ativo) {
		if (ativo == null)
			throw new IllegalArgumentException("Digite S ou N");
		this.ativo = ativo;
	}
}
