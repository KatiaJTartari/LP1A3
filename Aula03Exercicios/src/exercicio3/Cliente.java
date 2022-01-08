package exercicio3;

public class Cliente {
//Atributos privados da classe Cliente:
	private int codigo;
	private String nome;
	private String cpf;
	
//M�todos P�blicos Set e Get:
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public boolean setNome(String nome) {
		if (nome.contains(" ")) {
			this.nome = nome;
		    return true;
	    } else {
	    	System.out.println("Dados Inv�lidos!");
		    return false;
	    }
	}
	
	public boolean setCpf(String cpf) {
		if (cpf.length() == 11) {
			this.cpf = cpf;
		    return true;
	    } else {
			System.out.println("Dados Inv�lidos!");
		return false;
		}
	}
	
	public int getCodigo() {
		return this.codigo;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String getCpf() {
		return this.cpf;
	}
	
}
