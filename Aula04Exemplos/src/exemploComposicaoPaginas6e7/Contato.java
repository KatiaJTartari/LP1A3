package exemploComposicaoPaginas6e7;

public class Contato {
	private String nome;
	private String telefone;
	private String email;
	
	public String getContato() {
		return ("\n  Nome: " + this.nome + "\n  Telefone: " + this.telefone + "\n  E-mail: " + this.email);
	}
	
	public void setContato(String nome, String telefone, String email) {
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
	}
	
}
