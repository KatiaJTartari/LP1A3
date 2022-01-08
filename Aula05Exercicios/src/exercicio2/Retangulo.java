package exercicio2;

public class Retangulo extends Forma {
	private float base, altura;
	
	public Retangulo(float base, float altura, String cor) {
		setBase(base);
		setAltura(altura);
		setCor(cor);
		calcularArea();
	}
	
	protected float getBase() {
		return base;
	}

	protected void setBase(float base) {
		this.base = base;
	}
	
	protected float getAltura() {
		return altura;
	}

	protected void setAltura(float altura) {
		this.altura = altura;
	}
	
	// Sobrescreve o método CalcularArea da classe Forma.
	@Override
	protected void calcularArea() {
		area = getBase() * getAltura();
		System.out.println("\nA área calculada do Retângulo é: " + area + " e a sua Cor é: " + cor);
	}
	
}
