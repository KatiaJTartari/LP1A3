package exercicio1;

import java.util.Scanner;

public class Inicio { //Classe que cont�m o m�todo Main.

	public static void main(String[] args) {
		
		//Cria��o da inst�ncia Produto que chamar� os m�todos get e set da classe Produto:
		Produto p = new Produto();
		
		Scanner r = new Scanner (System.in); // Cria um objeto do tipo Scanner.
		
		//M�todos set para atribuir os valores informados pelo usu�rio aos atributos da classe Produto: 
		System.out.print("C�digo: ");
        p.setCodigo(r.nextInt());
        r.nextLine(); // Esvazia o buffer do teclado.
        System.out.print("Descri��o: ");
        p.setDescricao(r.nextLine());
        System.out.print("Pre�o: ");
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
        ativo = r.next().charAt(0); //charAt � usado para ler o tipo char
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
        	System.out.print("Informe se o produto est� ativo (sim ou n�o): ");
        	ativo = r.nextLine();
        	if (ativo.equals("sim"))
        		p.setAtivo(true);
        	else if (ativo.equals("n�o"))
        		p.setAtivo(false);
        	else
        		System.out.print("Informe sim ou n�o.");
        } while (!ativo.equals("sim") && !ativo.equals("n�o"));   */
        
        
        r.close(); // Fecha o leitor de dados.
				
		//M�todos get para apresentar seus novos valores ao usu�rio:
		System.out.println("\nC�digo: " + p.getCodigo() + "\nDescri��o: " + p.getDescricao() + "\nPre�o: " + "R$ " + p.getPreco());
		//OU Pode fazer em linhas separadas:
		/*System.out.println("\nC�digo: " + p.getCodigo());
		System.out.println("Descri��o: " + p.getDescricao());
		System.out.println("Pre�o: " + "R$ " + p.getPreco()); */
		
		if (p.getAtivo() == true)
			System.out.println("Ativo: Sim");
		else
			System.out.println("Ativo: N�o");
			
	}
}
