package exemploPag16AtributosDinamicos;

public class Adicao {
	private int soma = 0;
	
	public void setSoma(int num) {
		this.soma = this.soma + num;
	}
	public int getSoma() {
		return this.soma;
	}
}
//O valor do atributo soma varia conforme a instância que chama o método getSoma.