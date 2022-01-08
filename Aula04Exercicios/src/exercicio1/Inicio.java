package exercicio1;

public class Inicio {

	public static void main(String[] args) {
		
		Conta conta = new Conta();
		
		conta.setIdConta(1);
		conta.setAgencia(123);
		conta.setNumeroConta("01234-567");
		conta.setTitular("Nancy Tartari", "12345678910", "Rua do Juventus, 407", "nancy@gmail.com.br");
	 //O m�todo setTitular envia os dados do Conta.	
		
		/*Testando a depend�ncia entre os objetos.
		Ao instanciar conta novamente, os dados do conta s�o "zerados", e os dados de cliente tamb�m.*/
		//conta = new Conta();
		
		System.out.println("Dados do Conta:");
		System.out.println("C�digo: " + conta.getIdConta());
		System.out.println("Ag�ncia: " + conta.getAgencia());
		System.out.println("N�mero da Conta: " + conta.getNumeroConta());
		System.out.println("Dados do Titular: " + conta.getTitular());
	   //O m�todo getTitular retorna uma string contendo os dados do objeto Titular.

	}
}
