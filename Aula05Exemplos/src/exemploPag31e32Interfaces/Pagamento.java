package exemploPag31e32Interfaces;

public class Pagamento {
	public void efetuarPagto(IFuncionario f) {
		// Chama o m�todo calcularVencimento da classe instanciada em f.
		System.out.println("O vencimento do funcion�rio �: " + f.calcularVencimento());
	}
}
