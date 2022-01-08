package exercicio1;

public class PesquisaInicio extends Pesquisa {
	// Sobrescreve o método "BuscarString" da classe mãe (Pesquisa).
	@Override
	public final boolean buscarString(String cadeiaCaracteres) {
		if (getTexto().startsWith(cadeiaCaracteres))
			return true;
		else
			return false;
	}
}
