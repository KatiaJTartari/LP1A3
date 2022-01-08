package exercicio1;

public class Pesquisa {
	private static String texto;

	public String getTexto() {
		return texto;
	}

	public void setTexto(String text) {
		texto = text;
	}

	public boolean buscarString(String cadeiaCaracteres) { // Implementação genérica
		if (texto.contains(cadeiaCaracteres))
			return true;
		else
			return false;
	}

}
