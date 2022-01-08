package exemploPag16AtributosEstaticos;
//Atributos Estáticos: que não possuem vínculos com as instâncias de uma classe.

public class Inicio {

	public static void main(String[] args) {
		Adicao a = new Adicao();
		a.setSoma(1);
		Adicao b = new Adicao();
		b.setSoma(3);
		Adicao c = new Adicao();
		c.setSoma(5);

		//O valor do atributo soma é o mesmo, independentemente da instância que chama o método getSoma.
		System.out.println("Soma: " + a.getSoma());
		System.out.println("Soma: " + b.getSoma());
		System.out.println("Soma: " + c.getSoma());
		
		/*Cada instância referencia um endereço de memória diferente,
		  porém estes endereços armazenam o mesmo valor.*/

	}

}
