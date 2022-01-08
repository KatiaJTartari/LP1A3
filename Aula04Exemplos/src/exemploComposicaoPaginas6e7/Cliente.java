package exemploComposicaoPaginas6e7;

public class Cliente {
	private int idCliente;
	private String razaoSocial;
	private String endereco;
    private Contato contato; 
	
	public Cliente() { this.contato = new Contato(); }
	//A instanciação do atributo contato no construtor da classe define a composição entre as duas classes.
	
	public int getIdCliente() { return idCliente; }
	public String getRazaoSocial() { return razaoSocial; }
	public String getEndereco() { return endereco; }
	public String getContato() { return contato.getContato(); }
	
	public void setIdCliente(int idCliente) { this.idCliente = idCliente; }
	public void setRazaoSocial(String razaoSocial) { this.razaoSocial = razaoSocial; }
	public void setEndereco(String endereco) { this.endereco = endereco; }
	public void setContato(String nome, String telefone, String email) { 
		this.contato.setContato(nome, telefone, email); 
	}

}
