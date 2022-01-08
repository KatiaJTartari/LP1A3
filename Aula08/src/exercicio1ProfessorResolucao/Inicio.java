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

		System.out.print("Em qual idioma voc� deseja usar a aplica��o? (digite 'pt' ou 'en'): ");
		if (dado.nextLine().equals("pt"))
			arquivoLocalizacao = "C:\\Users\\Katia\\eclipse-workspace\\Aula8\\src\\exercicio1ProfessorResolucao\\localizacao-pt.txt";
		else
			arquivoLocalizacao = "C:\\Users\\Katia\\eclipse-workspace\\Aula8\\src\\exercicio1ProfessorResolucao\\localizacao-en.txt";
		Localizacao.defineIdioma(arquivoLocalizacao);
		textos = Localizacao.getTextos();

		do {
			System.out.println("\n" + textos.get(28)); // "OP��ES:"
			System.out.println(textos.get(0)); // "1) Inserir Produto"
			System.out.println(textos.get(1)); // "2) Inserir Produto em Posi��o Espec�fica"
			System.out.println(textos.get(2)); // "3) Consultar Produto (pelo Nome)"
			System.out.println(textos.get(3)); // "4) Consultar Produto (pela Posi��o)"
			System.out.println(textos.get(4)); // "5) Substituir Produto"
			System.out.println(textos.get(5)); // "6) Remover Produto (pelo Nome)"
			System.out.println(textos.get(6)); // "7) Remover Produto (pela Posi��o)"
			System.out.print(textos.get(7)); // "Digite uma Op��o (0 para Sair): "

			try {
				opcao = dado.nextInt();
				dado.nextLine(); // Esvazia o buffer do teclado ap�s a leitura do valor num�rico.
			} catch (InputMismatchException e) {
				System.out.println(textos.get(11) + "\n"); // "Formato Inv�lido!"
				dado.nextLine(); // Esvazia o buffer do teclado ap�s a leitura do valor num�rico.
				continue;
			}

			switch (opcao) {
			case 1:
				System.out.print(textos.get(16)); // "Informe o Produto a ser Inserido: "
				System.out.println(l.inserirProduto(dado.nextLine()));
				RegistroLog.insereLog(textos.get(21) + "\n"); // "O usu�rio solicitou a inser��o de um produto."
				break;
			case 2:
				System.out.print(textos.get(16)); // "Informe o Produto a ser Inserido: "
				produto = dado.nextLine();
				try {
					System.out.print(textos.get(13)); // "Informe a Posi��o do Produto a ser Inserido: "
					posicao = dado.nextInt();
					System.out.println(l.inserirProdutoPosicao(produto, posicao));
					RegistroLog.insereLog(textos.get(22) + "\n"); // "O usu�rio solicitou a inser��o de um produto em
																	// posi��o espec�fica."
				} catch (InputMismatchException | IndexOutOfBoundsException e) {
					System.out.println(textos.get(10) + "\n"); // "Formato Inv�lido ou Posi��o Inv�lida!"
					dado.nextLine(); // Esvazia o buffer do teclado ap�s a leitura do valor num�rico.
				}
				break;
			case 3:
				System.out.print(textos.get(15)); // "Informe o Produto a ser Consultado: "
				System.out.println(l.consultarProdutoNome(dado.nextLine()));
				RegistroLog.insereLog(textos.get(23) + "\n"); // "O usu�rio solicitou a consulta de um produto pelo
																// nome."
				break;
			case 4:
				try {
					System.out.print(textos.get(12)); // "Informe a Posi��o do Produto a ser Consultado: "
					System.out.println(l.consultarProdutoPosicao(dado.nextInt()));
					RegistroLog.insereLog(textos.get(24) + "\n"); // "O usu�rio solicitou a consulta de um produto pela
																	// posi��o."
				} catch (InputMismatchException | IndexOutOfBoundsException e) {
					System.out.println(textos.get(10) + "\n"); // "Formato Inv�lido ou Posi��o Inv�lida!"
					dado.nextLine(); // Esvazia o buffer do teclado ap�s a leitura do valor num�rico.
				}
				break;
			case 5:
				System.out.print(textos.get(19)); // "Informe o Produto Substituto: "
				produto = dado.nextLine();
				try {
					System.out.print(textos.get(14)); // "Informe a Posi��o do Produto a ser Substitu�do: "
					posicao = dado.nextInt();
					System.out.println(l.substituirProduto(produto, posicao));
					RegistroLog.insereLog(textos.get(25) + "\n"); // "O usu�rio solicitou a substitui��o de um produto."
				} catch (InputMismatchException | IndexOutOfBoundsException e) {
					System.out.println(textos.get(10) + "\n"); // "Formato Inv�lido ou Posi��o Inv�lida!"
					dado.nextLine(); // Esvazia o buffer do teclado ap�s a leitura do valor num�rico.
				}
				break;
			case 6:
				System.out.print(textos.get(18)); // "Informe o Produto a ser Removido (pelo nome): "
				System.out.println(l.removerProdutoNome(dado.nextLine()));
				RegistroLog.insereLog(textos.get(26) + "\n"); // "O usu�rio solicitou a remo��o de um produto pelo
																// nome."
				break;
			case 7:
				try {
					System.out.print(textos.get(17)); // "Informe o Produto a ser Removido (pela posi��o): "
					System.out.println(l.removerProdutoPosicao(dado.nextInt()));
					RegistroLog.insereLog(textos.get(27) + "\n"); // "O usu�rio solicitou a remo��o de um produto pela
																	// posi��o."
				} catch (InputMismatchException | IndexOutOfBoundsException e) {
					System.out.println(textos.get(10) + "\n"); // "Formato Inv�lido ou Posi��o Inv�lida!"
					dado.nextLine(); // Esvazia o buffer do teclado ap�s a leitura do valor num�rico.
				}
				break;
			default:
				if (opcao != 0)
					System.out.println(textos.get(29) + "\n"); // "Op��o Inv�lida!"
				else
					System.out.println(textos.get(35) + "\n"); // "Programa Encerrado!"
				break;
			}

		} while (opcao != 0);

		dado.close();

	}
}
