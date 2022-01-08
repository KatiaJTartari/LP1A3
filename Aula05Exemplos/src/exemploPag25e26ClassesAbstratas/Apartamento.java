package exemploPag25e26ClassesAbstratas;

public class Apartamento extends Imovel {
	private int andar;
	private double aluguel, condominio;

	public Apartamento() {
		super.setEndereco("Rua Itu, 301");
		super.setValor(300000);
		this.setAndar(7);
		this.calcularAluguel(1000);
	}
	
	public void setAndar(int andar) {
		this.andar = andar;
		System.out.println("Andar cadastrada: " + this.andar);
	}
	
	// Sobrescreve o método CalcularAluguel da classe Imovel.
		@Override
		protected void calcularAluguel(double aluguel) {
		    this.aluguel = aluguel;
		    this.condominio = this.aluguel * 0.25;
		    this.aluguel = this.aluguel + this.condominio;
		    System.out.println("Aluguel do apto: " + this.aluguel);
		}

}
