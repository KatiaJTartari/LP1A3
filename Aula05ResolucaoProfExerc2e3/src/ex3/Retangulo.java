package ex3;

public class Retangulo implements IForma {
	private double area, base, altura;
	public String cor;
	//private String cor;
   //O do professor está como private String cor e está dando um pequeno erro por isso deixei como public String cor;
	
	public Retangulo(double base, double altura, String cor) {
		this.base = base;
		this.altura = altura;
		this.cor = cor;
		calcularArea();
		System.out.println("A cor do retângulo é " + cor);
		System.out.println();
	}

	@Override
	public void calcularArea() {
		area = base * altura;
		System.out.println("A área do retângulo é " + area);
	}
}
