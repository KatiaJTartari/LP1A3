package exercicio1ResolucaoProf;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EstoqueTest {
	private Estoque estoque;
	
	@Test
	public void naoDeveAceitarProdutosComMesmoNome() {
		estoque = new CriadorDeEstoque()
				.para("Filial da Zona Sul")
				.produto("abacaxi", 60, 40, 70)
				.produto("abacaxi", 80, 70, 100)
				.cria();
		assertEquals(1, estoque.getProdutos().size());
		assertEquals(60, estoque.getProdutos().get(0).getQuantidade(), 0.001);
	}
	
}
