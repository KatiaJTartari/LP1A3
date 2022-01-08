package exemplosAula2;

import java.util.Calendar;

public class ExemploPaginas40e41 {

	public static void main(String[] args) {
		
		Calendar data_hora = Calendar.getInstance();
		// Ano, Mês, Dia, Hora, Minuto, Segundo
		data_hora.set(2017, 8, 5, 15, 38, 22);
		
		System.out.println("EXEMPLO PÁGINA 40 \n");
		System.out.println("Dia: " + data_hora.get(Calendar.DAY_OF_MONTH));
		System.out.println("Mês: " + data_hora.get(Calendar.MONTH));
		System.out.println("Ano: " + data_hora.get(Calendar.YEAR));
		System.out.println("Dia da Semana: " + data_hora.get(Calendar.DAY_OF_WEEK));
		System.out.println();
		
		System.out.println("Horas: " + data_hora.get(Calendar.HOUR));
		System.out.println("Horas: " + data_hora.get(Calendar.HOUR_OF_DAY));
		System.out.println("Minutos: " + data_hora.get(Calendar.MINUTE));
		System.out.println("Segundos: " + data_hora.get(Calendar.SECOND));
			
		
		System.out.println("\n\nEXEMPLO PÁGINA 41 \n");
		data_hora.set(Calendar.DAY_OF_MONTH, data_hora.get(Calendar.DAY_OF_MONTH) + 12);
		data_hora.set(Calendar.MONTH, data_hora.get(Calendar.MONTH) - 3);
		data_hora.set(Calendar.YEAR, data_hora.get(Calendar.YEAR) + 2);
		
		data_hora.set(Calendar.HOUR, data_hora.get(Calendar.HOUR) + 4);
		data_hora.set(Calendar.MINUTE, data_hora.get(Calendar.MINUTE) + 18);
		data_hora.set(Calendar.SECOND, data_hora.get(Calendar.SECOND) - 8);
		
		System.out.println("Dia: " + data_hora.get(Calendar.DAY_OF_MONTH));
		System.out.println("Mês: " + data_hora.get(Calendar.MONTH));
		System.out.println("Ano: " + data_hora.get(Calendar.YEAR));
		
		System.out.println("Horas: " + data_hora.get(Calendar.HOUR_OF_DAY));
		System.out.println("Minutos: " + data_hora.get(Calendar.MINUTE));
		System.out.println("Segundos: " + data_hora.get(Calendar.SECOND));

	}

}
