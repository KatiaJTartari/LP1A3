package exemplosAula2;

public class ExemploPagina24 {

	public static void main(String[] args) {
		
		System.out.println(" Valor retornado: " + Math.round(1.37));
		System.out.println(" Valor retornado: " + Math.round(2.8));
		System.out.println(" Valor retornado: " + Math.round(-1.37));
		System.out.println(" Valor retornado: " + Math.round(-2.8));
		
		//Para n�meros com casa decimal ".5", o m�todo arredonda para o n�mero inteiro mais alto.
		System.out.println(" Valor retornado: " + Math.round(3.5));
		System.out.println(" Valor retornado: " + Math.round(4.5));
		System.out.println(" Valor retornado: " + Math.round(-3.5));
		System.out.println(" Valor retornado: " + Math.round(-4.5));
	}

}
