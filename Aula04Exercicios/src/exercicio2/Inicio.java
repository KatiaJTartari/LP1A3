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
		 * Vetor de objetos do tipo PessoaFisica com 10 posi��es. Com isso, cada posi��o
		 * do vetor referenciar� um objeto PessoaFisica que armazenar� c�digo, endere�o,
		 * telefone, nome e CPF dos clientes
		 */

		PessoaJuridica[] vetorPJ = new PessoaJuridica[10];
		/*
		 * Vetor de objetos do tipo PessoaJuridica com 10 posi��es. Com isso, cada
		 * posi��o do vetor referenciar� um objeto PessoaJuridica que armazenar� c�digo,
		 * endere�o, telefone, razaoSocial e CNPJ dos clientes
		 */

		Scanner r = new Scanner(System.in);

		do {
			System.out.println("\n\tMENU DE OP��ES:");
			System.out.println("1- Inserir Cliente");
			System.out.println("2- Remover Cliente");
			System.out.println("3- Consultar Clientes");
			System.out.println("0- Sair");
			System.out.print("\n Op��o: ");
			opcao = r.nextInt();
			r.nextLine();

			switch (opcao) {
			case 1:
				String pessoa;
				do {
					System.out.print("\nPara pessoa f�sica digite PF para pessoa jur�dica digite PJ:");
					pessoa = r.nextLine();

					if (pessoa.equals("PF") || pessoa.equals("pf")) {
						System.out.print("Nome: ");
						nome = r.nextLine();
						System.out.print("CPF: ");
						cpf = r.nextLine();
						System.out.print("Endere�o: ");
						endereco = r.nextLine();
						System.out.print("Telefone: ");
						telefone = r.nextLine();

						/*
						 * Foram usados os m�todos set para criar um objeto contendo os dados da pessoa
						 * f�sica. Este objeto foi inserido no vetor de pessoas f�sicas. Por fim, o
						 * c�digo foi incrementado para inser��o do pr�ximo cliente.
						 */
						pF = new PessoaFisica();
						pF.setCodigo(codigo);
						pF.setNome(nome);
						pF.setCpf(cpf);
						pF.setEndereco(endereco);
						pF.setTelefone(telefone);

						vetorPF[codigo - 1] = pF;
						/*
						 * Em caso de sucesso, deve-se armazenar/inserir a inst�ncia PessoaFisica no
						 * vetor, iniciando na posi��o zero. O c�digo do cliente � usado para indicar o
						 * �ndice do vetor (c�digo - 1).
						 */
						codigo++;
						System.out.println("Cliente inserido com sucesso!");
					}

					else if (pessoa.equals("PJ") || pessoa.equals("pj")) {
						System.out.print("Raz�o Social: ");
						razaoSocial = r.nextLine();
						System.out.print("CNPJ: ");
						cnpj = r.nextLine();
						System.out.print("Endere�o: ");
						endereco = r.nextLine();
						System.out.print("Telefone: ");
						telefone = r.nextLine();

						/*
						 * Foram usados os m�todos set para criar um objeto contendo os dados da pessoa
						 * jur�dica. Este objeto foi inserido no vetor de pessoas jur�dicas. Por fim, o
						 * c�digo foi incrementado para inser��o do pr�ximo cliente.
						 */
						pJ = new PessoaJuridica();
						pJ.setCodigo(codigo);
						pJ.setRazaoSocial(razaoSocial);
						pJ.setCnpj(cnpj);
						pJ.setEndereco(endereco);
						pJ.setTelefone(telefone);

						vetorPJ[codigo - 1] = pJ;
						/*
						 * Em caso de sucesso, deve-se armazenar/inserir a inst�ncia PessoaJuridica no
						 * vetor, iniciando na posi��o zero. O c�digo do cliente � usado para indicar o
						 * �ndice do vetor (c�digo - 1).
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
					System.out.print("\nPara pessoa f�sica digite PF para pessoa jur�dica digite PJ:");
					pessoa = r.nextLine();

					if (pessoa.equals("PF") || pessoa.equals("pf")) {
						System.out.print("Insira o c�digo do cliente: ");
						codigoLido = r.nextInt();

						for (int i = 0; i < codigo; i++)
							if (vetorPF[i] != null)
								/*
								 * Foi usado o m�todo getCodigo para percorrer o vetor de pessoas f�sicas e
								 * buscar o cliente que tem o c�digo informado para remo��o.
								 */
								if (vetorPF[i].getCodigo() == codigoLido) {
									// Foi atribu�do o valor �null� � posi��o do vetor relacionada ao cliente
									// informado.
									vetorPF[i] = null;
									System.out.println("Cliente removido com sucesso!");
								} else {
									System.out.println("C�digo de cliente inexistente!");
								}
					}

					else if (pessoa.equals("PJ") || pessoa.equals("pj")) {
						System.out.print("Insira o c�digo do cliente: ");
						codigoLido = r.nextInt();

						for (int i = 0; i < codigo; i++)
							if (vetorPJ[i] != null)
								/*
								 * Foi usado o m�todo getCodigo para percorrer o vetor de pessoas jur�dicas e
								 * buscar o cliente que tem o c�digo informado para remo��o.
								 */
								if (vetorPJ[i].getCodigo() == codigoLido) {
									// Foi atribu�do o valor �null� � posi��o do vetor relacionada ao cliente
									// informado.
									vetorPJ[i] = null;
									System.out.println("Cliente removido com sucesso!");
								} else {
									System.out.println("C�digo de cliente inexistente!");
								}
					}

					else {
						System.out.print("Tipo de cliente inexistente!\n");
					}

				} while (!pessoa.equals("PF") && !pessoa.equals("pf") && !pessoa.equals("PJ") && !pessoa.equals("pj"));
				break;

			case 3:
				/*
				 * Foram chamados os m�todos get para recuperar os dados de cada objeto
				 * armazenado nos vetores e apresent�-los ao usu�rio.
				 */
				System.out.print("\tDados de todos os clientes cadastrados\n");

				System.out.println("\n\tPessoas F�sicas:");
				for (int i = 0; i < codigo - 1; i++) {
					if (vetorPF[i] != null) {
						System.out.println("\nC�digo: " + vetorPF[i].getCodigo() + "\nNome: " + vetorPF[i].getNome()
								+ "\nCPF: " + vetorPF[i].getCpf() + "\nEndere�o: " + vetorPF[i].getEndereco()
								+ "\nTelefone: " + vetorPF[i].getTelefone());
					}
				}

				System.out.println("\n\tPessoas Jur�dicas:");
				for (int i = 0; i < codigo - 1; i++) {
					if (vetorPJ[i] != null) {
						System.out.println("\nC�digo: " + vetorPJ[i].getCodigo() + "\nRaz�o Social: "
								+ vetorPJ[i].getRazaoSocial() + "\nCNPJ: " + vetorPJ[i].getCnpj() + "\nEndere�o: "
								+ vetorPJ[i].getEndereco() + "\nTelefone: " + vetorPJ[i].getTelefone());
					}
				}
				break;

			default:
				if (opcao != 0)
					System.out.println("Op��o inv�lida.\n");
				else
					System.out.println("Programa encerrado.\n");
				break;
			}
		} while (opcao != 0);

		r.close(); // Fecha o leitor de dados.

	}
}
