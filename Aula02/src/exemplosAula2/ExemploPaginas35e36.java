package exemplosAula2;

public class ExemploPaginas35e36 {

	public static void main(String[] args) {
		
		System.out.println("Exemplo P�gina 35");
		
		String texto1 = "Livro";
		String texto2 = "Livro";
		String texto3 = "livro";
		String texto4 = "Livro ";

		System.out.println(texto1.equals(texto2));
		System.out.println(texto1.equals(texto3));
		System.out.println(texto1.equals(texto4));
		
		System.out.println("\nExemplo P�gina 36");
		String txt1 = "Azul Claro";
		String txt2 = "Azul Claro";
		String parte1 = "Azul ";
		String parte2 = "Claro";
		String txt3 = parte1 + parte2;
		
		System.out.println(txt1 == txt2); //Verifica se as vari�veis ocupam o mesmo local na mem�ria.
		System.out.println(txt1 == txt3); //Verifica se as vari�veis ocupam o mesmo local na mem�ria.
		
		System.out.println(txt1.equals(txt2)); //Compara se os conte�dos das vari�veis s�o iguais.
		System.out.println(txt1.equals(txt3)); //Compara se os conte�dos das vari�veis s�o iguais.
	}

}
