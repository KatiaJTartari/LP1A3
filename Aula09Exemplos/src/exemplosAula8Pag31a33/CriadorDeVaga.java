package exemplosAula8Pag31a33;

import exemplosAula8Pag13a23.Candidato;
import exemplosAula8Pag13a23.Curriculo;
import exemplosAula8Pag13a23.Vaga;

public class CriadorDeVaga {
	private Vaga vaga;
	
	public CriadorDeVaga para(String descricao) {
		this.vaga = new Vaga(descricao);
		return this;
	}

	public CriadorDeVaga curriculo(Candidato candidato, double pontuacao) {
		vaga.recebe(new Curriculo(candidato, pontuacao));
		return this;
	}
	
	public Vaga cria() { return vaga; }
}
