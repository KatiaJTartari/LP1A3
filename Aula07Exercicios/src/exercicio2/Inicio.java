package exercicio2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Inicio {

	public static void main(String[] args) {
		Fila f = new Fila();
		int opcao = 1;
		
		Scanner r = new Scanner(System.in);

		do {
			System.out.println("\tMENU DE OP��ES:");
			System.out.println("1- Inserir Pessoa");
			System.out.println("2- Remover Pessoa");
			System.out.println("3- Imprimir Fila");
			System.out.println("0- Sair");
			System.out.print("Digite uma Op��o: ");

			try {
				opcao = r.nextInt();
				r.nextLine(); // Esvazia o buffer do teclado.
			} catch (InputMismatchException e) {
				System.out.println("Formato Inv�lido!\n");
				r.nextLine(); // Esvazia o buffer do teclado.
				continue;
			}

			switch (opcao) {
			case 1:
				System.out.print("Informe o Nome da Pessoa a ser Inserido (insere no final da fila): ");
				System.out.println(f.InserirPessoa(r.nextLine()));
				break;
			case 2:
				System.out.print("Remove pela Ordem (1� Pessoa a Entrar � a 1� a Sair da Fila)!");
				System.out.println(f.RemoverPessoa(r.nextLine()));
				break;
			case 3:
				System.out.print("Fila: ");
				System.out.println(f.ImprimirFila(r.nextLine()));
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
