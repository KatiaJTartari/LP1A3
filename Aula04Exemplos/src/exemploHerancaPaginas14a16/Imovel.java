package exemploHerancaPaginas14a16;

public class Imovel {
	private int idMovel;
	private String endereco;
	private double valor;
	
	protected void setEndereco(String endereco) {
		this.endereco = endereco;
		System.out.println("Endereço cadastrado: " + this.endereco);
	}
	
	protected void setValor(double valor) {
		this.valor = valor;
		System.out.println("Valor cadastrado: " + this.valor);
	}

}
