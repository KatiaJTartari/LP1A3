package exemploPagina25;

public class Carro {
	private String marca, cor;
	private int velocidade = 0;
	
	public int getVelocidade() {
		return this.velocidade;
	}

	public void setVelocidade(int velocidade) {
		if (velocidade <= 100) {
			this.velocidade = velocidade;
			System.out.println("A nova velocidade �: " + this.velocidade + " Km/h.");
		}else
			System.out.println("N�o � poss�vel aumentar a velocidade! " + "Ela foi mantida em: " + this.velocidade + " Km/h.");

    }
}