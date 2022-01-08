package exemplosAula2;

public class ExemploPagina24 {

	public static void main(String[] args) {
		
		System.out.println(" Valor retornado: " + Math.round(1.37));
		System.out.println(" Valor retornado: " + Math.round(2.8));
		System.out.println(" Valor retornado: " + Math.round(-1.37));
		System.out.println(" Valor retornado: " + Math.round(-2.8));
		
		//Para números com casa decimal ".5", o método arredonda para o número inteiro mais alto.
		System.out.println(" Valor retornado: " + Math.round(3.5));
		System.out.println(" Valor retornado: " + Math.round(4.5));
		System.out.println(" Valor retornado: " + Math.round(-3.5));
		System.out.println(" Valor retornado: " + Math.round(-4.5));
	}

}
