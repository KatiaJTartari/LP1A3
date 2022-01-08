package exemploPag09SobreposicaoDeMetodos;

public class Inicio {

	public static void main(String[] args) {
		Mamifero mm = new Mamifero();
		Animal am = new Mamifero(); //Uma vari�vel (ou argumento) do tipo de uma classe m�e
		Animal aa = new Animal();   //pode instanciar ou receber qualquer tipo de classe filha.

		analisarAnimal(mm); // Chama o m�todo "avaliarMetabolismo" da classe filha (Mamifero).
		analisarAnimal(am); // Chama o m�todo "avaliarMetabolismo" da classe filha (Mamifero).
		analisarAnimal(aa); // Chama o m�todo "avaliarMetabolismo" da classe filha (Animal).
	}
	     
                                    //Uma vari�vel (ou argumento) do tipo de uma classe m�e pode instanciar
	public static void analisarAnimal(Animal a) {                //ou receber qualquer tipo de classe filha.
		a.avaliarMetabolismo();
	}
}

/*Ocorre quando uma classe filha sobrescreve (ou define) a implementa��o de um m�todo da classe m�e,
 * por�m sem alterar a assinatura deste m�todo.
 * 
 * Um m�todo sobrescrito possui assinatura igual, mas implementa��o diferente com rela��o ao m�todo
 * na classe m�e.*/
 