package ex2;

public class Circulo extends Forma {
	private double raio;

	public Circulo(double raio, String cor) {
		this.raio = raio;
		calcularArea();
		setCor(cor);
		System.out.println("A cor do círculo é " + getCor());
		System.out.println();
	}
	
	// Sobrescreve o método CalcularArea da classe Forma.
	@Override
	protected void calcularArea() {
		setArea(Math.pow(raio, 2) * Math.PI);
		System.out.println("A área do Círculo é " + getArea());
	}
}
