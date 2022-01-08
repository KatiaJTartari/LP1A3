package exercicio1;

import java.util.Scanner;

public class Inicio { //Classe que contém o método Main.

	public static void main(String[] args) {
		
		//Criação da instância Produto que chamará os métodos get e set da classe Produto:
		Produto p = new Produto();
		
		Scanner r = new Scanner (System.in); // Cria um objeto do tipo Scanner.
		
		//Métodos set para atribuir os valores informados pelo usuário aos atributos da classe Produto: 
		System.out.print("Código: ");
        p.setCodigo(r.nextInt());
        r.nextLine(); // Esvazia o buffer do teclado.
        System.out.print("Descrição: ");
        p.setDescricao(r.nextLine());
        System.out.print("Preço: ");
        p.setPreco(r.nextFloat());
        
       //Pode ser feito com int: 
       /* int ativo;
        do {
        System.out.print("Digite 1 para poduto ativo ou 0 para produto inativo: ");
        ativo = r.nextInt();
        if (ativo == 1)
        	p.setAtivo(true);
        else if (ativo == 0)
        	p.setAtivo(false);
        else
    		System.out.print("Informe 1 ou 0. ");
        } while (ativo != 0 && ativo != 1); */
          
        
        //OU Pode ser feito com char: 
        char ativo;
        do {
        System.out.print("Digite S para poduto ativo ou N para produto inativo: ");
        ativo = r.next().charAt(0); //charAt é usado para ler o tipo char
        if (ativo == 'S' || ativo == 's')
        	p.setAtivo(true);
        else if (ativo == 'N' || ativo == 'n')
        	p.setAtivo(false); 
        else
    		System.out.print("Informe S ou N. ");
        } while (ativo != 's' && ativo != 'S' && ativo != 'n' && ativo !='N'); 
        
        
      //OU Pode ser feito com String:  
      /*  r.nextLine();
        String ativo = "";
        do {
        	System.out.print("Informe se o produto está ativo (sim ou não): ");
        	ativo = r.nextLine();
        	if (ativo.equals("sim"))
        		p.setAtivo(true);
        	else if (ativo.equals("não"))
        		p.setAtivo(false);
        	else
        		System.out.print("Informe sim ou não.");
        } while (!ativo.equals("sim") && !ativo.equals("não"));   */
        
        
        r.close(); // Fecha o leitor de dados.
				
		//Métodos get para apresentar seus novos valores ao usuário:
		System.out.println("\nCódigo: " + p.getCodigo() + "\nDescrição: " + p.getDescricao() + "\nPreço: " + "R$ " + p.getPreco());
		//OU Pode fazer em linhas separadas:
		/*System.out.println("\nCódigo: " + p.getCodigo());
		System.out.println("Descrição: " + p.getDescricao());
		System.out.println("Preço: " + "R$ " + p.getPreco()); */
		
		if (p.getAtivo() == true)
			System.out.println("Ativo: Sim");
		else
			System.out.println("Ativo: Não");
			
	}
}
