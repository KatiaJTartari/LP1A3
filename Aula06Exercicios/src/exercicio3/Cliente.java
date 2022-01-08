package exercicio3;

public class Cliente {
		private int codigo;
		private String nome;
		private String cpf;
		private int codigoLido;
					
		public void setCodigo(int codigo) {
			this.codigo = codigo;
		}
				
		public boolean setNome(String nome) {
			 if (! nome.contains(" ")) {
				throw new IllegalArgumentException("O nome deve conter pelo menos um sobrenome.");
			 } else {
				 this.nome = nome;
	  	         return true;
		     }
		}
		
		public boolean setCpf(String cpf) {
			if (cpf.length() != 11) {
				throw new IllegalArgumentException("O CPF deve conter 11 números (Não incluir: . -).");
			 } else {
				 this.cpf = cpf;
      	         return true;
		     }
		}
		
		public int setCodigoLido(int codigoLido) {
			if (codigoLido < 1) {
				throw new IllegalArgumentException("O código deve ser apartir de 1.");
		} else {
			    this.codigoLido = codigoLido;
			    return codigoLido;
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
		
		public int getCodigoLido() {
			return this.codigoLido;
		}
}
