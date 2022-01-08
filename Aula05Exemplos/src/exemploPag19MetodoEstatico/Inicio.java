package exemploPag19MetodoEstatico;
//Métodos Estáticos: que não possuem vínculos com as instâncias de uma classe.

public class Inicio {

	public static void main(String[] args) {
		Adicao.setSoma(3);
		System.out.println("Soma: " + Adicao.getSoma());

	}
}
