package exerciciosAula2;

import java.util.Calendar;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
        int opcao;
        		
		Scanner dado = new Scanner(System.in);
		
		System.out.print("Digite um Dia: ");
		int dia = dado.nextInt();
		System.out.print("Digite um M�s de 0 � 11: ");
		int mes = dado.nextInt();
		System.out.print("Digite um Ano: ");
		int ano = dado.nextInt();
						
		do {
						
			Calendar data = Calendar.getInstance();
			// Ano, M�s, Dia
			data.set(ano, mes, dia);
																	
			System.out.println("\n MENU DE OP��ES:");
			System.out.println("1- Adicionar Dias");
			System.out.println("2- Adicionar Meses");
			System.out.println("3- Adicionar Anos");
			System.out.println("4- Subtrair Dias");
			System.out.println("5- Subtrair Meses");
			System.out.println("6- Subtrair Anos");
			System.out.println("0- Sair");
			System.out.print("\n Op��o: ");
			
			opcao = dado.nextInt();
						
			switch (opcao) {
			case 1: 
				System.out.print("\n Informe quantos dias devem ser adicionados: ");
				int diaAdd = dado.nextInt();
		        data.set(Calendar.DAY_OF_MONTH, data.get(Calendar.DAY_OF_MONTH) + diaAdd);
		        System.out.println("Dia: " + data.get(Calendar.DAY_OF_MONTH));
		        System.out.println("M�s: " + data.get(Calendar.MONTH));
				System.out.println("Ano: " + data.get(Calendar.YEAR));
				break;
			case 2: 
				System.out.print("\n Informe quantos meses devem ser adicionados: ");
				int mesAdd = dado.nextInt();
				data.set(Calendar.MONTH, data.get(Calendar.MONTH) + mesAdd);
				System.out.println("Dia: " + data.get(Calendar.DAY_OF_MONTH));
				System.out.println("M�s: " + data.get(Calendar.MONTH));
				System.out.println("Ano: " + data.get(Calendar.YEAR));
                break;
			case 3: 
				System.out.print("\n Informe quantos anos devem ser adicionados: ");
				int anosAdd = dado.nextInt();
				data.set(Calendar.YEAR, data.get(Calendar.YEAR) + anosAdd);
				System.out.println("Dia: " + data.get(Calendar.DAY_OF_MONTH));
				System.out.println("M�s: " + data.get(Calendar.MONTH));
				System.out.println("Ano: " + data.get(Calendar.YEAR));
                break;   
			case 4: 
				System.out.print("\n Informe quantos dias devem ser subtra�dos: "); 
				int diaSubt = dado.nextInt();
		        data.set(Calendar.DAY_OF_MONTH, data.get(Calendar.DAY_OF_MONTH) - diaSubt);
		        System.out.println("Dia: " + data.get(Calendar.DAY_OF_MONTH));
		        System.out.println("M�s: " + data.get(Calendar.MONTH));
				System.out.println("Ano: " + data.get(Calendar.YEAR));
                break;
			case 5: 
				System.out.print("\n Informe quantos meses devem ser subtra�dos: ");
				int mesSubt = dado.nextInt();
				data.set(Calendar.MONTH, data.get(Calendar.MONTH) - mesSubt);
				System.out.println("Dia: " + data.get(Calendar.DAY_OF_MONTH));
				System.out.println("M�s: " + data.get(Calendar.MONTH));
				System.out.println("Ano: " + data.get(Calendar.YEAR));
                break;
			case 6: 
				System.out.print("\n Informe quantos anos devem ser subtra�dos: "); 
				int anosSubt = dado.nextInt();
				data.set(Calendar.YEAR, data.get(Calendar.YEAR) - anosSubt);
				System.out.println("Dia: " + data.get(Calendar.DAY_OF_MONTH));
				System.out.println("M�s: " + data.get(Calendar.MONTH));
				System.out.println("Ano: " + data.get(Calendar.YEAR));
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
