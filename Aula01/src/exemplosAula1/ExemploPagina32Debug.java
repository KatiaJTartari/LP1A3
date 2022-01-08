package exemplosAula1;

public class ExemploPagina32Debug { // Exemplo para executar em modo "debug".

	public static void main(String[] args) {
		
	/*	String[] alunos = new String[5];
		alunos[0] = "João";
		alunos[1] = "Maria";
		alunos[2] = "Pedro";
		alunos[3] = "Ana";
		alunos[4] = "Carlos"; */ 
		
		// Outra forma de inicialização do vetor:
		String[] alunos = { "João", "Maria", "Pedro", "Ana", "Carlos" };
		
		System.out.println("LISTA DE NOMES:");
		imprimeVetor(alunos);
		System.out.println("Você imprimiu todos os nomes!");
	}
	
	static void imprimeVetor(String[] alunos) {
		for (int i = 0; i < 5; i++)
			System.out.println(alunos[i]);
	}
}
//Link vídeo YouTube ensina Debug no Eclipse: https://youtu.be/Oq_T4MdyVWs