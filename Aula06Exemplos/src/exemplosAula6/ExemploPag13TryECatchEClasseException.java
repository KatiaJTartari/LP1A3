package exemplosAula6;

public class ExemploPag13TryECatchEClasseException {

	public static void main(String[] args) {
		try { // Lança a exceção.
			int numero = Integer.parseInt("12a4");
			System.out.println("Entrada convertida para o tipo inteiro!");
		} catch (Exception e) { // Captura a exceção.
			// Trata a exceção.
			System.out.println("A operação retornou o seguinte erro:");
			if (e.getClass().toString().equals("class java.lang.NumberFormatException"))
			System.out.println("O número informado é inválido!");
		}
		
		System.out.println("Fim do programa!"); // A execução continua após o bloco catch. 

	}

}
