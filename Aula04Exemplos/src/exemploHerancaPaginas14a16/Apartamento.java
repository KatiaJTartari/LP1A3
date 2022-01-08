package exemploHerancaPaginas14a16;

public class Apartamento extends Imovel {
	private int andar;

	public Apartamento() {
		//Chama o m�todo SetEndereco da classe m�e (Imovel).
		super.setEndereco("Rua Itu, 301");
		
		//Chama o m�todo SetValor da classe m�e (Imovel).
		super.setValor(300000);
		
		//Chama o m�todo SetAndar da classe Apartamento.
		this.setAndar(7);
	}
	
	public void setAndar(int andar) {
		this.andar = andar;
		System.out.println("Andar cadastrado: " + this.andar);
	}

}
