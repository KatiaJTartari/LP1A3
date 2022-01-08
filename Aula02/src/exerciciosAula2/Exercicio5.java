package exerciciosAula2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) throws ParseException {
		
        int opcao;
		
		Scanner dado = new Scanner(System.in);
		
		System.out.println("\tPrograma lê uma String e converte de acordo com a opção escolhida:");
					
		do {
			System.out.print("\n Digite a String: ");
			String stringLida = dado.next(); // Retorna a cadeia de caracteres (sem espaços) lida.
								
			System.out.println("\n\tMENU DE OPÇÕES:");
			System.out.println("1- Converter para int");
			System.out.println("2- Converter para float");
			System.out.println("3- Converter para double");
			System.out.println("4- Converter para Calendar (data)");
			System.out.println("5- Converter para Calendar (hora)");
			System.out.println("0- Sair");
			System.out.print("\n Opção: ");
			opcao = dado.nextInt();
						
			switch (opcao) {
			case 1: 
				System.out.println("String -> int: " + (Integer.parseInt(stringLida)));
				break;
			case 2: 
				System.out.println("String -> float: " + (Float.parseFloat(stringLida)));
                break;
			case 3: 
				System.out.println("String -> double: " + (Double.parseDouble(stringLida)));
                break; 
			case 4: 
				SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
				Calendar data = Calendar.getInstance();
				data.setTime(sdf.parse(stringLida));
				System.out.println("String -> Calendar (data): \n" + 
				                   "Dia: " + data.get(Calendar.DAY_OF_MONTH) + "\n" +
				                   "Mês: " + data.get(Calendar.MONTH) + "\n" +
				                   "Ano: " + data.get(Calendar.YEAR));
                break;
			case 5: 
				SimpleDateFormat sdf2 = new SimpleDateFormat("HH:mm:ss");
				Calendar hora = Calendar.getInstance();
				hora.setTime(sdf2.parse(stringLida));
				System.out.println("String -> Calendar (hora): " + sdf2.format(hora.getTime()));
				
				break;    
            
            default:
				if (opcao != 0)
					System.out.println("\n Opção inválida.\n");  
				else
					System.out.println("\n Programa encerrado.\n");
			    break;
			}
			
		}while(opcao != 0);
		dado.close();
		
	}
}
