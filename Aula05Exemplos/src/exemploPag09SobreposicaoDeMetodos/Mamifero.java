package exemploPag09SobreposicaoDeMetodos;

public class Mamifero extends Animal {
	//Sobrescreve o m�todo "avaliarMetabolismo" da classe m�e (Animal).
	@Override
	protected void avaliarMetabolismo() {
		// C�digo para avalia��o de metabolismo de mam�fero.
		System.out.println("Avalia��o de metabolismo de mam�fero."); //Implementa��o espec�fica
	}
}

/*Para explicitar que um m�todo est� sendo sobrescrito, deve-se usar a anota��o @Override antes da
 *  assinatura do m�todo.*/
 