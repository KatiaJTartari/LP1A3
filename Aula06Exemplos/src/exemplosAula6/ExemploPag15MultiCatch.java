package exemplosAula6;

import java.util.Scanner;

public class ExemploPag15MultiCatch {

	public static void main(String[] args) {
		Scanner dado = new Scanner(System.in);
		
		try {
			System.out.print("Informe o índice: ");
			int i = dado.nextInt();
			System.out.println(GetNumero(i));
// Está dando erro na linha 15, então consegui corrigir deixando apenas (Exception e) conforme linha 16. 		
	 // } catch (IndexOutOfBoundsException | InputMismatchException e) {
		} catch (Exception e) {	
			if (e.getClass().toString().equals("class java.lang.ArrayIndexOutOfBoundsException"))
				System.out.println("O índice informado não existe!");
			else if (e.getClass().toString().equals("class java.util.InputMismatchException"))
				System.out.println("O índice informado não é um número!");
		}
		dado.close();

	}
	
	public static int GetNumero(int indice) {
		int[] numeros = { 10, 20, 30 };
		return numeros[indice];
	}
}
