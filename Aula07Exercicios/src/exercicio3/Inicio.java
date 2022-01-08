package exercicio3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Inicio {

	public static void main(String[] args) {
		Pilha p = new Pilha();
		int opcao = 1;

		Scanner r = new Scanner(System.in);

		do {
			System.out.println("\tMENU DE OPÇÕES:");
			System.out.println("1- Inserir Livro");
			System.out.println("2- Remover Livro");
			System.out.println("3- Imprimir Pilha");
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
				System.out.print("Informe o Título do Livro a ser Inserido (insere no topo da pilha (última posição)): ");
				System.out.println(p.InserirLivro(r.nextLine()));
				break;
			case 2:
				System.out.print("Remove pela Ordem (Último Livro a Entrar é o 1º a Sair da Pilha)!");
				System.out.println(p.RemoverLivro(r.nextLine()));
				break;
			case 3:
				System.out.print("Pilha: ");
				System.out.println(p.ImprimirPilha(r.nextLine()));
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
