package exercicio2;

public abstract class Forma {
	// Para indicar que uma classe � abstrata, deve-se usar a palavra-chave abstract antes da palavra class.

	public String cor;
	protected double area;

	/* M�todos get devem retornar os respectivos valores dos atributos da classe Forma:
	 * M�todos set devem atribuir os valores recebidos como argumento aos respectivos atributos da classe: */
	 
	protected String getCor() {
		return cor;
	}

	protected void setCor(String cor) {
		this.cor = cor;
	}

	
	protected abstract void calcularArea();
	 // Para indicar que um m�todo � abstrato, deve-se usar a palavra-chave abstract antes do tipo de retorno do m�todo.
}
