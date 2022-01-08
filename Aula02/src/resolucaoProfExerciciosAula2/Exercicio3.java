package resolucaoProfExerciciosAula2;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		int opcao, numero = 0;
		String dt;
		Calendar data = Calendar.getInstance();
		
		Scanner r = new Scanner(System.in);
		
		SimpleDateFormat sdfData = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Informe uma data no formato dd/MM/yyyy: ");
		dt = r.nextLine();
		
		data.set(Integer.parseInt(dt.substring(6)),
				(Integer.parseInt(dt.substring(3, 5)) -1),
				 Integer.parseInt(dt.substring(0, 2)));		
										
		do {							
			System.out.println("OPÇÕES:");
			System.out.println("1) Adicionar dias");
			System.out.println("2) Adicionar meses");
			System.out.println("3) Adicionar anos");
			System.out.println("4) Subtrair dias");
			System.out.println("5) Subtrair meses");
			System.out.println("6) Subtrair anos");
			System.out.println("Digite uma opção (0 para sair): ");
			opcao = r.nextInt();
						
			switch (opcao) {
			case 1: 
				System.out.print("Informe quantos dias deseja adicionar: ");
				numero = r.nextInt();
		        data.set(Calendar.DAY_OF_MONTH, data.get(Calendar.DAY_OF_MONTH) + numero);
		        System.out.println("Nova data: " + sdfData.format(data.getTime()));
		        break;
			case 2: 
				System.out.print("Informe quantos meses deseja adicionar: ");
				numero = r.nextInt();
				data.set(Calendar.MONTH, data.get(Calendar.MONTH) + numero);
				System.out.println("Nova data: " + sdfData.format(data.getTime()));
                break;
			case 3: 
				System.out.print("Informe quantos anos deseja adicionar: ");
				numero = r.nextInt();
				data.set(Calendar.YEAR, data.get(Calendar.YEAR) + numero);
				System.out.println("Nova data: " + sdfData.format(data.getTime()));
                break;   
			case 4: 
				System.out.print("Informe quantos dias deseja subtrair: "); 
				numero = r.nextInt();
		        data.set(Calendar.DAY_OF_MONTH, data.get(Calendar.DAY_OF_MONTH) - numero);
		        System.out.println("Nova data: " + sdfData.format(data.getTime()));
                break;
			case 5: 
				System.out.print("Informe quantos meses deseja subtrair: ");
				numero = r.nextInt();
				data.set(Calendar.MONTH, data.get(Calendar.MONTH) - numero);
				 System.out.println("Nova data: " + sdfData.format(data.getTime()));
                break;
			case 6: 
				System.out.print("Informe quantos anos deseja subtrair: "); 
				numero = r.nextInt();
				data.set(Calendar.YEAR, data.get(Calendar.YEAR) - numero);
				System.out.println("Nova data: " + sdfData.format(data.getTime()));
			default:
				if (opcao != 0)
					System.out.println("digite uma opção válida.");  
				else
					System.out.println("Programa encerrado.");
			    break;
			}
		}while(opcao != 0);
		
		r.close();

	}
}
