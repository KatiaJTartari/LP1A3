package exercicio1ProfessorResolucao;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Inicio {

	public static void main(String[] args) {
		Lista l = new Lista();
		int opcao = 1, posicao;
		List<String> textos = new ArrayList<>();
		String produto, arquivoLocalizacao;

		Scanner dado = new Scanner(System.in);

		System.out.print("Em qual idioma você deseja usar a aplicação? (digite 'pt' ou 'en'): ");
		if (dado.nextLine().equals("pt"))
			arquivoLocalizacao = "C:\\Users\\Katia\\eclipse-workspace\\Aula8\\src\\exercicio1ProfessorResolucao\\localizacao-pt.txt";
		else
			arquivoLocalizacao = "C:\\Users\\Katia\\eclipse-workspace\\Aula8\\src\\exercicio1ProfessorResolucao\\localizacao-en.txt";
		Localizacao.defineIdioma(arquivoLocalizacao);
		textos = Localizacao.getTextos();

		do {
			System.out.println("\n" + textos.get(28)); // "OPÇÕES:"
			System.out.println(textos.get(0)); // "1) Inserir Produto"
			System.out.println(textos.get(1)); // "2) Inserir Produto em Posição Específica"
			System.out.println(textos.get(2)); // "3) Consultar Produto (pelo Nome)"
			System.out.println(textos.get(3)); // "4) Consultar Produto (pela Posição)"
			System.out.println(textos.get(4)); // "5) Substituir Produto"
			System.out.println(textos.get(5)); // "6) Remover Produto (pelo Nome)"
			System.out.println(textos.get(6)); // "7) Remover Produto (pela Posição)"
			System.out.print(textos.get(7)); // "Digite uma Opção (0 para Sair): "

			try {
				opcao = dado.nextInt();
				dado.nextLine(); // Esvazia o buffer do teclado após a leitura do valor numérico.
			} catch (InputMismatchException e) {
				System.out.println(textos.get(11) + "\n"); // "Formato Inválido!"
				dado.nextLine(); // Esvazia o buffer do teclado após a leitura do valor numérico.
				continue;
			}

			switch (opcao) {
			case 1:
				System.out.print(textos.get(16)); // "Informe o Produto a ser Inserido: "
				System.out.println(l.inserirProduto(dado.nextLine()));
				RegistroLog.insereLog(textos.get(21) + "\n"); // "O usuário solicitou a inserção de um produto."
				break;
			case 2:
				System.out.print(textos.get(16)); // "Informe o Produto a ser Inserido: "
				produto = dado.nextLine();
				try {
					System.out.print(textos.get(13)); // "Informe a Posição do Produto a ser Inserido: "
					posicao = dado.nextInt();
					System.out.println(l.inserirProdutoPosicao(produto, posicao));
					RegistroLog.insereLog(textos.get(22) + "\n"); // "O usuário solicitou a inserção de um produto em
																	// posição específica."
				} catch (InputMismatchException | IndexOutOfBoundsException e) {
					System.out.println(textos.get(10) + "\n"); // "Formato Inválido ou Posição Inválida!"
					dado.nextLine(); // Esvazia o buffer do teclado após a leitura do valor numérico.
				}
				break;
			case 3:
				System.out.print(textos.get(15)); // "Informe o Produto a ser Consultado: "
				System.out.println(l.consultarProdutoNome(dado.nextLine()));
				RegistroLog.insereLog(textos.get(23) + "\n"); // "O usuário solicitou a consulta de um produto pelo
																// nome."
				break;
			case 4:
				try {
					System.out.print(textos.get(12)); // "Informe a Posição do Produto a ser Consultado: "
					System.out.println(l.consultarProdutoPosicao(dado.nextInt()));
					RegistroLog.insereLog(textos.get(24) + "\n"); // "O usuário solicitou a consulta de um produto pela
																	// posição."
				} catch (InputMismatchException | IndexOutOfBoundsException e) {
					System.out.println(textos.get(10) + "\n"); // "Formato Inválido ou Posição Inválida!"
					dado.nextLine(); // Esvazia o buffer do teclado após a leitura do valor numérico.
				}
				break;
			case 5:
				System.out.print(textos.get(19)); // "Informe o Produto Substituto: "
				produto = dado.nextLine();
				try {
					System.out.print(textos.get(14)); // "Informe a Posição do Produto a ser Substituído: "
					posicao = dado.nextInt();
					System.out.println(l.substituirProduto(produto, posicao));
					RegistroLog.insereLog(textos.get(25) + "\n"); // "O usuário solicitou a substituição de um produto."
				} catch (InputMismatchException | IndexOutOfBoundsException e) {
					System.out.println(textos.get(10) + "\n"); // "Formato Inválido ou Posição Inválida!"
					dado.nextLine(); // Esvazia o buffer do teclado após a leitura do valor numérico.
				}
				break;
			case 6:
				System.out.print(textos.get(18)); // "Informe o Produto a ser Removido (pelo nome): "
				System.out.println(l.removerProdutoNome(dado.nextLine()));
				RegistroLog.insereLog(textos.get(26) + "\n"); // "O usuário solicitou a remoção de um produto pelo
																// nome."
				break;
			case 7:
				try {
					System.out.print(textos.get(17)); // "Informe o Produto a ser Removido (pela posição): "
					System.out.println(l.removerProdutoPosicao(dado.nextInt()));
					RegistroLog.insereLog(textos.get(27) + "\n"); // "O usuário solicitou a remoção de um produto pela
																	// posição."
				} catch (InputMismatchException | IndexOutOfBoundsException e) {
					System.out.println(textos.get(10) + "\n"); // "Formato Inválido ou Posição Inválida!"
					dado.nextLine(); // Esvazia o buffer do teclado após a leitura do valor numérico.
				}
				break;
			default:
				if (opcao != 0)
					System.out.println(textos.get(29) + "\n"); // "Opção Inválida!"
				else
					System.out.println(textos.get(35) + "\n"); // "Programa Encerrado!"
				break;
			}

		} while (opcao != 0);

		dado.close();

	}
}
