package exemploPag16AtributosEstaticos;

public class Adicao {
    private static int soma = 0;
	
	public void setSoma(int num) {
		soma = soma + num;
	}
	public int getSoma() {
		return soma;
	}
}
//O valor do atributo soma � o mesmo, independentemente da inst�ncia que chama o m�todo getSoma.