package exemplosAula8Pag37a39;

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
