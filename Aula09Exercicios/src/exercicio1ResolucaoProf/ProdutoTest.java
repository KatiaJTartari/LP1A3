package exercicio1ResolucaoProf;

import org.junit.Test;

public class ProdutoTest {
	//private Estoque estoque;
	
	@Test(expected=IllegalArgumentException.class)
	public void naoDeveAceitarProdutosComEstoqueMinimoMenorQueCinco() { 
		new Produto("abacaxi", 50, 3, 70); 
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void naoDeveAceitarProdutosComEstoqueMaximoMaiorQueCem() { 
		new Produto("banana", 50, 110, 200);
	}

}
