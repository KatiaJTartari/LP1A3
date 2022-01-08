package exemplosAula6;

public class ExemploPag13TryECatchEClasseException {

	public static void main(String[] args) {
		try { // Lan�a a exce��o.
			int numero = Integer.parseInt("12a4");
			System.out.println("Entrada convertida para o tipo inteiro!");
		} catch (Exception e) { // Captura a exce��o.
			// Trata a exce��o.
			System.out.println("A opera��o retornou o seguinte erro:");
			if (e.getClass().toString().equals("class java.lang.NumberFormatException"))
			System.out.println("O n�mero informado � inv�lido!");
		}
		
		System.out.println("Fim do programa!"); // A execu��o continua ap�s o bloco catch. 

	}

}
