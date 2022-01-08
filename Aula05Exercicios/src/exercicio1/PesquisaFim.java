package exercicio1;

public class PesquisaFim extends Pesquisa {
	// Sobrescreve o método "BuscarString" da classe mãe (Pesquisa).
	@Override
	public final boolean buscarString(String cadeiaCaracteres) {
		if (getTexto().endsWith(cadeiaCaracteres))
			return true;
		else
			return false;
	}
}
