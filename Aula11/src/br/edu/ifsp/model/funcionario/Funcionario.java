package br.edu.ifsp.model.funcionario;

import java.math.BigDecimal;

import br.edu.ifsp.model.cargo.Cargo;

/**
 * <p>Classe de domínio da entidade Funcionario. Juntas, as classes de domínio modelam  
   a estrutura de negócio da aplicação. Possuem basicamente atributos e seus respectivos   
   métodos get e set, usados para recuperação e atribuição de valores aos seus dados.</p>
   
   <p>Para criar automaticamente os métodos get e set para os atributos da classe,  
   no editor de código, clique com o botão direito do mouse no código / Source / 
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