package exercicio2;

public class PessoaJuridica extends Cliente {
	private String razaoSocial;
	private String cnpj;

	//M�todos p�blicos get e set necess�rios:
	
	//M�todos set devem atribuir os valores recebidos como argumento aos respectivos atributos da classe:
		
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	
	//M�todos get devem retornar os respectivos valores dos atributos da classe PessoaJuridica:
	
	public String getRazaoSocial() {
		return this.razaoSocial;
	}
	
	public String getCnpj() {
		return this.cnpj;
	}

}
