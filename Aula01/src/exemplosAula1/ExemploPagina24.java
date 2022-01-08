package exemplosAula1;

import java.util.Scanner;

public class ExemploPagina24 {

	public static void main(String[] args) {
		
//Observa��o: Est� com erros dizendo: The value of the local variable numero1 is not used
		                            //O valor da vari�vel local numero1 n�o � usado
		
//Exemplo slide Introdu��o � Plataforma e ao Ambiente de Desenvolvimento p�gina 24
				
        Scanner r = new Scanner (System.in); // Cria um objeto do tipo Scanner.
				
		String texto1 = r.next(); // Retorna a cadeia de caracteres (sem espa�os) lida.
		r.nextLine(); // Esvazia o buffer do teclado - (Necess�rio para ler a pr�xima linha).
		String texto2 = r.nextLine(); // Retorna a cadeia de caracteres lida.
		int numero1 = r.nextInt(); // Retorna n�mero inteiro lido.
		float numero2 = r.nextFloat(); // Retorna n�mero float lido.
		double numero3 = r.nextDouble(); // Retorna n�mero double lido.
				
		r.close(); // Fecha o leitor de dados.

/*Observa��o: Ao usar o m�todo nextLine ap�s os m�todos next, nextInt, nextFloat ou nextDouble,
deve-se esvaziar o buffer do teclado por meio da chamada de um m�todo nextLine subsequente,
por�m sem atribui��o da string retornada.*/	
		
// Acresecentei estas 5 �ltimas linhas no c�digo, para apresentar os dados que foram lidos pelo usu�rio:		
		System.out.println("Texto1: " + texto1);
		System.out.println("Texto2: " + texto2);
		System.out.println("N�mero1: " + numero1);
		System.out.println("N�mero2: " + numero2);
		System.out.println("N�mero3: " + numero3);
		
	}
}
