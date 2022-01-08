package exercicio2;

import java.util.Scanner;

public class Inicio {

	public static void main(String[] args) {

		// Instancias das classes PessoaFisica e PessoaJuridica
		PessoaFisica pF = new PessoaFisica();
		PessoaJuridica pJ = new PessoaJuridica();

		int opcao;
		int codigo = 1, codigoLido;
		String nome, cpf, endereco, telefone, razaoSocial, cnpj;

		PessoaFisica[] vetorPF = new PessoaFisica[10];
		/*
		 * Vetor de objetos do tipo PessoaFisica com 10 posições. Com isso, cada posição
		 * do vetor referenciará um objeto PessoaFisica que armazenará código, endereço,
		 * telefone, nome e CPF dos clientes
		 */

		PessoaJuridica[] vetorPJ = new PessoaJuridica[10];
		/*
		 * Vetor de objetos do tipo PessoaJuridica com 10 posições. Com isso, cada
		 * posição do vetor referenciará um objeto PessoaJuridica que armazenará código,
		 * endereço, telefone, razaoSocial e CNPJ dos clientes
		 */

		Scanner r = new Scanner(System.in);

		do {
			System.out.println("\n\tMENU DE OPÇÕES:");
			System.out.println("1- Inserir Cliente");
			System.out.println("2- Remover Cliente");
			System.out.println("3- Consultar Clientes");
			System.out.println("0- Sair");
			System.out.print("\n Opção: ");
			opcao = r.nextInt();
			r.nextLine();

			switch (opcao) {
			case 1:
				String pessoa;
				do {
					System.out.print("\nPara pessoa física digite PF para pessoa jurídica digite PJ:");
					pessoa = r.nextLine();

					if (pessoa.equals("PF") || pessoa.equals("pf")) {
						System.out.print("Nome: ");
						nome = r.nextLine();
						System.out.print("CPF: ");
						cpf = r.nextLine();
						System.out.print("Endereço: ");
						endereco = r.nextLine();
						System.out.print("Telefone: ");
						telefone = r.nextLine();

						/*
						 * Foram usados os métodos set para criar um objeto contendo os dados da pessoa
						 * física. Este objeto foi inserido no vetor de pessoas físicas. Por fim, o
						 * código foi incrementado para inserção do próximo cliente.
						 */
						pF = new PessoaFisica();
						pF.setCodigo(codigo);
						pF.setNome(nome);
						pF.setCpf(cpf);
						pF.setEndereco(endereco);
						pF.setTelefone(telefone);

						vetorPF[codigo - 1] = pF;
						/*
						 * Em caso de sucesso, deve-se armazenar/inserir a instância PessoaFisica no
						 * vetor, iniciando na posição zero. O código do cliente é usado para indicar o
						 * índice do vetor (código - 1).
						 */
						codigo++;
						System.out.println("Cliente inserido com sucesso!");
					}

					else if (pessoa.equals("PJ") || pessoa.equals("pj")) {
						System.out.print("Razão Social: ");
						razaoSocial = r.nextLine();
						System.out.print("CNPJ: ");
						cnpj = r.nextLine();
						System.out.print("Endereço: ");
						endereco = r.nextLine();
						System.out.print("Telefone: ");
						telefone = r.nextLine();

						/*
						 * Foram usados os métodos set para criar um objeto contendo os dados da pessoa
						 * jurídica. Este objeto foi inserido no vetor de pessoas jurídicas. Por fim, o
						 * código foi incrementado para inserção do próximo cliente.
						 */
						pJ = new PessoaJuridica();
						pJ.setCodigo(codigo);
						pJ.setRazaoSocial(razaoSocial);
						pJ.setCnpj(cnpj);
						pJ.setEndereco(endereco);
						pJ.setTelefone(telefone);

						vetorPJ[codigo - 1] = pJ;
						/*
						 * Em caso de sucesso, deve-se armazenar/inserir a instância PessoaJuridica no
						 * vetor, iniciando na posição zero. O código do cliente é usado para indicar o
						 * índice do vetor (código - 1).
						 */
						codigo++;
						System.out.println("Cliente inserido com sucesso!");
					}

					else {
						System.out.print("Tipo de cliente inexistente!\n");
					}

				} while (!pessoa.equals("PF") && !pessoa.equals("pf") && !pessoa.equals("PJ") && !pessoa.equals("pj"));
				break;

			case 2:
				do {
					System.out.print("\nPara pessoa física digite PF para pessoa jurídica digite PJ:");
					pessoa = r.nextLine();

					if (pessoa.equals("PF") || pessoa.equals("pf")) {
						System.out.print("Insira o código do cliente: ");
						codigoLido = r.nextInt();

						for (int i = 0; i < codigo; i++)
							if (vetorPF[i] != null)
								/*
								 * Foi usado o método getCodigo para percorrer o vetor de pessoas físicas e
								 * buscar o cliente que tem o código informado para remoção.
								 */
								if (vetorPF[i].getCodigo() == codigoLido) {
									// Foi atribuído o valor “null” à posição do vetor relacionada ao cliente
									// informado.
									vetorPF[i] = null;
									System.out.println("Cliente removido com sucesso!");
								} else {
									System.out.println("Código de cliente inexistente!");
								}
					}

					else if (pessoa.equals("PJ") || pessoa.equals("pj")) {
						System.out.print("Insira o código do cliente: ");
						codigoLido = r.nextInt();

						for (int i = 0; i < codigo; i++)
							if (vetorPJ[i] != null)
								/*
								 * Foi usado o método getCodigo para percorrer o vetor de pessoas jurídicas e
								 * buscar o cliente que tem o código informado para remoção.
								 */
								if (vetorPJ[i].getCodigo() == codigoLido) {
									// Foi atribuído o valor “null” à posição do vetor relacionada ao cliente
									// informado.
									vetorPJ[i] = null;
									System.out.println("Cliente removido com sucesso!");
								} else {
									System.out.println("Código de cliente inexistente!");
								}
					}

					else {
						System.out.print("Tipo de cliente inexistente!\n");
					}

				} while (!pessoa.equals("PF") && !pessoa.equals("pf") && !pessoa.equals("PJ") && !pessoa.equals("pj"));
				break;

			case 3:
				/*
				 * Foram chamados os métodos get para recuperar os dados de cada objeto
				 * armazenado nos vetores e apresentá-los ao usuário.
				 */
				System.out.print("\tDados de todos os clientes cadastrados\n");

				System.out.println("\n\tPessoas Físicas:");
				for (int i = 0; i < codigo - 1; i++) {
					if (vetorPF[i] != null) {
						System.out.println("\nCódigo: " + vetorPF[i].getCodigo() + "\nNome: " + vetorPF[i].getNome()
								+ "\nCPF: " + vetorPF[i].getCpf() + "\nEndereço: " + vetorPF[i].getEndereco()
								+ "\nTelefone: " + vetorPF[i].getTelefone());
					}
				}

				System.out.println("\n\tPessoas Jurídicas:");
				for (int i = 0; i < codigo - 1; i++) {
					if (vetorPJ[i] != null) {
						System.out.println("\nCódigo: " + vetorPJ[i].getCodigo() + "\nRazão Social: "
								+ vetorPJ[i].getRazaoSocial() + "\nCNPJ: " + vetorPJ[i].getCnpj() + "\nEndereço: "
								+ vetorPJ[i].getEndereco() + "\nTelefone: " + vetorPJ[i].getTelefone());
					}
				}
				break;

			default:
				if (opcao != 0)
					System.out.println("Opção inválida.\n");
				else
					System.out.println("Programa encerrado.\n");
				break;
			}
		} while (opcao != 0);

		r.close(); // Fecha o leitor de dados.

	}
}
