package exemploHerancaPaginas14a16;

public class Casa extends Imovel {
	private int areaTerreno;

	public Casa() {
		//Chama o m�todo SetEndereco da classe m�e (Imovel).
		super.setEndereco("Rua Manaus, 220");
		
		//Chama o m�todo SetValor da classe m�e (Imovel).
		super.setValor(450000);
		
		//Chama o m�todo SetAreaTerreno da classe Casa.
		this.setAreaTerreno(250);
	}
	
	public void setAreaTerreno(int areaTerreno) {
		this.areaTerreno = areaTerreno;
		System.out.println("�rea cadastrada: " + this.areaTerreno);
	}

}
