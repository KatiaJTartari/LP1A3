package exemplosAula6;

public class ExemploPag12TryECatch {

	public static void main(String[] args) {
		try { // Lança a exceção.
			int numero = Integer.parseInt("12a4");
			System.out.println("Entrada convertida para o tipo inteiro!");
		} catch (NumberFormatException e) { // Captura a exceção.
			// Trata a exceção.
			System.out.println("A operação retornou o seguinte erro:");
			System.out.println(e.getMessage());
		}
		
		System.out.println("Fim do programa!"); // A execução continua após o bloco catch. 
	}
}
