package ex2;

public class Retangulo extends Forma {
	private double base, altura;

	public Retangulo(double base, double altura, String cor) {
		this.base = base;
		this.altura = altura;
		calcularArea();
		setCor(cor);
		System.out.println("A cor do retângulo é " + getCor());
		System.out.println();
	}
	
	// Sobrescreve o método CalcularArea da classe Forma.
	@Override
	protected void calcularArea() {
		setArea(base * altura);
		System.out.println("A área do Retângulo é " + getArea());
	}
}
