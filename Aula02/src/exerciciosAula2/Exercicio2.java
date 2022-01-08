package exerciciosAula2;

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
		
/* a) Recupere/extraia do texto a frase �E tossia com algum custo� e retorne-a ao usu�rio.
N�o modifique o texto. Sugest�o: use os m�todos substring e indexOf. */
		System.out.println("ITEM A:");
		//System.out.println(texto.indexOf("E tossia com algum custo"));
		System.out.println(texto.substring(texto.indexOf("E tossia com algum custo"), 815));
		
/* b) Substitua as ocorr�ncias de �alienista� por �psiquiatra�. */		
		System.out.println("\nITEM B:");
		texto = texto.replace("alienista","psiquiatra");
		System.out.println(texto);

/* c) Altere as ocorr�ncias de �Crispim Soares� para letras mai�sculas. Sugest�o: use os
m�todos replace e toUpperCase (o 2� par�metro do m�todo replace n�o pode ser 
simplesmente �CRISPIM SOARES�).*/		
		System.out.println("\nITEM C:");
		//System.out.println(texto.toUpperCase(texto = texto.replace("Crispim Soares","CRISPIM SOARES")));
		System.out.println(texto = texto.replace("Crispim Soares", "CRISPIM SOARES"));
		
		
/* d) Retorne se o texto cont�m as palavras �vila�, �custo� e �receio�. */
		System.out.println("\nITEM D:");
		System.out.println(texto.contains("vila"));
		System.out.println(texto.contains("custo"));
		System.out.println(texto.contains("receio"));

/* e) Retorne quantas vezes a palavra �n�o� aparece no texto. Sugest�o: use o m�todo indexOf. */		
		System.out.println("\nITEM E:");
		System.out.println(texto.indexOf("n�o"));
				
/* f) Retorne quantos caracteres o texto possui. */
		System.out.println("\nITEM F:");
		System.out.println(texto.length());
		
/* g) Retorne quantos espa�os o texto possui. Sugest�o: remova todos os espa�os do texto,
em seguida veja a diferen�a de caracteres entre o texto original e o texto sem espa�os. */	
		System.out.println("\nITEM G:");
		System.out.println(texto.trim());
		
		
	}
}
