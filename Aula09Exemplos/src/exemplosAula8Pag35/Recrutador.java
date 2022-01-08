package exemplosAula8Pag35;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import exemplosAula8Pag13a23.Curriculo;
import exemplosAula8Pag13a23.Vaga;

public class Recrutador {
	private double maiorPontuacao = Double.NEGATIVE_INFINITY; // Negativo "infinito".
	private double menorPontuacao = Double.POSITIVE_INFINITY; // Positivo "infinito".
	private double mediaPontuacao = 0;
	private List<Curriculo> maioresPontuacoes;
	
	public void avaliaCurriculos(Vaga vaga) {
		if (vaga.getCurriculos().size() == 0)
			throw new RuntimeException("Esta vaga não tem currículos associados!");
			
		double total = 0;
		
		for (Curriculo curriculo : vaga.getCurriculos()) {
			if (curriculo.getPontuacao() > maiorPontuacao)
				maiorPontuacao = curriculo.getPontuacao();
			if (curriculo.getPontuacao() < menorPontuacao)
				menorPontuacao = curriculo.getPontuacao();
			total += curriculo.getPontuacao();
		}
		if (total == 0)
			return;
		
		mediaPontuacao = total / vaga.getCurriculos().size();
		
		verificaTresMaioresPontuacoes(vaga);
	}
	
	public double getMaiorPontuacao() { return maiorPontuacao; }
	
	public double getMenorPontuacao() { return menorPontuacao; }
	
	public double getMediaPontuacao() { return mediaPontuacao; }
	
	public List<Curriculo> getTresMaioresPontuacoes() { return maioresPontuacoes; }
	
	private void verificaTresMaioresPontuacoes(Vaga vaga) {
		maioresPontuacoes = new ArrayList<Curriculo>(vaga.getCurriculos());
		
		maioresPontuacoes.sort(new Comparator<Curriculo>() {
			public int compare(Curriculo c1, Curriculo c2) {
				if (c1.getPontuacao() < c2.getPontuacao())
					return 1;
				if (c1.getPontuacao() > c2.getPontuacao())
					return -1;
				return 0;
			}
		});
		maioresPontuacoes = maioresPontuacoes.subList(0,
				            maioresPontuacoes.size() > 3 ? 3 : maioresPontuacoes.size());
	}

}
