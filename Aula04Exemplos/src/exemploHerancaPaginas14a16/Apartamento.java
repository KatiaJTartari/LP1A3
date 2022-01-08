package exemploHerancaPaginas14a16;

public class Apartamento extends Imovel {
	private int andar;

	public Apartamento() {
		//Chama o método SetEndereco da classe mãe (Imovel).
		super.setEndereco("Rua Itu, 301");
		
		//Chama o método SetValor da classe mãe (Imovel).
		super.setValor(300000);
		
		//Chama o método SetAndar da classe Apartamento.
		this.setAndar(7);
	}
	
	public void setAndar(int andar) {
		this.andar = andar;
		System.out.println("Andar cadastrado: " + this.andar);
	}

}
