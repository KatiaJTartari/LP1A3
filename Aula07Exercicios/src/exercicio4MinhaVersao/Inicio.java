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
			System.out.println("\n\tMENU DE OP��ES:");
			System.out.println("1- Inserir Produtos no 1� Conjunto");
			System.out.println("2- Inserir Produtos no 2� Conjunto");
			System.out.println("3- Consultar todos Produtos dos dois Conjuntos (uni�o)");
			System.out.println("4- Consultar apenas Produtos em comum nos dois Conjuntos (intersec��o)");
			System.out.println("5- Consultar Produtos do 1� Conjunto que n�o existem no 2� Conjunto (diferen�a)");
			System.out
					.println("6- Consultar se o 1� Conjunto est� contido no 2� Conjunto (verifica��o de subconjunto)");
			System.out.println("0- Sair");
			System.out.print("Digite uma Op��o: ");

			try {
				opcao = r.nextInt();
				r.nextLine(); // Esvazia o buffer do teclado.
			} catch (InputMismatchException e) {
				System.out.println("Formato Inv�lido! Informe n�meros inteiros.\n");
				r.nextLine(); // Esvazia o buffer do teclado.
				continue;
			}

			switch (opcao) {
			case 1:
				try {
					System.out.print("Informe a Quantidade de Produtos a ser inserido no 1� Conjunto: ");
					qtd = r.nextInt();
					r.nextLine(); // Esvazia o buffer do teclado.
				} catch (InputMismatchException e) {
					System.out.println("Formato Inv�lido!\n");
					r.nextLine(); // Esvazia o buffer do teclado.
					continue;
				}
				for (i = 1; i <= qtd; i++) {
					System.out.print("Informe o Nome do " + i + "� Produto a ser Inserido no 1� Conjunto: ");
					produto = r.nextLine();
					// r.nextLine(); // Esvazia o buffer do teclado.
					System.out.println(c.InserirProdutoConjunto1(produto));
				}
				break;
			case 2:
				try {
					System.out.print("Informe a Quantidade de Produtos a ser inserido no 2� Conjunto: ");
					qtd = r.nextInt();
					r.nextLine(); // Esvazia o buffer do teclado.
				} catch (InputMismatchException e) {
					System.out.println("Formato Inv�lido!\n");
					r.nextLine(); // Necess�rio para ler a pr�xima linha.
					continue;
				}
				for (i = 1; i <= qtd; i++) {
					System.out.print("Informe o Nome do " + i + "� Produto a ser Inserido no 2� Conjunto: ");
					produto = r.nextLine();
					// r.nextLine(); // Esvazia o buffer do teclado.
					System.out.println(c.InserirProdutoConjunto2(produto));
				}
				break;
			case 3:
				System.out.print("Uni�o de Conjuntos: \n");
				c.ConsultarProdutoUniao();
				break;
			case 4:
				System.out.print("Intersec��o de Conjuntos: \n");
				c.ConsultarProdutoInterseccao();
				break;
			case 5:
				System.out.print("Diferen�a de Conjuntos: \n");
				c.ConsultarProdutoDiferenca();
				break;
			case 6:
				System.out.print("Verifica��o de Subconjunto: \n");
				c.VerificarSubconjunto();
				break;
			default:
				if (opcao != 0)
					System.out.println("Op��o Inv�lida!\n");
				else
					System.out.println("Programa Encerrado!\n");
				break;
			}

		} while (opcao != 0);

		r.close();

	}
}
