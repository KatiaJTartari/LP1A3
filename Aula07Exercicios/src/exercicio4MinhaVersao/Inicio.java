package exercicio4MinhaVersao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Inicio {

	public static void main(String[] args) {
		Conjunto c = new Conjunto();
		int opcao = 1, qtd = 1, i;
		String produto;

		Scanner r = new Scanner(System.in);

		do {
			System.out.println("\n\tMENU DE OPÇÕES:");
			System.out.println("1- Inserir Produtos no 1º Conjunto");
			System.out.println("2- Inserir Produtos no 2º Conjunto");
			System.out.println("3- Consultar todos Produtos dos dois Conjuntos (união)");
			System.out.println("4- Consultar apenas Produtos em comum nos dois Conjuntos (intersecção)");
			System.out.println("5- Consultar Produtos do 1º Conjunto que não existem no 2º Conjunto (diferença)");
			System.out
					.println("6- Consultar se o 1º Conjunto está contido no 2º Conjunto (verificação de subconjunto)");
			System.out.println("0- Sair");
			System.out.print("Digite uma Opção: ");

			try {
				opcao = r.nextInt();
				r.nextLine(); // Esvazia o buffer do teclado.
			} catch (InputMismatchException e) {
				System.out.println("Formato Inválido! Informe números inteiros.\n");
				r.nextLine(); // Esvazia o buffer do teclado.
				continue;
			}

			switch (opcao) {
			case 1:
				try {
					System.out.print("Informe a Quantidade de Produtos a ser inserido no 1º Conjunto: ");
					qtd = r.nextInt();
					r.nextLine(); // Esvazia o buffer do teclado.
				} catch (InputMismatchException e) {
					System.out.println("Formato Inválido!\n");
					r.nextLine(); // Esvazia o buffer do teclado.
					continue;
				}
				for (i = 1; i <= qtd; i++) {
					System.out.print("Informe o Nome do " + i + "º Produto a ser Inserido no 1º Conjunto: ");
					produto = r.nextLine();
					// r.nextLine(); // Esvazia o buffer do teclado.
					System.out.println(c.InserirProdutoConjunto1(produto));
				}
				break;
			case 2:
				try {
					System.out.print("Informe a Quantidade de Produtos a ser inserido no 2º Conjunto: ");
					qtd = r.nextInt();
					r.nextLine(); // Esvazia o buffer do teclado.
				} catch (InputMismatchException e) {
					System.out.println("Formato Inválido!\n");
					r.nextLine(); // Necessário para ler a próxima linha.
					continue;
				}
				for (i = 1; i <= qtd; i++) {
					System.out.print("Informe o Nome do " + i + "º Produto a ser Inserido no 2º Conjunto: ");
					produto = r.nextLine();
					// r.nextLine(); // Esvazia o buffer do teclado.
					System.out.println(c.InserirProdutoConjunto2(produto));
				}
				break;
			case 3:
				System.out.print("União de Conjuntos: \n");
				c.ConsultarProdutoUniao();
				break;
			case 4:
				System.out.print("Intersecção de Conjuntos: \n");
				c.ConsultarProdutoInterseccao();
				break;
			case 5:
				System.out.print("Diferença de Conjuntos: \n");
				c.ConsultarProdutoDiferenca();
				break;
			case 6:
				System.out.print("Verificação de Subconjunto: \n");
				c.VerificarSubconjunto();
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
