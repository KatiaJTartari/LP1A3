package resolucaoProfExerciciosAula2;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
        int opcao;
		double numero, bas, exp;
		
		Scanner r = new Scanner(System.in);
		
		do {
			System.out.println("OP��ES:");
			System.out.println("1) Arrendodar n�mero");
			System.out.println("2) Calcular raiz quadrada");
			System.out.println("3) Calcular a pot�ncia");
			System.out.println("Digite uma op��o (0 para sair):");
			opcao = r.nextInt();
						
			switch (opcao) {
			case 1: 
				System.out.print("\n Informe um n�mero decimal: ");
		        numero = r.nextDouble();
		        System.out.println("N�mero arredondado: " + Math.round(numero));
				break;
			case 2: 
				System.out.print("Informe um n�mero: ");
				numero = r.nextDouble();
				System.out.println(" Raiz quadrada: " + Math.sqrt(numero));
                break;
			case 3: 
				System.out.print("Informe a base: ");
				bas = r.nextDouble();
				System.out.print("Informe o expoente: ");
				exp = r.nextDouble();
				System.out.println("Resultado da potencia��o: " + Math.pow(bas, exp));
                break;   
        	default:
				if (opcao != 0)
					System.out.println("Digite uma op��o v�lida.");  
				else
					System.out.println("Programa encerrado.");
			    break;
			}
			System.out.println();
		} while(opcao != 0);
		
		r.close();
	}
}
