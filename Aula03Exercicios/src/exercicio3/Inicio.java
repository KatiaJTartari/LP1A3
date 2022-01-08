package exercicio3;

import java.util.Scanner;

public class Inicio { //Classe que contém o método main, na qual é instanciada a classe Cliente.
	
	public static void main(String[] args) {
		
		Cliente c = new Cliente();
		
		int opcao, codigo = 1;
		String nome, cpf;
		
		Cliente[] vetorClientes = new Cliente[10]; 
		/*Vetor do tipo Cliente com 10 posições. Com isso, cada posição do vetor referenciará um objeto Cliente
		  que, por sua vez, conterá os dados do respectivo cliente (código, nome e CPF).*/
		
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
		        //A instância criada deve chamar os métodos set para armazenar os dados no objeto Cliente.
		        c = new Cliente();
		        if (c.setNome(nome) && c.setCpf(cpf)) {
		        	c.setCodigo(codigo);
		        	vetorClientes[codigo - 1] = c;
		        	/*Em caso de sucesso, deve-se armazenar/inserir a instância Cliente no vetor, iniciando na posição zero.
		        	  O código do cliente é usado para indicar o índice do vetor (código - 1). */
		        	codigo++; 
		        	//Incremento.
		        }
		       	break;
			case 2: 
				System.out.print("\n Informe o Código do Cliente: ");
				int codigoLido = r.nextInt();
				for (int i=0; i<codigo-1; i++) {
					//São usados os métodos get para recuperar os dados do(s) objeto(s) Cliente.
					if (vetorClientes[i].getCodigo() == codigoLido)
						System.out.println(codigoLido +  " - " + vetorClientes[i].getNome() + " - " + vetorClientes[i].getCpf());
					}
				break;
			case 3: 
				System.out.print("\nClientes Encontrados:\n");
				for (int i=0; i<codigo-1; i++) {
					//São usados os métodos get para recuperar os dados do(s) objeto(s) Cliente.
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
