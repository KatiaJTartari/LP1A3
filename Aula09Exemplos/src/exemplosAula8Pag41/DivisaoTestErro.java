package exemplosAula8Pag41;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DivisaoTestErro {
	@Test
	public void naoDeveExecutarDivisaoPorZero() {
		double resultado = Divisao.executaDivisao(18, 0);
		assertEquals(6, resultado, 0.001);
	}

}
