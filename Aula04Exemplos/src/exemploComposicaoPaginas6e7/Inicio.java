package exemploComposicaoPaginas6e7;

public class Inicio {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		
		cliente.setIdCliente(1);
		cliente.setRazaoSocial("Supermercado Araguari Ltda");
		cliente.setEndereco("Rua dos Javalis, 320");
		cliente.setContato("Jo�o Ribeiro", "1122227777", "contato@suparaguari.com.br");
	 //O m�todo setContato envia os dados do Contato.		
		
        /*Testando a depend�ncia entre os objetos.
		Ao instanciar cliente novamente, os dados do cliente s�o "zerados", e os dados de contato tamb�m.*/
		//cliente = new Cliente();
		
		System.out.println("Dados do Cliente:");
		System.out.println("C�digo: " + cliente.getIdCliente());
		System.out.println("Raz�o Social: " + cliente.getRazaoSocial());
		System.out.println("Endere�o: " + cliente.getEndereco());
		System.out.println("Dados de Contato: " + cliente.getContato());
	   //O m�todo getContato retorna uma string contendo os dados do objeto Contato.	

	}
}
