package exercicio1;

public class PesquisaFim extends Pesquisa {
	// Sobrescreve o m�todo "BuscarString" da classe m�e (Pesquisa).
	@Override
	public final boolean buscarString(String cadeiaCaracteres) {
		if (getTexto().endsWith(cadeiaCaracteres))
			return true;
		else
			return false;
	}
}
