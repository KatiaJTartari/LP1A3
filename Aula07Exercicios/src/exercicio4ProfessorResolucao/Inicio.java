package exercicio4ProfessorResolucao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Inicio {

	public static void main(String[] args) {

		Conjunto c = new Conjunto();
		int opcao = 1, quantProdutos = 0;
		//String produto;

		Scanner dado = new Scanner(System.in);

		do {
			System.out.println("OPÇÕES:");
			System.out.println("1) Inserir produtos no 1º conjunto");
			System.out.println("2) Inserir produtos no 2º conjunto");
			System.out.println("3) Consultar todos produtos dos dois conjuntos (união)");
			System.out.println("4) Consultar apenas produtos em comum nos dois conjuntos (intersecção)");
			System.out.println("5) Consultar produtos do 1º conjunto que não existem no 2º conjunto (diferença)");
			System.out.println("6) Consultar se o 1º conjunto está contido no 2º conjunto (verificação de subconjunto)");
			System.out.print("Digite uma opção (0 para sair): ");

			try {
				opcao = dado.nextInt();
				dado.nextLine(); // Esvazia o buffer do teclado após a leitura do valor numérico.
			} catch (InputMismatchException e) {
				System.out.println("Formato Inválido!\n");
				dado.nextLine(); // Esvazia o buffer do teclado após a leitura do valor numérico.
				continue;
			}

			switch (opcao) {
			case 1:
					System.out.print("Quantos produtos você vai inserir no Conjunto 1?: ");
					quantProdutos = dado.nextInt();
					dado.nextLine(); // Esvazia o buffer do teclado após a leitura do valor numérico.
					c.EsvaziarConjunto(1);
					for (int i = 0; i < quantProdutos; i++) {
						System.out.print((i + 1) + "º produto: ");
						c.InserirProdutoConjunto(1, dado.nextLine());
					}
				break;
			case 2:
					System.out.print("Quantos produtos você vai inserir no Conjunto 2?: ");
					quantProdutos = dado.nextInt();
					dado.nextLine(); // Esvazia o buffer do teclado após a leitura do valor numérico.
					c.EsvaziarConjunto(2);
				for (int i = 0; i < quantProdutos; i++) {
					System.out.print((i + 1) + "º produto: ");
					c.InserirProdutoConjunto(2, dado.nextLine());
				}
				break;
			case 3:
				c.ConsultarTodosProdutosDosConjuntos();
				break;
			case 4:
				c.ConsultarProdutosEmComumNosConjuntos();
				break;
			case 5:
				c.ConsultarDiferencaEntreConjuntos();
				break;
			case 6:
				c.ConsultarSeConjunto1EstaContidoNoConjunto2();
				break;
			default:
				if (opcao != 0)
					System.out.println("Opção Inválida!\n");
				else
					System.out.println("Programa Encerrado!\n");
				break;
			}

		} while (opcao != 0);

		dado.close();

	}
}
