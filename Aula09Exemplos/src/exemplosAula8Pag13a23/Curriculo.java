package exemplosAula8Pag13a23;

public class Curriculo {
	private Candidato candidato;
	private double pontuacao;
	
	public Curriculo(Candidato candidato, double pontuacao) {
		this.candidato = candidato;
		this.pontuacao = pontuacao;
	}
	
	public Candidato getCandidato() { return candidato; }
	
	public double getPontuacao() { return pontuacao; }
}
