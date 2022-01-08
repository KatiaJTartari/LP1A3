package exemplosAula2;

public class ExemploPagina39 {

	public static void main(String[] args) {
		
		String texto = "azul, verde, amarelo, azul, amarelo";
		System.out.println(texto.indexOf("azul"));
		System.out.println(texto.indexOf("azul", 2));
		System.out.println(texto.indexOf("AZUL"));
		System.out.println(texto.lastIndexOf("amarelo"));
	}

}
