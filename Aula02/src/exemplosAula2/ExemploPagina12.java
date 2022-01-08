package exemplosAula2;

public class ExemploPagina12 {

	public static void main(String[] args) {
		
		double prova1 = 7;
		double prova2 = 5;
		double media = 0;
		String desempenho;
		
		media = (prova1 + prova2) / 2;
		
		if (media <= 5)
			desempenho = "INSATISFATÓRIO";
		else if (media <= 7)
			desempenho = "REGULAR";
		else if (media <= 8.5)
			desempenho = "BOM";
		else 
			desempenho = "ÓTIMO";
		
		System.out.println("O desempenho do aluno foi " + desempenho);

	}

}
