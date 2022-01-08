package exerciciosAula2;

public class Exercicio2 {

	public static void main(String[] args) {
		
		String texto = "Uma ideia traz outra; o boticário imaginou que, uma vez preso o alienista, viriam também buscá-lo\r\n"
				+ "a ele, na qualidade de cúmplice. Esta ideia foi o melhor dos vesicatórios. Crispim Soares ergueu-se,\r\n"
				+ "disse que estava bom, que ia sair; e apesar de todos os esforços e protestos da consorte vestiu-se e\r\n"
				+ "saiu. Os velhos cronistas são unânimes em dizer que a certeza de que o marido ia colocar-se\r\n"
				+ "nobremente ao lado do alienista consolou grandemente a esposa do boticário; e notam com muita\r\n"
				+ "perspicácia, o imenso poder moral de uma ilusão; porquanto, o boticário caminhou resolutamente\r\n"
				+ "ao palácio do governo, não à casa do alienista. Ali chegando, mostrou-se admirado de não ver o\r\n"
				+ "barbeiro, a quem ia apresentar os seus protestos de adesão, não o tendo feito desde a véspera por\r\n"
				+ "enfermo. E tossia com algum custo. Os altos funcionários que lhe ouviam esta declaração,\r\n"
				+ "sabedores da intimidade do boticário com o alienista, compreenderam toda a importância da\r\n"
				+ "adesão nova e trataram a Crispim Soares com apurado carinho; afirmaram-lhe que o barbeiro não\r\n"
				+ "tardava; Sua Senhoria tinha ido à Casa Verde, a negócio importante, mas não tardava. Deram-lhe\r\n"
				+ "cadeira, refrescos, elogios; disseram-lhe que a causa do ilustre Porfírio era a de todos os patriotas;\r\n"
				+ "ao que o boticário ia repetindo que sim, que nunca pensara outra coisa, que isso mesmo mandaria\r\n"
				+ "declarar a Sua Majestade.";
		
/* a) Recupere/extraia do texto a frase “E tossia com algum custo” e retorne-a ao usuário.
Não modifique o texto. Sugestão: use os métodos substring e indexOf. */
		System.out.println("ITEM A:");
		//System.out.println(texto.indexOf("E tossia com algum custo"));
		System.out.println(texto.substring(texto.indexOf("E tossia com algum custo"), 815));
		
/* b) Substitua as ocorrências de “alienista” por “psiquiatra”. */		
		System.out.println("\nITEM B:");
		texto = texto.replace("alienista","psiquiatra");
		System.out.println(texto);

/* c) Altere as ocorrências de “Crispim Soares” para letras maiúsculas. Sugestão: use os
métodos replace e toUpperCase (o 2º parâmetro do método replace não pode ser 
simplesmente “CRISPIM SOARES”).*/		
		System.out.println("\nITEM C:");
		//System.out.println(texto.toUpperCase(texto = texto.replace("Crispim Soares","CRISPIM SOARES")));
		System.out.println(texto = texto.replace("Crispim Soares", "CRISPIM SOARES"));
		
		
/* d) Retorne se o texto contém as palavras “vila”, “custo” e “receio”. */
		System.out.println("\nITEM D:");
		System.out.println(texto.contains("vila"));
		System.out.println(texto.contains("custo"));
		System.out.println(texto.contains("receio"));

/* e) Retorne quantas vezes a palavra “não” aparece no texto. Sugestão: use o método indexOf. */		
		System.out.println("\nITEM E:");
		System.out.println(texto.indexOf("não"));
				
/* f) Retorne quantos caracteres o texto possui. */
		System.out.println("\nITEM F:");
		System.out.println(texto.length());
		
/* g) Retorne quantos espaços o texto possui. Sugestão: remova todos os espaços do texto,
em seguida veja a diferença de caracteres entre o texto original e o texto sem espaços. */	
		System.out.println("\nITEM G:");
		System.out.println(texto.trim());
		
		
	}
}
