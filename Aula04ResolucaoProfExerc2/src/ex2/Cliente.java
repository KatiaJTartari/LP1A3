package ex2;

public class Cliente {
	private int codigo;
	private String endereco;
	private String telefone;
	
	//Métodos protegidos get e set necessários:
	
	//Métodos set devem atribuir os valores recebidos como argumento aos respectivos atributos da classe:
	
	protected void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	protected void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	protected void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
	//Métodos get devem retornar os respectivos valores dos atributos da classe Cliente:
	
	protected int getCodigo() {
		return this.codigo;
	}
	
	protected String getEndereco() {
		return this.endereco;
	}
	
	protected String getTelefone() {
		return this.telefone;
	}
}
