package ex2;

import java.util.Scanner;

public class Inicio {

	public static void main(String[] args) {
		int opcao, cod, codigo = 1;
		String nome, cpf, razaoSocial, cnpj, endereco, telefone;
		// Instancias das classes PessoaFisica e PessoaJuridica
		PessoaFisica pf = new PessoaFisica();
		PessoaJuridica pj = new PessoaJuridica();

		PessoaFisica[] clientesPF = new PessoaFisica[10];
		/*
		 * Vetor de objetos do tipo PessoaFisica com 10 posições. Com isso, cada posição
		 * do vetor referenciará um objeto PessoaFisica que armazenará código, endereço,
		 * telefone, nome e CPF dos clientes
		 */

		PessoaJuridica[] clientesPJ = new PessoaJuridica[10];
		/*
		 * Vetor de objetos do tipo PessoaJuridica com 10 posições. Com isso, cada
		 * posição do vetor referenciará um objeto PessoaJuridica que armazenará código,
		 * endereço, telefone, razaoSocial e CNPJ dos clientes
		 */

		Scanner dado = new Scanner(System.in);

		do {
			System.out.println("OPÇÕES:");
			System.out.println("1) Inserir Cliente");
			System.out.println("2) Remover Cliente");
			System.out.println("3) Consultar Clientes");
			System.out.print("Digite sua opção: ");
			opcao = dado.nextInt();
			dado.nextLine(); // Necessário para ler a próxima linha.

			switch (opcao) {
			case 1:
				String tipo_cliente;
				System.out.print("O cliente é PF ou PJ?");
				tipo_cliente = dado.nextLine();

				switch (tipo_cliente) {
				case "pf":
					System.out.print("Nome: ");
					nome = dado.nextLine();
					System.out.print("CPF: ");
					cpf = dado.nextLine();
					System.out.print("Endereço: ");
					endereco = dado.nextLine();
					System.out.print("Telefone: ");
					telefone = dado.nextLine();

					/*
					 * Foram usados os métodos set para criar um objeto contendo os dados da pessoa
					 * física. Este objeto foi inserido no vetor de pessoas físicas. Por fim, o
					 * código foi incrementado para inserção do próximo cliente.
					 */
					pf = new PessoaFisica();
					pf.setCodigo(codigo);
					pf.setNome(nome);
					pf.setCpf(cpf);
					pf.setEndereco(endereco);
					pf.setTelefone(telefone);

					clientesPF[codigo - 1] = pf;
					/*
					 * Em caso de sucesso, deve-se armazenar/inserir a instância PessoaFisica no
					 * vetor, iniciando na posição zero. O código do cliente é usado para indicar o
					 * índice do vetor (código - 1).
					 */
					codigo++;
					System.out.println("Cliente inserido com sucesso!");
					break;

				case "pj":
					System.out.print("Razão Social: ");
					razaoSocial = dado.nextLine();
					System.out.print("CNPJ: ");
					cnpj = dado.nextLine();
					System.out.print("Endereço: ");
					endereco = dado.nextLine();
					System.out.print("Telefone: ");
					telefone = dado.nextLine();

					/*
					 * Foram usados os métodos set para criar um objeto contendo os dados da pessoa
					 * jurídica. Este objeto foi inserido no vetor de pessoas jurídicas. Por fim, o
					 * código foi incrementado para inserção do próximo cliente.
					 */
					pj = new PessoaJuridica();
					pj.setCodigo(codigo);
					pj.setRazaoSocial(razaoSocial);
					pj.setCnpj(cnpj);
					pj.setEndereco(endereco);
					pj.setTelefone(telefone);

					clientesPJ[codigo - 1] = pj;
					/*
					 * Em caso de sucesso, deve-se armazenar/inserir a instância PessoaJuridica no
					 * vetor, iniciando na posição zero. O código do cliente é usado para indicar o
					 * índice do vetor (código - 1).
					 */
					codigo++;
					System.out.println("Cliente inserido com sucesso!");
					break;

				default:
					System.out.println("Este tipo de cliente não existe!");
					break;
				}
				System.out.println();
				break;

			case 2:
				System.out.print("O cliente é PF ou PJ?");
				tipo_cliente = dado.nextLine();

				boolean remocao = false;

				switch (tipo_cliente) {
				case "pf":
					System.out.print("Informe o código do cliente: ");
					cod = dado.nextInt();

					for (int i = 0; i < codigo; i++)
						if (clientesPF[i] != null)
							/*
							 * Foi usado o método getCodigo para percorrer o vetor de pessoas físicas e
							 * buscar o cliente que tem o código informado para remoção.
							 */
							if (clientesPF[i].getCodigo() == cod) {
								// Foi atribuído o valor “null” à posição do vetor relacionada ao cliente
								// informado.
								clientesPF[i] = null;
								remocao = true;
								break;
							}
					break;

				case "pj":
					System.out.print("Informe o código do cliente: ");
					cod = dado.nextInt();

					for (int i = 0; i < codigo; i++)
						if (clientesPJ[i] != null)
							/*
							 * Foi usado o método getCodigo para percorrer o vetor de pessoas jurídicas e
							 * buscar o cliente que tem o código informado para remoção.
							 */
							if (clientesPJ[i].getCodigo() == cod) {
								// Foi atribuído o valor “null” à posição do vetor relacionada ao cliente
								// informado.
								clientesPJ[i] = null;
								remocao = true;
								break;
							}
					break;
				default:
					System.out.println("Este tipo de cliente não existe!");
					System.out.println();
					break;
				}

				if (remocao)
					System.out.print("Cliente removido com sucesso!");
				else
					System.out.print("Este cliente não existe!");

				System.out.println();
				break;

			case 3:
				/*
				 * Foram chamados os métodos get para recuperar os dados de cada objeto
				 * armazenado nos vetores e apresentá-los ao usuário.
				 */

				boolean existe_pf = false;

				for (int i = 0; i < codigo - 1; i++) {
					if (clientesPF[i] != null) {
						existe_pf = true;
						break;
					}
				}

				if (existe_pf == true)
					System.out.println("PESSOAS FÍSICAS:");
				else
					System.out.println("PESSOAS FÍSICAS: Nenhum registro encontrado!");

				for (int i = 0; i < codigo - 1; i++) {
					if (clientesPF[i] != null)
						System.out.println(clientesPF[i].getCodigo() + " - " + clientesPF[i].getNome() + " - "
								+ clientesPF[i].getCpf() + " - " + clientesPF[i].getEndereco() + " - "
								+ clientesPF[i].getTelefone());
				}

				boolean existe_pj = false;

				for (int i = 0; i < codigo - 1; i++) {
					if (clientesPJ[i] != null) {
						existe_pj = true;
						break;
					}
				}

				if (existe_pj == true)
					System.out.println("PESSOAS JURÍDICAS:");
				else
					System.out.println("PESSOAS JURÍDICAS: Nenhum registro encontrado!");

				for (int i = 0; i < codigo - 1; i++) {
					if (clientesPJ[i] != null)
						System.out.println(clientesPJ[i].getCodigo() + " - " + clientesPJ[i].getRazaoSocial() + " - "
								+ clientesPJ[i].getCnpj() + " - " + clientesPJ[i].getEndereco() + " - "
								+ clientesPJ[i].getTelefone());
				}

				System.out.println();
				break;

			default:
				if (opcao != 0)
					System.out.println("Opção inválida!");
				else
					System.out.println("Programa encerrado!");
				break;
			}
		} while (opcao != 0);

		dado.close(); // Fecha o leitor de dados.
	}
}
