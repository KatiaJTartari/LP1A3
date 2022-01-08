package exemplosAula8Pag31a33;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import exemplosAula8Pag13a23.Candidato;
import exemplosAula8Pag13a23.Curriculo;
import exemplosAula8Pag13a23.Recrutador;
import exemplosAula8Pag13a23.Vaga;

public class RecrutadorTest {
	private Recrutador recrutador;
	private Candidato joao, maria, jose, ana, pedro;
	private Vaga vaga;

	@Before // Indica que este método será executado uma vez antes de cada método de teste.
	public void executaAntesDeCadaMetodo() {
		this.recrutador = new Recrutador();

		this.joao = new Candidato("João");
		this.maria = new Candidato("Maria");
		this.jose = new Candidato("José");
		this.ana = new Candidato("Ana");
		this.pedro = new Candidato("Pedro");

		System.out.println("Início do teste");
	}

	@After // Indica que este método será executado uma vez depois de cada método de teste.
	public void executaDepoisDeCadaMetodo() {
		System.out.println("Fim do teste");
	}

	@BeforeClass // Indica que este método será executado uma única vez
					// antes de todos os métodos de teste.
	public static void executaAntesDaClasse() {
		System.out.println("Antes da classe");
	}

	@AfterClass // Indica que este método será executado uma única vez
				// depois de todos os métodos de teste.
	public static void executaDepoisDaClasse() {
		System.out.println("Depois da classe");
	}

	@Test
	public void deveAvaliarPontuacoesEmOrdemCrescente() {
		vaga = new CriadorDeVaga().para("Analista de Sistemas").curriculo(maria, 6).curriculo(joao, 8)
				.curriculo(jose, 9).cria();

		recrutador.avaliaCurriculos(vaga);

		assertEquals(9, recrutador.getMaiorPontuacao(), 0.001);
		assertEquals(6, recrutador.getMenorPontuacao(), 0.001);
	}

	@Test
	public void deveAvaliarPontuacoesEmOrdemDecrescente() {
		vaga = new CriadorDeVaga().para("Analista de Sistemas").curriculo(joao, 9).curriculo(maria, 8)
				.curriculo(jose, 7).curriculo(ana, 5).cria();

		recrutador.avaliaCurriculos(vaga);

		assertEquals(9, recrutador.getMaiorPontuacao(), 0.001);
		assertEquals(5, recrutador.getMenorPontuacao(), 0.001);
	}

	@Test
	public void deveAvaliarPontuacoesEmOrdemAleatoria() {
		vaga = new CriadorDeVaga().para("Analista de Sistemas").curriculo(joao, 10).curriculo(maria, 7)
				.curriculo(jose, 6).curriculo(ana, 10).curriculo(pedro, 8).cria();

		recrutador.avaliaCurriculos(vaga);

		assertEquals(10, recrutador.getMaiorPontuacao(), 0.001);
		assertEquals(6, recrutador.getMenorPontuacao(), 0.001);
	}

	@Test
	public void deveCalcularMediaDePontuacoes() {
		vaga = new CriadorDeVaga().para("Analista de Sistemas").curriculo(maria, 9).curriculo(joao, 8)
				.curriculo(jose, 6).cria();

		recrutador.avaliaCurriculos(vaga);

		assertEquals(7.666, recrutador.getMediaPontuacao(), 0.001);
	}

	@Test
	public void deveRetornarMediaZeroParaVagaSemCurriculos() {
		vaga = new CriadorDeVaga().para("Analista de Sistemas").cria();

		recrutador.avaliaCurriculos(vaga);

		assertEquals(0, recrutador.getMediaPontuacao(), 0.001);
	}

	@Test
	public void deveRetornarAsTresMaioresPontuacoes() {
		vaga = new CriadorDeVaga().para("Analista de Sistemas").curriculo(joao, 5).curriculo(maria, 6).curriculo(jose, 8).curriculo(ana, 10)
				.cria();

		recrutador.avaliaCurriculos(vaga);

		List<Curriculo> maiores = recrutador.getTresMaioresPontuacoes();

		assertEquals(3, maiores.size());
		assertEquals(10, maiores.get(0).getPontuacao(), 0.001);
		assertEquals(8, maiores.get(1).getPontuacao(), 0.001);
		assertEquals(6, maiores.get(2).getPontuacao(), 0.001);
	}

	@Test
	public void deveRetornarAsTresMaioresPontuacoesEmVagaComMenosDeTresCurriculos() {
		vaga = new CriadorDeVaga().para("Analista de Sistemas").curriculo(joao, 9).curriculo(maria, 8).cria();

		recrutador.avaliaCurriculos(vaga);

		List<Curriculo> maiores = recrutador.getTresMaioresPontuacoes();

		assertEquals(2, maiores.size());
		assertEquals(9, maiores.get(0).getPontuacao(), 0.001);
		assertEquals(8, maiores.get(1).getPontuacao(), 0.001);
	}

	@Test
	public void deveAvaliarPontuacoesDeVagaComApenasUmCurriculos() {
		vaga = new CriadorDeVaga().para("Analista de Sistemas").curriculo(joao, 8).cria();

		recrutador.avaliaCurriculos(vaga);

		List<Curriculo> maiores = recrutador.getTresMaioresPontuacoes();

		assertEquals(1, maiores.size());
		assertEquals(8, recrutador.getMaiorPontuacao(), 0.001);
		assertEquals(8, recrutador.getMenorPontuacao(), 0.001);
	}

	@Test
	public void deveRetornarListaVaziaEmVagaSemCurriculos() {
		vaga = new CriadorDeVaga().para("Analista de Sistemas").cria();

		recrutador.avaliaCurriculos(vaga);

		List<Curriculo> maiores = recrutador.getTresMaioresPontuacoes();

		assertEquals(0, maiores == null ? 0 : maiores.size());
		assertEquals(null, maiores); // Outra forma de validação.
	}

} // Fim da classe RecrutadorTest
