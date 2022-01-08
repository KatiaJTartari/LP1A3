package exercicio3;

import java.util.Scanner;

public class Inicio {

	public static void main(String[] args) {
		int opcao;
		float base, altura, raio;
		String cor;

		Scanner dado = new Scanner(System.in);

		do {
			System.out.println("\n\tMENU DE OPÇÕES");
			System.out.println("1 - Calcular a Área do Retângulo");
			System.out.println("2 - Calcular a Área do Círculo");
			System.out.println("0 - Sair");
			System.out.print("\nDigite sua opção: ");
			opcao = dado.nextInt();

			switch (opcao) {
			case 1:
				System.out.print("\nDigite a base para o retângulo: ");
				base = dado.nextFloat();
				System.out.print("\nDigite a altura para o retângulo: ");
				altura = dado.nextFloat();
				dado.nextLine(); // Necessário para ler a próxima linha.
				System.out.print("\nDigite uma cor para o retângulo: ");
				cor = dado.nextLine();
				new Retangulo(base, altura, cor);
				break;

			case 2:
				System.out.print("\nDigite o raio para o círculo: ");
				raio = dado.nextFloat();
				dado.nextLine(); // Necessário para ler a próxima linha.
				System.out.print("\nDigite uma cor para o círculo: ");
				cor = dado.nextLine();
				new Circulo(raio, cor);
				break;

			default:
				if (opcao != 0)
					System.out.println("\nOpção Inválida!");
				else
					System.out.println("\nPrograma Encerrado!");
				break;
			}
		} while (opcao != 0);

		dado.close(); // Fecha o leitor de dados.
	}
}
