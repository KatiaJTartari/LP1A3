package exemploPag31e32Interfaces;

public class Vendedor implements IFuncionario {
	private double vencimento;
	private double salario = 1200;
	private double vale_alim = 200;
	private double comissao = 300;
	
	public double calcularVencimento() {
		vencimento = salario + vale_alim + comissao;
		return vencimento; 
	}
}
