package exercicio1;

public class PesquisaInicio extends Pesquisa {
	// Sobrescreve o m�todo "BuscarString" da classe m�e (Pesquisa).
	@Override
	public final boolean buscarString(String cadeiaCaracteres) {
		if (getTexto().startsWith(cadeiaCaracteres))
			return true;
		else
			return false;
	}
}
