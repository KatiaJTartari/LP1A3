package exemploPag09SobreposicaoDeMetodos;

public class Mamifero extends Animal {
	//Sobrescreve o método "avaliarMetabolismo" da classe mãe (Animal).
	@Override
	protected void avaliarMetabolismo() {
		// Código para avaliação de metabolismo de mamífero.
		System.out.println("Avaliação de metabolismo de mamífero."); //Implementação específica
	}
}

/*Para explicitar que um método está sendo sobrescrito, deve-se usar a anotação @Override antes da
 *  assinatura do método.*/
 