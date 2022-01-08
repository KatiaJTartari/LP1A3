package exercicio1ResolucaoProf;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ControleTest {
	private Controle controle;
	private Estoque estoque;
	
	@Before // Indica que este método será executado uma vez antes de cada método de teste.
	public void executaAntesDeCadaMetodo() {
		this.controle = new Controle();
	}
			
	@Test
	public void deveRetornarProdutosComEstoqueInsuficiente() {
		estoque = new CriadorDeEstoque().para("Filial da Zona Sul")
				.produto("abacaxi", 50, 40, 70) // Adequado
				.produto("banana", 40, 50, 80) // Insuficiente
				.produto("mamão", 70, 30, 60) // Excedente
				.produto("maçã", 0, 60, 90) // Zerado
				.produto("laranja", 30, 40, 70) // Insuficiente
				.produto("pera", 60, 40, 70) // Adequado
				.produto("abacate", 50, 20, 40) // Excedente
				.cria();
		
		controle.controlaEstoques(estoque);
		
		assertEquals(3, controle.getProdutosComEstoqueInsuficiente().size(), 0.001);
		assertEquals("banana", controle.getProdutosComEstoqueInsuficiente().get(0).getNome());
		assertEquals("maçã", controle.getProdutosComEstoqueInsuficiente().get(1).getNome());
		assertEquals("laranja", controle.getProdutosComEstoqueInsuficiente().get(2).getNome());
	}
	
	@Test
	public void deveRetornarProdutosComEstoqueExcedente() {
		estoque = new CriadorDeEstoque().para("Filial da Zona Sul")
				.produto("abacaxi", 50, 40, 70) // Adequado
				.produto("banana", 40, 50, 80) // Insuficiente
				.produto("mamão", 70, 30, 60) // Excedente
				.produto("maçã", 0, 60, 90) // Insuficiente e Zerado
				.produto("laranja", 30, 40, 70) // Insuficiente
				.produto("pera", 60, 40, 70) // Adequado
				.produto("abacate", 50, 20, 40) // Excedente
				.cria();
		
		controle.controlaEstoques(estoque);
		
		assertEquals(2, controle.getProdutosComEstoqueExcedente().size(), 0.001);
		assertEquals("mamão", controle.getProdutosComEstoqueExcedente().get(0).getNome());
		assertEquals("abacate", controle.getProdutosComEstoqueExcedente().get(1).getNome());
	}
	
	@Test
	public void deveRetornarProdutosComEstoqueZerado() {
		estoque = new CriadorDeEstoque().para("Filial da Zona Sul")
				.produto("abacaxi", 50, 40, 70) // Adequado
				.produto("banana", 40, 50, 80) // Insuficiente
				.produto("mamão", 70, 30, 60) // Excedente
				.produto("maçã", 0, 60, 90) // Zerado
				.produto("laranja", 30, 40, 70) // Insuficiente
				.produto("pera", 60, 40, 70) // Adequado
				.produto("abacate", 50, 20, 40) // Excedente
				.cria();
		
		controle.controlaEstoques(estoque);
		
		assertEquals(1, controle.getProdutosComEstoqueZerado().size(), 0.001);
		assertEquals("maçã", controle.getProdutosComEstoqueZerado().get(0).getNome());
	}
	
	@Test
	public void deveRetornarProdutosComEstoqueAdequado() {
		estoque = new CriadorDeEstoque().para("Filial da Zona Sul")
				.produto("abacaxi", 50, 40, 70) // Adequado
				.produto("banana", 40, 50, 80) // Insuficiente
				.produto("mamão", 70, 30, 60) // Excedente
				.produto("maçã", 0, 60, 90) // Zerado
				.produto("laranja", 30, 40, 70) // Insuficiente
				.produto("pera", 60, 40, 70) // Adequado
				.produto("abacate", 50, 20, 40) // Excedente
				.cria();
		
		controle.controlaEstoques(estoque);
		
		assertEquals(2, controle.getProdutosComEstoqueAdequado().size(), 0.001);
		assertEquals("abacaxi", controle.getProdutosComEstoqueAdequado().get(0).getNome());
		assertEquals("pera", controle.getProdutosComEstoqueAdequado().get(1).getNome());
	}
	
	/*@Test
	public void deveRetornarListaVaziaParaEstoqueSemProdutos() {
		estoque = new CriadorDeEstoque().para("Filial da Zona Sul")
				.cria();
		
		controle.controlaEstoques(estoque);
		
		assertEquals(0, controle.getProdutosComEstoqueAdequado().size(), 0.001);		
	}*/
	
	@Test
	public void deveRetornarListaVaziaParaEstoqueQueNaoContemProdutosComEstoqueZerado() {
		estoque = new CriadorDeEstoque().para("Filial da Zona Sul")
				.produto("abacaxi", 50, 40, 70) // Adequado
				.produto("banana", 40, 50, 80) // Insuficiente
				.produto("mamão", 70, 30, 60) // Excedente
				.produto("laranja", 30, 40, 70) // Insuficiente
				.produto("pera", 60, 40, 70) // Adequado
				.produto("abacate", 50, 20, 40) // Excedente
				.cria();
		
		controle.controlaEstoques(estoque);
		
		assertEquals(0, controle.getProdutosComEstoqueZerado().size(), 0.001);	
	}
	
	// Comentar o método "deveRetornarListaVaziaParaEstoqueSemProdutos" para executar este método:
	@Test(expected=RuntimeException.class)
	public void naoDeveControlarEstoquesSemNenhumProduto() {
		estoque = new CriadorDeEstoque().para("Filial da Zona Sul")
        .cria();
		
		controle.controlaEstoques(estoque);		
	}

}
