package exercicio1;

public class Conta {
	private int idConta;
	private int agencia;
	private String numeroConta;
	private Cliente titular;
	
	public Conta() { this.titular = new Cliente(); }
  //A instanciação do atributo titular no construtor da classe define a composição entre as duas classes.
	
	 public int getIdConta() { return idConta; }
	 public int getAgencia() { return agencia; }
	 public String getNumeroConta() { return numeroConta; }
	 public String getTitular() { return titular.getCliente(); }
	 
	 public void setIdConta(int idConta) { this.idConta = idConta; }
	 public void setAgencia(int agencia) { this.agencia = agencia; }
	 public void setNumeroConta(String numeroConta) { this.numeroConta = numeroConta; }
	 public void setTitular(String nome, String cpf, String endereco, String email) { 
			this.titular.setCliente(nome, cpf, endereco, email); 
	 }

}
