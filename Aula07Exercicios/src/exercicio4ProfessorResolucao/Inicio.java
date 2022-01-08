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
			System.out.println("OP��ES:");
			System.out.println("1) Inserir produtos no 1� conjunto");
			System.out.println("2) Inserir produtos no 2� conjunto");
			System.out.println("3) Consultar todos produtos dos dois conjuntos (uni�o)");
			System.out.println("4) Consultar apenas produtos em comum nos dois conjuntos (intersec��o)");
			System.out.println("5) Consultar produtos do 1� conjunto que n�o existem no 2� conjunto (diferen�a)");
			System.out.println("6) Consultar se o 1� conjunto est� contido no 2� conjunto (verifica��o de subconjunto)");
			System.out.print("Digite uma op��o (0 para sair): ");

			try {
				opcao = dado.nextInt();
				dado.nextLine(); // Esvazia o buffer do teclado ap�s a leitura do valor num�rico.
			} catch (InputMismatchException e) {
				System.out.println("Formato Inv�lido!\n");
				dado.nextLine(); // Esvazia o buffer do teclado ap�s a leitura do valor num�rico.
				continue;
			}

			switch (opcao) {
			case 1:
					System.out.print("Quantos produtos voc� vai inserir no Conjunto 1?: ");
					quantProdutos = dado.nextInt();
					dado.nextLine(); // Esvazia o buffer do teclado ap�s a leitura do valor num�rico.
					c.EsvaziarConjunto(1);
					for (int i = 0; i < quantProdutos; i++) {
						System.out.print((i + 1) + "� produto: ");
						c.InserirProdutoConjunto(1, dado.nextLine());
					}
				break;
			case 2:
					System.out.print("Quantos produtos voc� vai inserir no Conjunto 2?: ");
					quantProdutos = dado.nextInt();
					dado.nextLine(); // Esvazia o buffer do teclado ap�s a leitura do valor num�rico.
					c.EsvaziarConjunto(2);
				for (int i = 0; i < quantProdutos; i++) {
					System.out.print((i + 1) + "� produto: ");
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
					System.out.println("Op��o Inv�lida!\n");
				else
					System.out.println("Programa Encerrado!\n");
				break;
			}

		} while (opcao != 0);

		dado.close();

	}
}
