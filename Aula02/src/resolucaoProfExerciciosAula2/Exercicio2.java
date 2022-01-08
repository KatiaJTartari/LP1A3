package resolucaoProfExerciciosAula2;

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
		
	 	System.out.println("a) " + texto.substring(texto.indexOf("E tossia"), texto.indexOf(". Os altos")) + "\n");
		
		texto = texto.replace("alienista", "psiquiatra");
		System.out.println("b) " + texto + "\n");

		texto = texto.replace("Crispim Soares", "Crispim Soares".toUpperCase());
		System.out.println("c) " + texto + "\n");
		
		System.out.println("d)");
		if (texto.contains("vila"))
			System.out.println("O texto contém a palavra 'vila'");
		else
			System.out.println("O texto não contém a palavra 'vila'");
		
		if (texto.contains("custo"))
			System.out.println("O texto contém a palavra 'custo'");
		else
			System.out.println("O texto não contém a palavra 'custo'");
		
		if (texto.contains("receio"))
			System.out.println("O texto contém a palavra 'receio'");
		else
			System.out.println("O texto não contém a palavra 'receio'");

		System.out.println();
		
		int inicio = 0, x = 0;
		while (texto.indexOf("não", inicio) != -1) {
			   inicio = texto.indexOf("não", inicio) + 1;
			   x++;
		}
		System.out.println("e) A palavra 'não' aparece " + x + " vezes no texto.\n");
				
		System.out.println("f) o texto possui " + texto.length() + " caracteres.\n");
		
		int compTextoOriginal = texto.length();
		texto = texto.replace(" ", "");
		System.out.println("g) O texto possui " + (compTextoOriginal - texto.length()) + " espaços.");
			
	}
}

	
