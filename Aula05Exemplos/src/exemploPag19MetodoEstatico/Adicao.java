package exemploPag19MetodoEstatico;

public class Adicao {
	private static int soma = 5;
	
	public static void setSoma(int num) {
		soma = soma + num;
	}
	public static int getSoma() {
		return soma;
	}
}
/* M�todos est�ticos podem invocar apenas atributos est�ticos e 
 * outros m�todos est�ticos da classe. */
