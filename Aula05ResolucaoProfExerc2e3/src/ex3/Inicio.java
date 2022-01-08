package ex3;

import java.util.Scanner;

public class Inicio {
	public static void main(String[] args) {
		int opcao;
		double base, altura, raio;
		String cor;

		Scanner dado = new Scanner(System.in);

		do {
			System.out.println("OPÇÕES");
			System.out.println("1) Retângulo");
			System.out.println("2) Círculo");
			System.out.print("Digite sua opção: ");
			opcao = dado.nextInt();
						
			switch (opcao) {
			case 1:
				System.out.print("Digite a base do retângulo: ");
				base = dado.nextDouble();
				System.out.print("Digite a altura do retângulo: ");
				altura = dado.nextDouble();
				dado.nextLine(); // Necessário para ler a próxima linha.
				System.out.print("Digite a cor do retângulo: ");
				cor = dado.nextLine();
				new Retangulo(base, altura, cor);
				break;
			case 2:
				System.out.print("Digite o raio do círculo: ");
				raio = dado.nextDouble();
				dado.nextLine(); // Necessário para ler a próxima linha.
				System.out.print("Digite a cor do círculo: ");
				cor = dado.nextLine();
				new Circulo(raio, cor);
				break;
			default:
				if (opcao != 0)
					System.out.println("Opção Inválida!");
				else
					System.out.println("Programa Encerrado!");
				break;
			}
		} while (opcao != 0);
		dado.close(); // Fecha o leitor de dados.
	}
}
