package exercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Inicio {

	public static void main(String[] args) {
		Lista li = new Lista();
		int opcao = 1, posicao = 1;
		String produto;

		Scanner r = new Scanner(System.in);

		do {
			System.out.println("\tMENU DE OPÇÕES:");
			System.out.println("1- Inserir Produto");
			System.out.println("2- Inserir Produto em Posição Específica");
			System.out.println("3- Consultar Produto (pelo Nome)");
			System.out.println("4- Consultar Produto (pela Posição)");
			System.out.println("5- Substituir Produto");
			System.out.println("6- Remover Produto (pelo Nome)");
			System.out.println("7- Remover Produto (pela Posição)");
			System.out.println("0- Sair");
			System.out.print("Digite uma Opção: ");

			try {
				opcao = r.nextInt();
				r.nextLine(); // Esvazia o buffer do teclado.
			} catch (InputMismatchException e) {
				System.out.println("Formato Inválido!\n");
				r.nextLine(); // Esvazia o buffer do teclado.
				continue;
			}

			switch (opcao) {
			case 1:
				System.out.print("Informe o Nome do Produto a ser Inserido: ");
				System.out.println(li.InserirProduto(r.nextLine()));
				break;
			case 2:
				System.out.print("Informe o Nome do Produto a ser Inserido: ");
				produto = r.nextLine();
				try {
					System.out.print("Informe a Posição do Produto a ser Inserido: ");
					posicao = r.nextInt();
					System.out.println(li.InserirProdutoPosicao(produto, posicao));
				} catch (InputMismatchException | IndexOutOfBoundsException e) {
					System.out.println("Formato Inválido ou Posição Inválida!\n");
					r.nextLine(); // Esvazia o buffer do teclado.
				}
				break;
			case 3:
				System.out.print("Informe o Nome do Produto a ser Consultado: ");
				System.out.println(li.ConsultarProdutoNome(r.nextLine()));
				break;
			case 4:
				try {
					System.out.print("Informe a Posição do Produto a ser Consultado: ");
					System.out.println(li.ConsultarProdutoPosicao(r.nextInt()));
				} catch (InputMismatchException | IndexOutOfBoundsException e) {
					System.out.println("Formato Inválido ou Posição Inválida!\n");
					r.nextLine(); // Esvazia o buffer do teclado.
				}
				break;
			case 5:
				System.out.print("Informe o Nome do Produto Substituto: ");
				produto = r.nextLine();
				try {
					System.out.print("Informe a Posição do Produto a ser Substituído: ");
					posicao = r.nextInt();
					System.out.println(li.SubstituirProduto(produto, posicao));
				} catch (InputMismatchException | IndexOutOfBoundsException e) {
					System.out.println("Formato Inválido ou Posição Inválida!\n");
					r.nextLine(); // Esvazia o buffer do teclado.
				}
				break;
			case 6:
				System.out.print("Informe o Nome do Produto a ser Removido: ");
				System.out.println(li.RemoverProdutoNome(r.nextLine()));
				break;
			case 7:
				try {
					System.out.print("Informe a Posição do Produto a ser Removido: ");
					System.out.println(li.RemoverProdutoPosicao(r.nextInt()));
				} catch (InputMismatchException | IndexOutOfBoundsException e) {
					System.out.println("Formato Inválido ou Posição Inválida!\n");
					r.nextLine(); // Esvazia o buffer do teclado.
				}
				break;
			default:
				if (opcao != 0)
					System.out.println("Opção Inválida!\n");
				else
					System.out.println("Programa Encerrado!\n");
				break;
			}

		} while (opcao != 0);

		r.close();
	}
}
