package exercicio3;

public class Circulo implements IForma {
	public String cor;
	protected double area;
	private float raio;
	
	public Circulo(float raio, String cor) {
		this.raio = raio;
		this.cor = cor;
		calcularArea();
	}
	
	@Override	
	public void calcularArea() {
		area = 3.14 * Math.pow(raio, 2);
		// OU
		// area = this.raio * this.raio * 3.14;
		System.out.println("\nA �rea calculada do C�rculo �: " + area + " e a sua Cor �: " + cor);
	}

}
