package exerciciosAula2;

import java.text.DateFormatSymbols;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Exercicio4 {

	public static void main(String[] args) {
		
		System.out.println(" 257 -> 00257:");
		int numero = 257;
		System.out.println(String.format("%05d", numero));
		
		
		System.out.println("\n 2350000 -> 2.350.000:");
		DecimalFormat df1 = new DecimalFormat("#,##0");
		System.out.println(df1.format(2350000));
		
		
		System.out.println("\n 5.6 -> 5,600:");
		DecimalFormat df = new DecimalFormat("#.000");
		System.out.println(df.format(5.6));
		
		
		System.out.println("\n 1.278 -> 127,8%:");
		double porcentagem = 1.278;
		//Cria um objeto NumberFormat com a formatação de porcentagem.
		NumberFormat nf = NumberFormat.getPercentInstance();
		nf.setMinimumFractionDigits(1); //Número mínimo de casas decimais.
		System.out.println(nf.format(porcentagem));
		
		
		System.out.println("\n 15/07/2016 -> Sexta-feira, 15/Julho/2016:");
		Calendar data = Calendar.getInstance();
		// Ano, Mês, Dia
		data.set(2016, 6, 15);
		
		/*System.out.println(new DateFormatSymbols().getWeekdays()[data.get(Calendar.DAY_OF_WEEK)] + ", ");
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MMMM/YYYY");
		System.out.println(sdf.format(data.getTime()));*/
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MMMM/YYYY");
		System.out.println(new DateFormatSymbols().getWeekdays()[data.get(Calendar.DAY_OF_WEEK)] + ", " +
		(sdf.format(data.getTime())));
		
	}
}
