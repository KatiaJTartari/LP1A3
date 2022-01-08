package exercicio1;

public class Inicio {

	public static void main(String[] args) {
		
		Conta conta = new Conta();
		
		conta.setIdConta(1);
		conta.setAgencia(123);
		conta.setNumeroConta("01234-567");
		conta.setTitular("Nancy Tartari", "12345678910", "Rua do Juventus, 407", "nancy@gmail.com.br");
	 //O método setTitular envia os dados do Conta.	
		
		/*Testando a dependência entre os objetos.
		Ao instanciar conta novamente, os dados do conta são "zerados", e os dados de cliente também.*/
		//conta = new Conta();
		
		System.out.println("Dados do Conta:");
		System.out.println("Código: " + conta.getIdConta());
		System.out.println("Agência: " + conta.getAgencia());
		System.out.println("Número da Conta: " + conta.getNumeroConta());
		System.out.println("Dados do Titular: " + conta.getTitular());
	   //O método getTitular retorna uma string contendo os dados do objeto Titular.

	}
}
