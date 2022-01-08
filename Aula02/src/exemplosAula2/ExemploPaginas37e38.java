package exemplosAula2;

public class ExemploPaginas37e38 {

	public static void main(String[] args) {
		
		System.out.println("Exemplo Página 37");
		String texto = "Quando o Sol bater na janela do teu quarto";
		System.out.println(texto.contains("jan"));
		System.out.println(texto.contains("JAN"));
		System.out.println(texto.contains(" na "));
		
		System.out.println("\nExemplo Página 38");
		System.out.println(texto.startsWith("Q"));
		System.out.println(texto.startsWith("S", 9));
		System.out.println(texto.startsWith("q"));
		System.out.println(texto.endsWith("to"));
		System.out.println(texto.endsWith("TO"));

	}

}
