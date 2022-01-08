package exemplosAula6;

public class ExemploPag12TryECatch {

	public static void main(String[] args) {
		try { // Lan�a a exce��o.
			int numero = Integer.parseInt("12a4");
			System.out.println("Entrada convertida para o tipo inteiro!");
		} catch (NumberFormatException e) { // Captura a exce��o.
			// Trata a exce��o.
			System.out.println("A opera��o retornou o seguinte erro:");
			System.out.println(e.getMessage());
		}
		
		System.out.println("Fim do programa!"); // A execu��o continua ap�s o bloco catch. 
	}
}
