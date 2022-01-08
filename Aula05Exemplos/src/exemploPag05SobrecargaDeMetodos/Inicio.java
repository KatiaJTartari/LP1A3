package exemploPag05SobrecargaDeMetodos;

public class Inicio {

	public static void main(String[] args) {
		Calculo c = new Calculo();
		c.somar(8, 0, 2); // Chama o 3º método "somar" da classe Calculo.
		c.somar(3, 4); // Chama o 1º método "somar" da classe Calculo.
		c.somar(6, 2.3); // Chama o 2º método "somar" da classe Calculo.
	}
}

/*Ocorre quando a classe possui dois ou mais métodos com o mesmo nome, porém com assinaturas diferentes,
 * ou seja, quantidades de argumentos e/ou tipos de argumentos diferentes.*/
 