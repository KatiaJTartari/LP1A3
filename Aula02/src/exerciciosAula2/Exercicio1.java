package exerciciosAula2;

import java.util.Scanner;

public class Exercicio1 {
	
	public static void main(String[] args) {
		
		int opcao;
		
		
		Scanner dado = new Scanner(System.in);
		
		do {
			System.out.println("\tMENU DE OP��ES:");
			System.out.println("1- Arrendodar N�mero");
			System.out.println("2- Calcular Raiz Quadrada");
			System.out.println("3- Calcular Pot�ncia");
			System.out.println("0- Sair");
			System.out.print("\n Op��o: ");
			
			opcao = dado.nextInt();
						
			switch (opcao) {
			case 1: 
				System.out.print("\n Informe o valor decimal: ");
		        float valorDecimal = dado.nextFloat();
		        System.out.println(" Resultado: " + Math.round(valorDecimal) + "\n");
				break;
			case 2: 
				System.out.print("\n Informe um n�mero maior ou igual a zero: ");
				int num = dado.nextInt();
				System.out.println(" Resultado: " + Math.sqrt(num) + "\n");
                break;
			case 3: 
				System.out.print("\n Informe a base: ");
				int base = dado.nextInt();
				System.out.print("\n Informe o expoente: ");
				int expoente = dado.nextInt();
				System.out.println(" Resultado: " + Math.pow(base, expoente) + "\n");
                break;   
               
			default:
				if (opcao != 0)
					System.out.println("\n Op��o inv�lida.\n");  
				else
					System.out.println("\n Programa encerrado.\n");
			    break;
			}
			
		}while(opcao != 0);
		dado.close();
				
	}
}
