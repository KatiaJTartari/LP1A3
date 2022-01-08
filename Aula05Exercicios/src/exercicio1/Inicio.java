package exercicio1;

import java.util.Scanner;

public class Inicio {

	public static void main(String[] args) {
		int opcao;
		String texto = "";
		String cadeiaCaracteres = "";

		Pesquisa p = new Pesquisa();

		Scanner dado = new Scanner(System.in);

		do {
			System.out.println("\n\tMENU DE OP��ES");
			System.out.println("1 - Informar Texto");
			System.out.println("2 - Buscar String");
			System.out.println("3 - Buscar String no In�cio");
			System.out.println("4 - Buscar String no Fim");
			System.out.println("0 - Sair");
			System.out.print("\nDigite sua op��o: ");
			opcao = dado.nextInt();
			dado.nextLine(); // Necess�rio para ler a pr�xima linha.

			switch (opcao) {
			case 1:
				System.out.print("\nInsira um texto: ");
				texto = dado.nextLine();
				p = new Pesquisa();
				p.setTexto(texto);
				break;

			case 2:
				System.out.print("\nInsira uma cadeia de caracteres: ");
				cadeiaCaracteres = dado.nextLine();
				p = new Pesquisa();
				if (!texto.equals("")) {
					if (p.buscarString(cadeiaCaracteres))
						System.out.println("Cadeia de caracteres encontrada!");
					else
						System.out.println("Cadeia de caracteres n�o encontrada!");
				} else
					System.out.println("Primeiramente insira um texto atrav�s da op��o 1!");
				break;

			case 3:
				System.out.print("\nInsira uma cadeia de caracteres: ");
				cadeiaCaracteres = dado.nextLine();
				p = new PesquisaInicio();
				if (!texto.equals("")) {
					if (p.buscarString(cadeiaCaracteres))
						System.out.println("Cadeia de caracteres encontrada no in�cio!");
					else
						System.out.println("Cadeia de caracteres n�o encontrada no in�cio!");
				} else
					System.out.println("Primeiramente insira um texto atrav�s da op��o 1!");
				break;

			case 4:
				System.out.print("\nInsira uma cadeia de caracteres: ");
				cadeiaCaracteres = dado.nextLine();
				p = new PesquisaFim();
				if (!texto.equals("")) {
					if (p.buscarString(cadeiaCaracteres))
						System.out.println("Cadeia de caracteres encontrada no fim!");
					else
						System.out.println("Cadeia de caracteres n�o encontrada no fim!");
				} else
					System.out.println("Primeiramente insira um texto atrav�s da op��o 1!");
				break;

			default:
				if (opcao != 0)
					System.out.println("\nOp��o Inv�lida!");
				else
					System.out.println("\nPrograma Encerrado!");
				break;
			}

		} while (opcao != 0);

		dado.close(); // Fecha o leitor de dados.
	}
}
