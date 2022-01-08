/*3. Escreva uma aplicação console em Java que leia duas notas e retorne a média do aluno.*/

package exerciciosAula1;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		double nota1, nota2, media;
		
		Scanner r = new Scanner (System.in);
		
		System.out.print("Digite a 1ª Nota:");
		nota1 = r.nextDouble();
		
		System.out.print("Digite a 2ª Nota:");
		nota2 = r.nextDouble();
		
		r.close();
		
		media = (nota1 + nota2) / 2; 
		
		System.out.print("\nA média do aluno é " + media);
	}
}
