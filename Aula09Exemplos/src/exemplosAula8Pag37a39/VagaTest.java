package exemplosAula8Pag37a39;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class VagaTest {
	private Candidato joao;
	private Vaga vaga;
	
	@Before
	public void executaAntesDeCadaMetodo() { this.joao = new Candidato("João"); }
	
	@Test
	public void naoDeveAceitarDoisCurriculosDoMesmoCandidato() {
		vaga = new CriadorDeVaga()
				.para("Analista de Sistemas")
				.curriculo(joao, 8)
				.curriculo(joao, 9)
				.cria();
		
		assertEquals(1, vaga.getCurriculos().size());
		assertEquals(8, vaga.getCurriculos().get(0).getPontuacao(), 0.001);
	}
	

}
