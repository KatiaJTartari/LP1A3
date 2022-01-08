package exemplosAula8Pag13a23;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

public class RecrutadorTest {
	
	@Test
	public void deveAvaliarPontuacoesEmOrdemCrescente() {
		Candidato joao = new Candidato("João");
		Candidato maria = new Candidato("Maria");
		Candidato jose = new Candidato("José");
		
		Vaga vaga = new Vaga("Analista de Sistemas");
		vaga.recebe(new Curriculo(maria, 6));
		vaga.recebe(new Curriculo(joao, 8));
		vaga.recebe(new Curriculo(jose, 9));
		
		Recrutador recrutador = new Recrutador();
		recrutador.avaliaCurriculos(vaga);
		
		assertEquals(9, recrutador.getMaiorPontuacao(), 0.001);
		assertEquals(6, recrutador.getMenorPontuacao(), 0.001);
	}
	
	@Test
	public void deveAvaliarPontuacoesEmOrdemDecrescente() {
		Candidato joao = new Candidato("João");
		Candidato maria = new Candidato("Maria");
		Candidato jose = new Candidato("José");
		Candidato ana = new Candidato("Ana");
		
		Vaga vaga = new Vaga("Analista de Sistemas");
		vaga.recebe(new Curriculo(joao, 9));
		vaga.recebe(new Curriculo(maria, 8));
		vaga.recebe(new Curriculo(jose, 7));
		vaga.recebe(new Curriculo(ana, 5));
		
		Recrutador recrutador = new Recrutador();
		recrutador.avaliaCurriculos(vaga);
		
		assertEquals(9, recrutador.getMaiorPontuacao(), 0.001);
		assertEquals(5, recrutador.getMenorPontuacao(), 0.001);
	}
	
	@Test
	public void deveAvaliarPontuacoesEmOrdemAleatoria() {
		Candidato joao = new Candidato("João");
		Candidato maria = new Candidato("Maria");
		Candidato jose = new Candidato("José");
		Candidato ana = new Candidato("Ana");
		Candidato pedro = new Candidato("Pedro");
		
		Vaga vaga = new Vaga("Analista de Sistemas");
		vaga.recebe(new Curriculo(joao, 10));
		vaga.recebe(new Curriculo(maria, 7));
		vaga.recebe(new Curriculo(jose, 6));
		vaga.recebe(new Curriculo(ana, 10));
		vaga.recebe(new Curriculo(pedro, 8));
		
		Recrutador recrutador = new Recrutador();
		recrutador.avaliaCurriculos(vaga);
		
		assertEquals(10, recrutador.getMaiorPontuacao(), 0.001);
		assertEquals(6, recrutador.getMenorPontuacao(), 0.001);
	}
	
	@Test
	public void deveCalcularMediaDePontuacoes() {
		Candidato joao = new Candidato("João");
		Candidato maria = new Candidato("Maria");
		Candidato jose = new Candidato("José");
				
		Vaga vaga = new Vaga("Analista de Sistemas");
		vaga.recebe(new Curriculo(maria, 9));
		vaga.recebe(new Curriculo(joao, 8));
		vaga.recebe(new Curriculo(jose, 6));
				
		Recrutador recrutador = new Recrutador();
		recrutador.avaliaCurriculos(vaga);
		
		assertEquals(7.666, recrutador.getMediaPontuacao(), 0.001);
	}
	
	@Test
	public void deveRetornarMediaZeroParaVagaSemCurriculos() {
		Vaga vaga = new Vaga("Analista de Sistemas");
		
		Recrutador recrutador = new Recrutador();
		recrutador.avaliaCurriculos(vaga);
		
		assertEquals(0, recrutador.getMediaPontuacao(), 0.001);
	}

	@Test
	public void deveRetornarAsTresMaioresPontuacoes() {
		Candidato joao = new Candidato("João");
		Candidato maria = new Candidato("Maria");
		Candidato jose = new Candidato("José");
		Candidato ana = new Candidato("Ana");
		
		Vaga vaga = new Vaga("Analista de Sistemas");
		vaga.recebe(new Curriculo(joao, 5));
		vaga.recebe(new Curriculo(maria, 6));
		vaga.recebe(new Curriculo(jose, 8));
		vaga.recebe(new Curriculo(ana, 10));
		
		Recrutador recrutador = new Recrutador();
		recrutador.avaliaCurriculos(vaga);
		
		List<Curriculo> maiores = recrutador.getTresMaioresPontuacoes();
		
		assertEquals(3, maiores.size());
		assertEquals(10, maiores.get(0).getPontuacao(), 0.001);
		assertEquals(8, maiores.get(1).getPontuacao(), 0.001);
		assertEquals(6, maiores.get(2).getPontuacao(), 0.001);
	}
	
	@Test
	public void deveRetornarAsTresMaioresPontuacoesEmVagaComMenosDeTresCurriculos() {
		Candidato joao = new Candidato("João");
		Candidato maria = new Candidato("Maria");
				
		Vaga vaga = new Vaga("Analista de Sistemas");
		vaga.recebe(new Curriculo(joao, 9));
		vaga.recebe(new Curriculo(maria, 8));
				
		Recrutador recrutador = new Recrutador();
		recrutador.avaliaCurriculos(vaga);
		
		List<Curriculo> maiores = recrutador.getTresMaioresPontuacoes();
		
		assertEquals(2, maiores.size());
		assertEquals(9, maiores.get(0).getPontuacao(), 0.001);
		assertEquals(8, maiores.get(1).getPontuacao(), 0.001);
	}
	
	@Test
	public void deveAvaliarPontuacoesDeVagaComApenasUmCurriculos() {
		Candidato joao = new Candidato("João");
						
		Vaga vaga = new Vaga("Analista de Sistemas");
		vaga.recebe(new Curriculo(joao, 8));
						
		Recrutador recrutador = new Recrutador();
		recrutador.avaliaCurriculos(vaga);
		
		List<Curriculo> maiores = recrutador.getTresMaioresPontuacoes();
		
		assertEquals(1, maiores.size());
		assertEquals(8, recrutador.getMaiorPontuacao(), 0.001);
		assertEquals(8, recrutador.getMenorPontuacao(), 0.001);
	}
	
	@Test
	public void deveRetornarListaVaziaEmVagaSemCurriculos() {
		Vaga vaga = new Vaga("Analista de Sistemas");
								
		Recrutador recrutador = new Recrutador();
		recrutador.avaliaCurriculos(vaga);
		
		List<Curriculo> maiores = recrutador.getTresMaioresPontuacoes();
		
		assertEquals(0, maiores == null ? 0 : maiores.size());
		assertEquals(null, maiores); //Outra forma de validação.
	}
	
} // Fim da classe RecrutadorTest
