package exercicio2;

public class Circulo extends Forma {
	private float raio;
	
	public Circulo(float raio, String cor) {
		setRaio(raio);
		setCor(cor);
		calcularArea();
	}

	public float getRaio() {
		return this.raio;
	}

	public void setRaio(float raio) {
		this.raio = raio;
	}

	// Sobrescreve o m�todo CalcularArea da classe Forma.
	@Override
	protected void calcularArea() {
		area = 3.14 * Math.pow(getRaio(), 2);
		// OU
		// area = getRaio * getRaio * 3.14;
		System.out.println("\nA �rea calculada do C�rculo �: " + area + " e a sua Cor �: " + cor);
	}

}
