package exemploPag05SobrecargaDeMetodos;

public class Inicio {

	public static void main(String[] args) {
		Calculo c = new Calculo();
		c.somar(8, 0, 2); // Chama o 3� m�todo "somar" da classe Calculo.
		c.somar(3, 4); // Chama o 1� m�todo "somar" da classe Calculo.
		c.somar(6, 2.3); // Chama o 2� m�todo "somar" da classe Calculo.
	}
}

/*Ocorre quando a classe possui dois ou mais m�todos com o mesmo nome, por�m com assinaturas diferentes,
 * ou seja, quantidades de argumentos e/ou tipos de argumentos diferentes.*/
 