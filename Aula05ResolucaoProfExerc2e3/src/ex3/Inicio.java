package ex3;

import java.util.Scanner;

public class Inicio {
	public static void main(String[] args) {
		int opcao;
		double base, altura, raio;
		String cor;

		Scanner dado = new Scanner(System.in);

		do {
			System.out.println("OP��ES");
			System.out.println("1) Ret�ngulo");
			System.out.println("2) C�rculo");
			System.out.print("Digite sua op��o: ");
			opcao = dado.nextInt();
						
			switch (opcao) {
			case 1:
				System.out.print("Digite a base do ret�ngulo: ");
				base = dado.nextDouble();
				System.out.print("Digite a altura do ret�ngulo: ");
				altura = dado.nextDouble();
				dado.nextLine(); // Necess�rio para ler a pr�xima linha.
				System.out.print("Digite a cor do ret�ngulo: ");
				cor = dado.nextLine();
				new Retangulo(base, altura, cor);
				break;
			case 2:
				System.out.print("Digite o raio do c�rculo: ");
				raio = dado.nextDouble();
				dado.nextLine(); // Necess�rio para ler a pr�xima linha.
				System.out.print("Digite a cor do c�rculo: ");
				cor = dado.nextLine();
				new Circulo(raio, cor);
				break;
			default:
				if (opcao != 0)
					System.out.println("Op��o Inv�lida!");
				else
					System.out.println("Programa Encerrado!");
				break;
			}
		} while (opcao != 0);
		dado.close(); // Fecha o leitor de dados.
	}
}
