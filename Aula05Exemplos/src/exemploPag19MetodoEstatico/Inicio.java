package exemploPag19MetodoEstatico;
//M�todos Est�ticos: que n�o possuem v�nculos com as inst�ncias de uma classe.

public class Inicio {

	public static void main(String[] args) {
		Adicao.setSoma(3);
		System.out.println("Soma: " + Adicao.getSoma());

	}
}
