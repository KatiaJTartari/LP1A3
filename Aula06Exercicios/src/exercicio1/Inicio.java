package exercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Inicio {
	private static Produto p = new Produto();
	private static Scanner r = new Scanner (System.in);

	public static void main(String[] args) {
		Inicio i = new Inicio();
		        		
		try {
			i.lerCodigo();
			i.lerDescricao();
			i.lerPreco();
			i.lerAtivo();
		} finally {
			System.out.println("Fechando o leitor!\n");
			r.close();
		}
		
		System.out.println("C�digo: " + p.getCodigo());
        System.out.println("Descri��o: " +  p.getDescricao());
        System.out.println("Pre�o: " + p.getPreco());
        if (p.getAtivo())
			System.out.println("Ativo: Sim");
		else
			System.out.println("Ativo: N�o");
	}
	
	public void lerCodigo() {
		System.out.print("Digite o c�digo:  ");
		try {
			p.setCodigo(r.nextInt());
        	r.nextLine(); // Necess�rio para ler a pr�xima linha. 
		} catch (InputMismatchException e) {
			 System.out.println("Informe n�meros inteiros.");
			 r.nextLine(); // Necess�rio para ler a pr�xima linha. 
			 lerCodigo();
		} catch (IllegalArgumentException e) {
			 System.out.println(e.getMessage());
			 r.nextLine(); // Necess�rio para ler a pr�xima linha. 
			 lerCodigo();
		}
	}
		
	public void lerDescricao() {
		System.out.print("Digite a descri��o:  ");
		try {
			p.setDescricao(r.nextLine());
		} catch (IllegalArgumentException e) {
			 System.out.println(e.getMessage());
			 lerDescricao();
		}
	}
	
	public void lerPreco() {
		System.out.print("Digite o pre�o:  ");
		try {
			p.setPreco(r.nextDouble());
			r.nextLine(); // Para ler a pr�xima linha.
		} catch (InputMismatchException e) {
			 System.out.println("Informe n�meros inteiros ou decimais com v�rgula.");
			 r.nextLine(); // Para ler a pr�xima linha.
			 lerPreco();
		} catch (IllegalArgumentException e) {
			 System.out.println(e.getMessage());
			 r.nextLine(); // Para ler a pr�xima linha.
			 lerPreco();
		}
	}
								
	public void lerAtivo() {
		System.out.print("Digite S para poduto ativo ou N para produto inativo:  ");
		try {
			String ativo = r.nextLine();
			if (ativo.equals("s") || ativo.equals("S"))
        		p.setAtivo(true);
			else if (ativo.equals("n") || ativo.equals("N"))
        		p.setAtivo(false);
        	else
        		p.setAtivo(null);
		} catch (IllegalArgumentException e) {
			 System.out.println(e.getMessage());
			 lerAtivo();
		}
	}
}
