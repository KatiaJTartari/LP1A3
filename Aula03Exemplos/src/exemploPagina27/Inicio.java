package exemploPagina27;

public class Inicio {

	public static void main(String[] args) {
		// Criação da instância "c", que referencia um objeto do tipo Carro.
		Carro c = new Carro();
				
		int velocidade_atual = c.getVelocidade(); // Recupera a velocidade do objeto Carro.
				
	    if (velocidade_atual == 0)
			c.setVelocidade(50); // Atribui uma velocidade ao objeto Carro.
				
			velocidade_atual = c.getVelocidade(); // Recupera a velocidade do objeto Carro.
			c.setVelocidade(velocidade_atual + 60); // Atribui uma velocidade ao objeto Carro.

	}

}
