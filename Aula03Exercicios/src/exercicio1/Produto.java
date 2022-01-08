package exercicio1;

public class Produto {
	//Atributos privados da classe Produto:
	private int codigo;
	private String descricao;
	private float preco;
	private boolean ativo;
		
	
	//Construtor da classe Produto para inicializar seus atributos:
	public Produto() {
		this.codigo = 0;
		this.descricao = "";
		this.preco = 0;
		this.ativo = false;
	}

	//Métodos públicos get e set:
	
	//Métodos get devem retornar os respectivos valores dos atributos da classe Produto:
	public int getCodigo() {
		return this.codigo;
	}
	
	public String getDescricao() {
		return this.descricao;
	}
	
	public float getPreco() {
		return this.preco;
	}
	
	public boolean getAtivo() {
		return this.ativo;
	}
	
	
	//Métodos set devem atribuir os valores recebidos como argumento aos respectivos atributos da classe:
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	
}
