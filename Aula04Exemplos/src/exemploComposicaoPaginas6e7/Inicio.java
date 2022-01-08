package exemploComposicaoPaginas6e7;

public class Inicio {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		
		cliente.setIdCliente(1);
		cliente.setRazaoSocial("Supermercado Araguari Ltda");
		cliente.setEndereco("Rua dos Javalis, 320");
		cliente.setContato("João Ribeiro", "1122227777", "contato@suparaguari.com.br");
	 //O método setContato envia os dados do Contato.		
		
        /*Testando a dependência entre os objetos.
		Ao instanciar cliente novamente, os dados do cliente são "zerados", e os dados de contato também.*/
		//cliente = new Cliente();
		
		System.out.println("Dados do Cliente:");
		System.out.println("Código: " + cliente.getIdCliente());
		System.out.println("Razão Social: " + cliente.getRazaoSocial());
		System.out.println("Endereço: " + cliente.getEndereco());
		System.out.println("Dados de Contato: " + cliente.getContato());
	   //O método getContato retorna uma string contendo os dados do objeto Contato.	

	}
}
