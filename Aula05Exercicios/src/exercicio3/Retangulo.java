package exercicio3;

public class Retangulo implements IForma  {
	public String cor;
	protected double area;
	private float base, altura;

	public Retangulo(float base, float altura, String cor) {
		this.base = base;
		this.altura = altura;
		this.cor = cor;
		calcularArea();
	}
	
	@Override
	public void calcularArea() {
		area = base * altura;
		System.out.println("\nA área calculada do Retângulo é: " + area + " e a sua Cor é: " + cor);
	}

}
