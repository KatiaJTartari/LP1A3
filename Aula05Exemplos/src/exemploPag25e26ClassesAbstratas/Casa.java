package exemploPag25e26ClassesAbstratas;

public class Casa extends Imovel {
	private int metroQuadrado;
	private double aluguel;

	public Casa() {
		super.setEndereco("Rua Manaus, 220");
		super.setValor(450000);
		this.setAreaTerreno(250);
		this.calcularAluguel(1500);
	}
	
	public void setAreaTerreno(int metroQuadrado) {
		this.metroQuadrado = metroQuadrado;
		System.out.println("Área cadastrada: " + this.metroQuadrado);
	}
	
	// Sobrescreve o método CalcularAluguel da classe Imovel.
	@Override
	protected void calcularAluguel(double aluguel) {
	    this.aluguel = aluguel;
	    System.out.println("Aluguel da casa: " + this.aluguel);
	}

}
