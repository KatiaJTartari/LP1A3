package exemplosAula2;

import java.text.DateFormatSymbols;
import java.util.Calendar;

public class ExemploPagina46 {

	public static void main(String[] args) {
		
		Calendar data_hora = Calendar.getInstance();
		// Ano, Mês, Dia, Hora, Minuto, Segundo
		data_hora.set(2017, 8, 5, 15, 38, 22);
		
		System.out.println("Mês: " + new DateFormatSymbols().
				getMonths()[data_hora.get(Calendar.MONTH)]);
		System.out.println("Mês: " + new DateFormatSymbols().
				getShortMonths()[data_hora.get(Calendar.MONTH)]);
		System.out.println();
		
		System.out.println("Dia da Semana: " + new DateFormatSymbols().
				getWeekdays()[data_hora.get(Calendar.DAY_OF_WEEK)]);
		System.out.println("Dia da Semana: " + new DateFormatSymbols().
				getShortWeekdays()[data_hora.get(Calendar.DAY_OF_WEEK)]);
		System.out.println();
		
		System.out.println("Hora (AM/PM): " + data_hora.get(Calendar.HOUR) + ":" +
		                                      data_hora.get(Calendar.MINUTE) + " " +
		                                      new DateFormatSymbols().
		                                      getAmPmStrings()[data_hora.get(Calendar.AM_PM)]);
		                                      
    }
}
