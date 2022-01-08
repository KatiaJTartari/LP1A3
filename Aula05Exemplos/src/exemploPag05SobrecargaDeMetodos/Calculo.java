package exemploPag05SobrecargaDeMetodos;

public class Calculo {
	public void somar(int n1, int n2) {
		System.out.println("Soma: " + (n1 + n2));
	}
	
	public void somar(int n1, double n2) {
		System.out.println("Soma: " + (n1 + n2));
	}
	
	public void somar(int n1, int n2, int n3) {
		System.out.println("Soma: " + (n1 + n2 + n3));
	}
}

/*Ocorre quando a classe possui dois ou mais métodos com o mesmo nome, porém com assinaturas diferentes,
 * ou seja, quantidades de argumentos e/ou tipos de argumentos diferentes.*/