package exemplosAula1;

public class ExemploPagina32Debug { // Exemplo para executar em modo "debug".

	public static void main(String[] args) {
		
	/*	String[] alunos = new String[5];
		alunos[0] = "Jo�o";
		alunos[1] = "Maria";
		alunos[2] = "Pedro";
		alunos[3] = "Ana";
		alunos[4] = "Carlos"; */ 
		
		// Outra forma de inicializa��o do vetor:
		String[] alunos = { "Jo�o", "Maria", "Pedro", "Ana", "Carlos" };
		
		System.out.println("LISTA DE NOMES:");
		imprimeVetor(alunos);
		System.out.println("Voc� imprimiu todos os nomes!");
	}
	
	static void imprimeVetor(String[] alunos) {
		for (int i = 0; i < 5; i++)
			System.out.println(alunos[i]);
	}
}
//Link v�deo YouTube ensina Debug no Eclipse: https://youtu.be/Oq_T4MdyVWs