package resolucaoProfExerciciosAula2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) throws ParseException {
		
		 int opcao;
		 String dado;
			
			Scanner r = new Scanner(System.in);
														
			do {
				System.out.print("Informe um número (inteiro ou decimal), uma data no formato dd/MM/yyy ou uma hora no formato HH:mm:ss: ");
				dado = r.nextLine();
				
				if (dado.contains(","))
					dado = dado.replace(",", ".");
													
				System.out.println("OPÇÕES:");
				System.out.println("1) Converter para int");
				System.out.println("2) Converter para float");
				System.out.println("3) Converter para double");
				System.out.println("4) Converter para Calendar (data)");
				System.out.println("5) Converter para Calendar (hora)");
				System.out.print("Digite uma opção (0 para sair): ");
				opcao = r.nextInt();
				r.nextLine();
				
				switch (opcao) {
				case 1: 
					System.out.println("String -> int: " + (int) Float.parseFloat(dado));
					break;
				case 2: 
					System.out.println("String -> float: " + Float.parseFloat(dado));
	                break;
				case 3: 
					System.out.println("String -> double: " + Double.parseDouble(dado));
	                break; 
				case 4: 
					SimpleDateFormat sdfData = new SimpleDateFormat("dd/MM/yyyy");
					Calendar data = Calendar.getInstance();
					data.setTime(sdfData.parse(dado));
					System.out.println("String -> Calendar (data): " + sdfData.format(data.getTime()));
					break;
				case 5: 
					SimpleDateFormat sdfHora = new SimpleDateFormat("HH:mm:ss");
					Calendar hora = Calendar.getInstance();
					hora.setTime(sdfHora.parse(dado));
					System.out.println("String -> Calendar (hora): " + sdfHora.format(hora.getTime()));
					break;    
	            default:
					if (opcao != 0)
						System.out.println("Digiteuma opção válida.");  
					else
						System.out.println("Programa encerrado.");
				    break;
				}
				System.out.println();
			}while(opcao != 0);
			
			r.close();
	}
}
