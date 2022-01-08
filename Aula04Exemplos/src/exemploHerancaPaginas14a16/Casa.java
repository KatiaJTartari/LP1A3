package exemploHerancaPaginas14a16;

public class Casa extends Imovel {
	private int areaTerreno;

	public Casa() {
		//Chama o método SetEndereco da classe mãe (Imovel).
		super.setEndereco("Rua Manaus, 220");
		
		//Chama o método SetValor da classe mãe (Imovel).
		super.setValor(450000);
		
		//Chama o método SetAreaTerreno da classe Casa.
		this.setAreaTerreno(250);
	}
	
	public void setAreaTerreno(int areaTerreno) {
		this.areaTerreno = areaTerreno;
		System.out.println("Área cadastrada: " + this.areaTerreno);
	}

}
