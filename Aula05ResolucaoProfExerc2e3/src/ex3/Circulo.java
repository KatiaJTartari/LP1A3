package ex3;

public class Circulo implements IForma {
	private double area, raio;
	public String cor;
  //private String cor
 //O do professor est� como private String cor e est� dando um pequeno erro por isso deixei como public String cor;
	
	public Circulo(double raio, String cor) {
		this.raio = raio;
		this.cor = cor;
		calcularArea();
		System.out.println("A cor do c�rculo � " + cor);
		System.out.println();
	}

	@Override
	public void calcularArea() {
		area = Math.pow(raio, 2) * Math.PI;
		System.out.println("A �rea do c�rculo � " + area);
	}
}
