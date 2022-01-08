package ex2;

public class Cliente {
	private int codigo;
	private String endereco;
	private String telefone;
	
	//M�todos protegidos get e set necess�rios:
	
	//M�todos set devem atribuir os valores recebidos como argumento aos respectivos atributos da classe:
	
	protected void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	protected void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	protected void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
	//M�todos get devem retornar os respectivos valores dos atributos da classe Cliente:
	
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
