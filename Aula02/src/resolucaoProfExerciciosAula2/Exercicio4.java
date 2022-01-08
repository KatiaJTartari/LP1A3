package resolucaoProfExerciciosAula2;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Exercicio4 {

	public static void main(String[] args) {
		
		int numero1 = 257;
		int numero2 = 2350000;
		float numero3 = 5.6f;
		float numero4 = 1.278f;
		Calendar data = Calendar.getInstance();
		data.set(2016, 6, 15);
		
		System.out.println(String.format("%05d", numero1));
				
		DecimalFormat df = new DecimalFormat("#,###,##0");
		System.out.println(df.format(numero2));
				
		df = new DecimalFormat("0.000");
		System.out.println(df.format(numero3));
		
		NumberFormat nf = NumberFormat.getPercentInstance();
		    nf.setMinimumFractionDigits(1); 
		    System.out.println(nf.format(numero4));
				
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MMMM/YYYY");
		
		switch(data.get(Calendar.DAY_OF_WEEK)) {
		case 1: 
			System.out.println("Domingo, " + sdf.format(data.getTime()));
			break;
		case 2: 
			System.out.println("Segunda, " + sdf.format(data.getTime()));
			break;	
		case 3: 
			System.out.println("Terça, " + sdf.format(data.getTime()));
			break;
		case 4: 
			System.out.println("Quarta, " + sdf.format(data.getTime()));
			break;
		case 5: 
			System.out.println("Quinta, " + sdf.format(data.getTime()));
			break;
		case 6: 
			System.out.println("Sexta, " + sdf.format(data.getTime()));
			break;
		case 7: 
			System.out.println("Sábado, " + sdf.format(data.getTime()));
			break;
		}
	}
}
