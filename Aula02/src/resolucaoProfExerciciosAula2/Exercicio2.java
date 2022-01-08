package resolucaoProfExerciciosAula2;

public class Exercicio2 {

	public static void main(String[] args) {
		
		String texto = "Uma ideia traz outra; o botic�rio imaginou que, uma vez preso o alienista, viriam tamb�m busc�-lo\r\n"
				+ "a ele, na qualidade de c�mplice. Esta ideia foi o melhor dos vesicat�rios. Crispim Soares ergueu-se,\r\n"
				+ "disse que estava bom, que ia sair; e apesar de todos os esfor�os e protestos da consorte vestiu-se e\r\n"
				+ "saiu. Os velhos cronistas s�o un�nimes em dizer que a certeza de que o marido ia colocar-se\r\n"
				+ "nobremente ao lado do alienista consolou grandemente a esposa do botic�rio; e notam com muita\r\n"
				+ "perspic�cia, o imenso poder moral de uma ilus�o; porquanto, o botic�rio caminhou resolutamente\r\n"
				+ "ao pal�cio do governo, n�o � casa do alienista. Ali chegando, mostrou-se admirado de n�o ver o\r\n"
				+ "barbeiro, a quem ia apresentar os seus protestos de ades�o, n�o o tendo feito desde a v�spera por\r\n"
				+ "enfermo. E tossia com algum custo. Os altos funcion�rios que lhe ouviam esta declara��o,\r\n"
				+ "sabedores da intimidade do botic�rio com o alienista, compreenderam toda a import�ncia da\r\n"
				+ "ades�o nova e trataram a Crispim Soares com apurado carinho; afirmaram-lhe que o barbeiro n�o\r\n"
				+ "tardava; Sua Senhoria tinha ido � Casa Verde, a neg�cio importante, mas n�o tardava. Deram-lhe\r\n"
				+ "cadeira, refrescos, elogios; disseram-lhe que a causa do ilustre Porf�rio era a de todos os patriotas;\r\n"
				+ "ao que o botic�rio ia repetindo que sim, que nunca pensara outra coisa, que isso mesmo mandaria\r\n"
				+ "declarar a Sua Majestade.";
		
	 	System.out.println("a) " + texto.substring(texto.indexOf("E tossia"), texto.indexOf(". Os altos")) + "\n");
		
		texto = texto.replace("alienista", "psiquiatra");
		System.out.println("b) " + texto + "\n");

		texto = texto.replace("Crispim Soares", "Crispim Soares".toUpperCase());
		System.out.println("c) " + texto + "\n");
		
		System.out.println("d)");
		if (texto.contains("vila"))
			System.out.println("O texto cont�m a palavra 'vila'");
		else
			System.out.println("O texto n�o cont�m a palavra 'vila'");
		
		if (texto.contains("custo"))
			System.out.println("O texto cont�m a palavra 'custo'");
		else
			System.out.println("O texto n�o cont�m a palavra 'custo'");
		
		if (texto.contains("receio"))
			System.out.println("O texto cont�m a palavra 'receio'");
		else
			System.out.println("O texto n�o cont�m a palavra 'receio'");

		System.out.println();
		
		int inicio = 0, x = 0;
		while (texto.indexOf("n�o", inicio) != -1) {
			   inicio = texto.indexOf("n�o", inicio) + 1;
			   x++;
		}
		System.out.println("e) A palavra 'n�o' aparece " + x + " vezes no texto.\n");
				
		System.out.println("f) o texto possui " + texto.length() + " caracteres.\n");
		
		int compTextoOriginal = texto.length();
		texto = texto.replace(" ", "");
		System.out.println("g) O texto possui " + (compTextoOriginal - texto.length()) + " espa�os.");
			
	}
}

	
