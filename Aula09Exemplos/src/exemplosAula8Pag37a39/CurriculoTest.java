package exemplosAula8Pag37a39;

import org.junit.Before;
import org.junit.Test;

public class CurriculoTest {
	private Candidato joao;
	//private Vaga vaga;
	
	@Before
	public void executaAntesDeCadaMetodo() { this.joao = new Candidato("João"); }
	
	@Test(expected=IllegalArgumentException.class)
	public void naoDeveAceitarCurriculosComPontuacaoMenorQueCinco() { new Curriculo(joao, 2); }

	@Test(expected=IllegalArgumentException.class)
	public void naoDeveAceitarCurriculosComPontuacaoMaiorQueDez() { new Curriculo(joao, 11); }
}
