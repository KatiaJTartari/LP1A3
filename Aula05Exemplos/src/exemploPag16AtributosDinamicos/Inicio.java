package exemploPag16AtributosDinamicos;

public class Inicio {

	public static void main(String[] args) {
		Adicao a = new Adicao();
		a.setSoma(1);
		Adicao b = new Adicao();
		b.setSoma(3);
		Adicao c = new Adicao();
		c.setSoma(5);

		//O valor do atributo soma varia conforme a instância que chama o método getSoma.
		System.out.println("Soma: " + a.getSoma());
		System.out.println("Soma: " + b.getSoma());
		System.out.println("Soma: " + c.getSoma());
		
		/*Cada instância referencia um endereço de memória diferente,
		  nos quais se encontram valores distintos.*/
	}
}
