package exemploPag31e32Interfaces;

public class Inicio {

	public static void main(String[] args) {
		Pagamento p = new Pagamento(); // Cria uma instância p para a classe Pagamento.
		
		IFuncionario f = new AuxAdm(); // Cria uma instância f para a classe AuxAdm. 
		p.efetuarPagto(f);
		
		f = new Vendedor(); // f passa a instanciar a classe Vendedor.
		p.efetuarPagto(f);
		
		f = new Gerente(); // f passa a instanciar a classe Gerente.
		p.efetuarPagto(f);
	}

}
