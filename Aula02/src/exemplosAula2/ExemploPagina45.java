package exemplosAula2;

//import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ExemploPagina45 {

	public static void main(String[] args) {
		
		Calendar data_hora = Calendar.getInstance();
		// Ano, Mês, Dia, Hora, Minuto, Segundo
		data_hora.set(2017, 8, 5, 15, 38, 22);
		
		//Representações de hora
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		System.out.println(sdf.format(data_hora.getTime()));
		
		sdf = new SimpleDateFormat("hh:mm:ss");
		System.out.println(sdf.format(data_hora.getTime()));
		
		sdf = new SimpleDateFormat("hh:mm");
		System.out.println(sdf.format(data_hora.getTime()));
		
		System.out.println();
		
		//Representações de dia
		sdf = new SimpleDateFormat("d/MM/YYYY");
		System.out.println(sdf.format(data_hora.getTime()));
		
		sdf = new SimpleDateFormat("dd/MM/YYYY");
		System.out.println(sdf.format(data_hora.getTime()));
		
		System.out.println();
		
		//Representações de mês
		sdf = new SimpleDateFormat("dd/M/YYYY");
		System.out.println(sdf.format(data_hora.getTime()));
		
		sdf = new SimpleDateFormat("dd/MM/YYYY");
		System.out.println(sdf.format(data_hora.getTime()));
		
		sdf = new SimpleDateFormat("dd/MMM/YYYY");
		System.out.println(sdf.format(data_hora.getTime()));
		
		sdf = new SimpleDateFormat("dd/MMMM/YYYY");
		System.out.println(sdf.format(data_hora.getTime()));
		
		System.out.println();
		
		//Representações de ano
		sdf = new SimpleDateFormat("dd/MM/yy");
	    System.out.println(sdf.format(data_hora.getTime()));
	    
	  	sdf = new SimpleDateFormat("dd/MM/yyyy");
	  	System.out.println(sdf.format(data_hora.getTime()));
	  	
	  	System.out.println();
		
	}

}
