package br.edu.ifsp.model.funcionario;

import java.math.BigDecimal;

import br.edu.ifsp.model.cargo.Cargo;

/**
 * <p>Classe de dom�nio da entidade Funcionario. Juntas, as classes de dom�nio modelam  
   a estrutura de neg�cio da aplica��o. Possuem basicamente atributos e seus respectivos   
   m�todos get e set, usados para recupera��o e atribui��o de valores aos seus dados.</p>
   
   <p>Para criar automaticamente os m�todos get e set para os atributos da classe,  
   no editor de c�digo, clique com o bot�o direito do mouse no c�digo / Source / 
   Generate Getters and Setters.</p>
 * @author Leonardo Bertholdo
 *
 */

public class Funcionario {
	private Integer id;
	private String nome;
	private Character sexo;
	private BigDecimal salario;
	private Boolean planoSaude;
	private Cargo cargo;
	
	public Integer getId() {
		return id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public Character getSexo() {
		return sexo;
	}
	
	public BigDecimal getSalario() {
		return salario;
	}
	
	public Boolean isPlanoSaude() {
		return planoSaude;
	}
	
	public Cargo getCargo() {
		return cargo;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setSexo(Character sexo) {
		this.sexo = sexo;
	}
	
	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}
	
	public void setPlanoSaude(Boolean planoSaude) {
		this.planoSaude = planoSaude;
	}
	
	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}
}