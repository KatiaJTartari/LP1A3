package exemploPag31e32Interfaces;

public class AuxAdm implements IFuncionario {
	private double vencimento;
	private double salario = 1200;
	private double vale_alim = 200;
	
	public double calcularVencimento() {
		vencimento = salario + vale_alim;
		return vencimento;
	}
}
