package exercicio3;

import java.util.Scanner;

public class Inicio { //Classe que cont�m o m�todo main, na qual � instanciada a classe Cliente.
	
	public static void main(String[] args) {
		
		Cliente c = new Cliente();
		
		int opcao, codigo = 1;
		String nome, cpf;
		
		Cliente[] vetorClientes = new Cliente[10]; 
		/*Vetor do tipo Cliente com 10 posi��es. Com isso, cada posi��o do vetor referenciar� um objeto Cliente
		  que, por sua vez, conter� os dados do respectivo cliente (c�digo, nome e CPF).*/
		
		Scanner r = new Scanner(System.in);
		
		do {
			System.out.println("\n\tMENU DE OP��ES:");
			System.out.println("1- Inserir Cliente");
			System.out.println("2- Consultar Cliente Espec�fico");
			System.out.println("3- Consultar Clientes");
			System.out.println("0- Sair");
			System.out.print("\n Op��o: ");
			
			opcao = r.nextInt();
			r.nextLine();
						
			switch (opcao) {
			case 1: 
				System.out.print("Informe o Nome: ");
		        nome = r.nextLine();
		        System.out.print("Informe o CPF: ");
		        cpf = r.nextLine();
		        //A inst�ncia criada deve chamar os m�todos set para armazenar os dados no objeto Cliente.
		        c = new Cliente();
		        if (c.setNome(nome) && c.setCpf(cpf)) {
		        	c.setCodigo(codigo);
		        	vetorClientes[codigo - 1] = c;
		        	/*Em caso de sucesso, deve-se armazenar/inserir a inst�ncia Cliente no vetor, iniciando na posi��o zero.
		        	  O c�digo do cliente � usado para indicar o �ndice do vetor (c�digo - 1). */
		        	codigo++; 
		        	//Incremento.
		        }
		       	break;
			case 2: 
				System.out.print("\n Informe o C�digo do Cliente: ");
				int codigoLido = r.nextInt();
				for (int i=0; i<codigo-1; i++) {
					//S�o usados os m�todos get para recuperar os dados do(s) objeto(s) Cliente.
					if (vetorClientes[i].getCodigo() == codigoLido)
						System.out.println(codigoLido +  " - " + vetorClientes[i].getNome() + " - " + vetorClientes[i].getCpf());
					}
				break;
			case 3: 
				System.out.print("\nClientes Encontrados:\n");
				for (int i=0; i<codigo-1; i++) {
					//S�o usados os m�todos get para recuperar os dados do(s) objeto(s) Cliente.
					System.out.println(vetorClientes[i].getCodigo() + " - " + vetorClientes[i].getNome() + " - " + vetorClientes[i].getCpf());
				}
				break;   
               
			default:
				if (opcao != 0)
					System.out.println("Digite uma op��o v�lida.\n");  
				else
					System.out.println("Programa encerrado.\n");
			    break;
			}
			
		}while(opcao != 0);
		r.close();
	}
}
