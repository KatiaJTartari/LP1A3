package exemplosAula8Pag41;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DivisaoTestSucesso {
	@Test
	public void naoDeveExecutarDivisaoPorZero() {
		double resultado = Divisao.executaDivisao(18, 3);
		assertEquals(6, resultado, 0.001);
	}

}
