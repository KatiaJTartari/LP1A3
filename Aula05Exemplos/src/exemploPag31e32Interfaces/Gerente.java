package exemploPag31e32Interfaces;

public class Gerente implements IFuncionario {
	private double vencimento;
	private double salario = 3000;
	private double vale_alim = 200;
	private double comissao = 400;
	private double gratificacao = 500;
	
	public double calcularVencimento() {
		vencimento = salario + vale_alim + comissao + gratificacao;
		return vencimento; 
	}
}
