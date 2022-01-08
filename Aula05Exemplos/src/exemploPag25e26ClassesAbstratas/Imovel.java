package exemploPag25e26ClassesAbstratas;

public abstract class Imovel { 
	//Para indicar que uma classe é abstrata, deve-se usar a palavra-chave abstract antes da palavra class.
	
	private String endereco;
	private double valor;
	
	protected void setEndereco(String endereco) {
		this.endereco = endereco;
		System.out.println("Endereco cadastrado: " + this.endereco);
	}
	
	protected void setValor(double valor) {
		this.valor = valor;
		System.out.println("Valor cadastrado: " + this.valor);
	}

	protected abstract void calcularAluguel(double aluguel);
	/*Para indicar que um método é abstrato, deve-se usar a palavra-chave abstract
	antes do tipo de retorno do método.*/
}
