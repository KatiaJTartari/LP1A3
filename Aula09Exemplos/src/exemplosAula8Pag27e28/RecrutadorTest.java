package exemplosAula8Pag27e28;

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
		
		this.vaga = new Vaga("Analista de Sistemas");
		
		System.out.println("Início do teste");
	}
	
	@After // Indica que este método será executado uma vez depois de cada método de teste.
	public void executaDepoisDeCadaMetodo() { System.out.println("Fim do teste"); }
	
	@BeforeClass // Indica que este método será executado uma única vez 
	             // antes de todos os métodos de teste.
	public static void executaAntesDaClasse() { System.out.println("Antes da classe"); }
	
	@AfterClass // Indica que este método será executado uma única vez 
                // depois de todos os métodos de teste.
    public static void executaDepoisDaClasse() { System.out.println("Depois da classe"); }
	
	@Test
	public void deveAvaliarPontuacoesEmOrdemCrescente() {
		vaga.recebe(new Curriculo(maria, 6));
		vaga.recebe(new Curriculo(joao, 8));
		vaga.recebe(new Curriculo(jose, 9));
		
		recrutador.avaliaCurriculos(vaga);
		
		assertEquals(9, recrutador.getMaiorPontuacao(), 0.001);
		assertEquals(6, recrutador.getMenorPontuacao(), 0.001);
	}
	
	@Test
	public void deveAvaliarPontuacoesEmOrdemDecrescente() {
		vaga.recebe(new Curriculo(joao, 9));
		vaga.recebe(new Curriculo(maria, 8));
		vaga.recebe(new Curriculo(jose, 7));
		vaga.recebe(new Curriculo(ana, 5));
		
		recrutador.avaliaCurriculos(vaga);
		
		assertEquals(9, recrutador.getMaiorPontuacao(), 0.001);
		assertEquals(5, recrutador.getMenorPontuacao(), 0.001);
	}
	
	@Test
	public void deveAvaliarPontuacoesEmOrdemAleatoria() {
		vaga.recebe(new Curriculo(joao, 10));
		vaga.recebe(new Curriculo(maria, 7));
		vaga.recebe(new Curriculo(jose, 6));
		vaga.recebe(new Curriculo(ana, 10));
		vaga.recebe(new Curriculo(pedro, 8));
		
		recrutador.avaliaCurriculos(vaga);
		
		assertEquals(10, recrutador.getMaiorPontuacao(), 0.001);
		assertEquals(6, recrutador.getMenorPontuacao(), 0.001);
	}
	
	@Test
	public void deveCalcularMediaDePontuacoes() {
		vaga.recebe(new Curriculo(maria, 9));
		vaga.recebe(new Curriculo(joao, 8));
		vaga.recebe(new Curriculo(jose, 6));
		
		recrutador.avaliaCurriculos(vaga);
		
		assertEquals(7.666, recrutador.getMediaPontuacao(), 0.001);
	}
	
	@Test
	public void deveRetornarMediaZeroParaVagaSemCurriculos() {
		
		recrutador.avaliaCurriculos(vaga);
		
		assertEquals(0, recrutador.getMediaPontuacao(), 0.001);
	}

	@Test
	public void deveRetornarAsTresMaioresPontuacoes() {
		vaga.recebe(new Curriculo(joao, 5));
		vaga.recebe(new Curriculo(maria, 6));
		vaga.recebe(new Curriculo(jose, 8));
		vaga.recebe(new Curriculo(ana, 10));
		
		recrutador.avaliaCurriculos(vaga);
		
		List<Curriculo> maiores = recrutador.getTresMaioresPontuacoes();
		
		assertEquals(3, maiores.size());
		assertEquals(10, maiores.get(0).getPontuacao(), 0.001);
		assertEquals(8, maiores.get(1).getPontuacao(), 0.001);
		assertEquals(6, maiores.get(2).getPontuacao(), 0.001);
	}
	
	@Test
	public void deveRetornarAsTresMaioresPontuacoesEmVagaComMenosDeTresCurriculos() {
		vaga.recebe(new Curriculo(joao, 9));
		vaga.recebe(new Curriculo(maria, 8));
				
		recrutador.avaliaCurriculos(vaga);
		
		List<Curriculo> maiores = recrutador.getTresMaioresPontuacoes();
		
		assertEquals(2, maiores.size());
		assertEquals(9, maiores.get(0).getPontuacao(), 0.001);
		assertEquals(8, maiores.get(1).getPontuacao(), 0.001);
	}
	
	@Test
	public void deveAvaliarPontuacoesDeVagaComApenasUmCurriculos() {
		vaga.recebe(new Curriculo(joao, 8));
						
		recrutador.avaliaCurriculos(vaga);
		
		List<Curriculo> maiores = recrutador.getTresMaioresPontuacoes();
		
		assertEquals(1, maiores.size());
		assertEquals(8, recrutador.getMaiorPontuacao(), 0.001);
		assertEquals(8, recrutador.getMenorPontuacao(), 0.001);
	}
	
	@Test
	public void deveRetornarListaVaziaEmVagaSemCurriculos() {
		
		recrutador.avaliaCurriculos(vaga);
		
		List<Curriculo> maiores = recrutador.getTresMaioresPontuacoes();
		
		assertEquals(0, maiores == null ? 0 : maiores.size());
		assertEquals(null, maiores); //Outra forma de validação.
	}

} // Fim da classe RecrutadorTest
