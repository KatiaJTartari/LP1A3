package exercicio2;

public class PessoaFisica extends Cliente {
	private String nome;
	private String cpf;

	//M�todos p�blicos get e set necess�rios:
	
	//M�todos set devem atribuir os valores recebidos como argumento aos respectivos atributos da classe:
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
	//M�todos get devem retornar os respectivos valores dos atributos da classe PessoaFisica:
	
	public String getNome() {
		return this.nome;
	}
	
	public String getCpf() {
		return this.cpf;
	}

}
