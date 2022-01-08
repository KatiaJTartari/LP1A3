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
/* Métodos estáticos podem invocar apenas atributos estáticos e 
 * outros métodos estáticos da classe. */
