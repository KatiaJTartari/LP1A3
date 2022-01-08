package exercicio2;

public abstract class Forma {
	// Para indicar que uma classe é abstrata, deve-se usar a palavra-chave abstract antes da palavra class.

	public String cor;
	protected double area;

	/* Métodos get devem retornar os respectivos valores dos atributos da classe Forma:
	 * Métodos set devem atribuir os valores recebidos como argumento aos respectivos atributos da classe: */
	 
	protected String getCor() {
		return cor;
	}

	protected void setCor(String cor) {
		this.cor = cor;
	}

	
	protected abstract void calcularArea();
	 // Para indicar que um método é abstrato, deve-se usar a palavra-chave abstract antes do tipo de retorno do método.
}
