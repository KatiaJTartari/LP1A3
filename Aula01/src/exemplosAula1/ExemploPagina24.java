package exemplosAula1;

import java.util.Scanner;

public class ExemploPagina24 {

	public static void main(String[] args) {
		
//Observação: Está com erros dizendo: The value of the local variable numero1 is not used
		                            //O valor da variável local numero1 não é usado
		
//Exemplo slide Introdução à Plataforma e ao Ambiente de Desenvolvimento página 24
				
        Scanner r = new Scanner (System.in); // Cria um objeto do tipo Scanner.
				
		String texto1 = r.next(); // Retorna a cadeia de caracteres (sem espaços) lida.
		r.nextLine(); // Esvazia o buffer do teclado - (Necessário para ler a próxima linha).
		String texto2 = r.nextLine(); // Retorna a cadeia de caracteres lida.
		int numero1 = r.nextInt(); // Retorna número inteiro lido.
		float numero2 = r.nextFloat(); // Retorna número float lido.
		double numero3 = r.nextDouble(); // Retorna número double lido.
				
		r.close(); // Fecha o leitor de dados.

/*Observação: Ao usar o método nextLine após os métodos next, nextInt, nextFloat ou nextDouble,
deve-se esvaziar o buffer do teclado por meio da chamada de um método nextLine subsequente,
porém sem atribuição da string retornada.*/	
		
// Acresecentei estas 5 últimas linhas no código, para apresentar os dados que foram lidos pelo usuário:		
		System.out.println("Texto1: " + texto1);
		System.out.println("Texto2: " + texto2);
		System.out.println("Número1: " + numero1);
		System.out.println("Número2: " + numero2);
		System.out.println("Número3: " + numero3);
		
	}
}
