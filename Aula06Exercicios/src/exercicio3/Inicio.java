package exercicio3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Inicio {
	Cliente c = new Cliente();
	
	public static void main(String[] args) {
        Cliente c = new Cliente();
		
		int opcao, codigo = 1;
		int codigoLido = 0;
		String nome, cpf;
		Cliente[] vetorClientes = new Cliente[10]; 
		
		Scanner r = new Scanner(System.in);
		
		do {
			System.out.println("\n\tMENU DE OPÇÕES:");
			System.out.println("1- Inserir Cliente");
			System.out.println("2- Consultar Cliente Específico");
			System.out.println("3- Consultar Clientes");
			System.out.println("0- Sair");
			System.out.print("\n Opção: ");
			
			opcao = r.nextInt();
			r.nextLine();
									
			switch (opcao) {
			case 1: 
				System.out.print("Informe o Nome: ");
				nome = r.nextLine();
				System.out.print("Informe o CPF: ");
		        cpf = r.nextLine();
		        try {
		        	 c = new Cliente();
		        	 if (c.setNome(nome) && c.setCpf(cpf)) {
				         c.setCodigo(codigo);
				         vetorClientes[codigo - 1] = c;
				         codigo++; 
				      }
				} catch (IllegalArgumentException e) {
					 System.out.println(e.getMessage());
				}
		        break;
			case 2:
				System.out.print("Informe o Código do Cliente: ");
				try {
					codigoLido = r.nextInt();
					c = new Cliente();
				    for (int i=0; i<codigo-1; i++) {
						if (vetorClientes[i].getCodigo() == c.setCodigoLido(codigoLido))
							System.out.println(codigoLido +  " - " + vetorClientes[i].getNome() + " - " + vetorClientes[i].getCpf());
					}
				} catch (InputMismatchException e) {
					 System.out.println("Informe números inteiros.");
					 r.nextLine(); // Necessário para ler a próxima linha. 
				} catch (IllegalArgumentException e) {
					 System.out.println(e.getMessage());
					 r.nextLine(); // Necessário para ler a próxima linha. 
				}
				break;
			case 3: 
				System.out.print("\nClientes Encontrados:\n");
				for (int i=0; i<codigo-1; i++) {
					System.out.println(vetorClientes[i].getCodigo() + " - " + vetorClientes[i].getNome() + " - " + vetorClientes[i].getCpf());
				}
				break;   
            default:
				if (opcao != 0)
					System.out.println("Digite uma opção válida.\n");  
				else
					System.out.println("Programa encerrado.\n");
			    break;
			}
			
		}while(opcao != 0);
		r.close();
	}
}
