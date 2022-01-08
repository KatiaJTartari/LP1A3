package exemploPag09SobreposicaoDeMetodos;

public class Inicio {

	public static void main(String[] args) {
		Mamifero mm = new Mamifero();
		Animal am = new Mamifero(); //Uma variável (ou argumento) do tipo de uma classe mãe
		Animal aa = new Animal();   //pode instanciar ou receber qualquer tipo de classe filha.

		analisarAnimal(mm); // Chama o método "avaliarMetabolismo" da classe filha (Mamifero).
		analisarAnimal(am); // Chama o método "avaliarMetabolismo" da classe filha (Mamifero).
		analisarAnimal(aa); // Chama o método "avaliarMetabolismo" da classe filha (Animal).
	}
	     
                                    //Uma variável (ou argumento) do tipo de uma classe mãe pode instanciar
	public static void analisarAnimal(Animal a) {                //ou receber qualquer tipo de classe filha.
		a.avaliarMetabolismo();
	}
}

/*Ocorre quando uma classe filha sobrescreve (ou define) a implementação de um método da classe mãe,
 * porém sem alterar a assinatura deste método.
 * 
 * Um método sobrescrito possui assinatura igual, mas implementação diferente com relação ao método
 * na classe mãe.*/
 