package exemploPag16AtributosDinamicos;

public class Inicio {

	public static void main(String[] args) {
		Adicao a = new Adicao();
		a.setSoma(1);
		Adicao b = new Adicao();
		b.setSoma(3);
		Adicao c = new Adicao();
		c.setSoma(5);

		//O valor do atributo soma varia conforme a inst�ncia que chama o m�todo getSoma.
		System.out.println("Soma: " + a.getSoma());
		System.out.println("Soma: " + b.getSoma());
		System.out.println("Soma: " + c.getSoma());
		
		/*Cada inst�ncia referencia um endere�o de mem�ria diferente,
		  nos quais se encontram valores distintos.*/
	}
}
