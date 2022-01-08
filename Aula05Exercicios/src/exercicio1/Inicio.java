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
			System.out.println("\n\tMENU DE OPÇÕES");
			System.out.println("1 - Informar Texto");
			System.out.println("2 - Buscar String");
			System.out.println("3 - Buscar String no Início");
			System.out.println("4 - Buscar String no Fim");
			System.out.println("0 - Sair");
			System.out.print("\nDigite sua opção: ");
			opcao = dado.nextInt();
			dado.nextLine(); // Necessário para ler a próxima linha.

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
						System.out.println("Cadeia de caracteres não encontrada!");
				} else
					System.out.println("Primeiramente insira um texto através da opção 1!");
				break;

			case 3:
				System.out.print("\nInsira uma cadeia de caracteres: ");
				cadeiaCaracteres = dado.nextLine();
				p = new PesquisaInicio();
				if (!texto.equals("")) {
					if (p.buscarString(cadeiaCaracteres))
						System.out.println("Cadeia de caracteres encontrada no início!");
					else
						System.out.println("Cadeia de caracteres não encontrada no início!");
				} else
					System.out.println("Primeiramente insira um texto através da opção 1!");
				break;

			case 4:
				System.out.print("\nInsira uma cadeia de caracteres: ");
				cadeiaCaracteres = dado.nextLine();
				p = new PesquisaFim();
				if (!texto.equals("")) {
					if (p.buscarString(cadeiaCaracteres))
						System.out.println("Cadeia de caracteres encontrada no fim!");
					else
						System.out.println("Cadeia de caracteres não encontrada no fim!");
				} else
					System.out.println("Primeiramente insira um texto através da opção 1!");
				break;

			default:
				if (opcao != 0)
					System.out.println("\nOpção Inválida!");
				else
					System.out.println("\nPrograma Encerrado!");
				break;
			}

		} while (opcao != 0);

		dado.close(); // Fecha o leitor de dados.
	}
}
