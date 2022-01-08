package exemplosAula2;

//import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ExemploPagina48 {

	public static void main(String[] args) throws ParseException {
		
		//Conversão de String para int
		String numero1 = "150";
		System.out.println("String->int: " + (Integer.parseInt(numero1) + 10));
		
		//Conversão de String para long
		String numero2 = "1234567890123456789";
		System.out.println("String->long: " + (Long.parseLong(numero2) + 10));
		
		//Conversão de String para float
		String numero3 = "23.56";
		System.out.println("String->float: " + (Float.parseFloat(numero3) + 10));
		
		//Conversão de String para double
		String numero4 = "78359.17829";
		System.out.println("String->double: " + (Double.parseDouble(numero4) + 10));
		
		//Conversão de String para Calendar
		String data = "10/02/2016";
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Calendar d = Calendar.getInstance();
		d.setTime(sdf.parse(data));
		System.out.println("String->Calendar: \n" + 
		                   "Dia: " + d.get(Calendar.DAY_OF_MONTH) + "\n" +
		                   "Mês: " + d.get(Calendar.MONTH) + "\n" +
		                   "Ano: " + d.get(Calendar.YEAR));
		
	}

}
