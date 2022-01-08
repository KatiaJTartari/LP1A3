package exercicio2;

public class PessoaJuridica extends Cliente {
	private String razaoSocial;
	private String cnpj;

	//Métodos públicos get e set necessários:
	
	//Métodos set devem atribuir os valores recebidos como argumento aos respectivos atributos da classe:
		
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	
	//Métodos get devem retornar os respectivos valores dos atributos da classe PessoaJuridica:
	
	public String getRazaoSocial() {
		return this.razaoSocial;
	}
	
	public String getCnpj() {
		return this.cnpj;
	}

}
