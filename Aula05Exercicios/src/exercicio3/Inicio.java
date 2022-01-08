package exercicio3;

import java.util.Scanner;

public class Inicio {

	public static void main(String[] args) {
		int opcao;
		float base, altura, raio;
		String cor;

		Scanner dado = new Scanner(System.in);

		do {
			System.out.println("\n\tMENU DE OP��ES");
			System.out.println("1 - Calcular a �rea do Ret�ngulo");
			System.out.println("2 - Calcular a �rea do C�rculo");
			System.out.println("0 - Sair");
			System.out.print("\nDigite sua op��o: ");
			opcao = dado.nextInt();

			switch (opcao) {
			case 1:
				System.out.print("\nDigite a base para o ret�ngulo: ");
				base = dado.nextFloat();
				System.out.print("\nDigite a altura para o ret�ngulo: ");
				altura = dado.nextFloat();
				dado.nextLine(); // Necess�rio para ler a pr�xima linha.
				System.out.print("\nDigite uma cor para o ret�ngulo: ");
				cor = dado.nextLine();
				new Retangulo(base, altura, cor);
				break;

			case 2:
				System.out.print("\nDigite o raio para o c�rculo: ");
				raio = dado.nextFloat();
				dado.nextLine(); // Necess�rio para ler a pr�xima linha.
				System.out.print("\nDigite uma cor para o c�rculo: ");
				cor = dado.nextLine();
				new Circulo(raio, cor);
				break;

			default:
				if (opcao != 0)
					System.out.println("\nOp��o Inv�lida!");
				else
					System.out.println("\nPrograma Encerrado!");
				break;
			}
		} while (opcao != 0);

		dado.close(); // Fecha o leitor de dados.
	}
}
