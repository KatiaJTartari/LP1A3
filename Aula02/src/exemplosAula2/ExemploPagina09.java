package exemplosAula2;

public class ExemploPagina09 {

	public static void main(String[] args) {
		
		String[] alunos = new String[5];
		alunos[0] = "Jo�o";
		alunos[1] = "Maria";
		alunos[2] = "Pedro";
		alunos[3] = "Ana"; 
		alunos[4] = "Carlos"; 
		
		// Outra forma de inicializa��o do vetor:
		//String[] alunos = {"Jo�o", "Maria", "Pedro", "Ana", "Carlos"};
				                   
		for (int i = 0; i < 5; i++)
			System.out.println(alunos [i]);

	}
}
