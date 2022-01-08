package exemplosAula1;

import java.util.Scanner;

public class ExemploPagina30 {
	// Programa para calcular a área de um círculo.
	public static void main(String[] args) {
		        
		double raio; //Variável de entrada
		double area; //Variável de entrada
		final double pi = 3.14; //Constante
		
	    System.out.print("Informe o raio do círculo: "); //Imprime uma instrução para o usuário.
		
		Scanner r = new Scanner (System.in); //Cria um objeto do tipo Scanner para leitura do dado.
		raio = r.nextDouble(); //Lê o dado informado pelo usuário e armazena na variável "raio".
		r.close(); //Fecha o leitor de dados.
		
		//Calcula a área do círculo. O método pow da classe Math faz a exponenciação (raio elevado a 2).
		area = pi * Math.pow(raio, 2);
		
		System.out.println("A área do círculo é " + area); //Imprime o resultado para o usuário.
		
	}

}
