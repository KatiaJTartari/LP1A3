package exemplosAula2;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class ExemploPagina43 {

	public static void main(String[] args) {
		
		DecimalFormat df1 = new DecimalFormat("##0.00");
		System.out.println(df1.format(57.231));
		System.out.println(df1.format(57.287));
		System.out.println(df1.format(-57.231));
		System.out.println(df1.format(-57.287));
		System.out.println(df1.format(57.2));
		
		System.out.println();
		
		DecimalFormat df2 = new DecimalFormat("##0.0");
		df2.setRoundingMode(RoundingMode.UP); // Arredonda para o número mais distante de zero.
		System.out.println(df2.format(53.75));
		System.out.println(df2.format(-53.75));
		df2.setRoundingMode(RoundingMode.DOWN); // Arredonda para o número mais próximo de zero.
		System.out.println(df2.format(53.75));
		System.out.println(df2.format(-53.75));
		
		System.out.println();
		
		DecimalFormat df3 = new DecimalFormat("###,##0.00");
		System.out.println(df3.format(48500));

	}

}
