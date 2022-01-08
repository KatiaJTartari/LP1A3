package ex2;

public class Retangulo extends Forma {
	private double base, altura;

	public Retangulo(double base, double altura, String cor) {
		this.base = base;
		this.altura = altura;
		calcularArea();
		setCor(cor);
		System.out.println("A cor do ret�ngulo � " + getCor());
		System.out.println();
	}
	
	// Sobrescreve o m�todo CalcularArea da classe Forma.
	@Override
	protected void calcularArea() {
		setArea(base * altura);
		System.out.println("A �rea do Ret�ngulo � " + getArea());
	}
}
