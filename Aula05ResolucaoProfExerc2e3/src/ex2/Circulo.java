package ex2;

public class Circulo extends Forma {
	private double raio;

	public Circulo(double raio, String cor) {
		this.raio = raio;
		calcularArea();
		setCor(cor);
		System.out.println("A cor do c�rculo � " + getCor());
		System.out.println();
	}
	
	// Sobrescreve o m�todo CalcularArea da classe Forma.
	@Override
	protected void calcularArea() {
		setArea(Math.pow(raio, 2) * Math.PI);
		System.out.println("A �rea do C�rculo � " + getArea());
	}
}
