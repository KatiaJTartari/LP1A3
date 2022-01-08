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
		
		System.out.println("Código: " + p.getCodigo());
        System.out.println("Descrição: " +  p.getDescricao());
        System.out.println("Preço: " + p.getPreco());
        if (p.getAtivo())
			System.out.println("Ativo: Sim");
		else
			System.out.println("Ativo: Não");
	}
	
	public void lerCodigo() {
		System.out.print("Digite o código:  ");
		try {
			p.setCodigo(r.nextInt());
        	r.nextLine(); // Necessário para ler a próxima linha. 
		} catch (InputMismatchException e) {
			 System.out.println("Informe números inteiros.");
			 r.nextLine(); // Necessário para ler a próxima linha. 
			 lerCodigo();
		} catch (IllegalArgumentException e) {
			 System.out.println(e.getMessage());
			 r.nextLine(); // Necessário para ler a próxima linha. 
			 lerCodigo();
		}
	}
		
	public void lerDescricao() {
		System.out.print("Digite a descrição:  ");
		try {
			p.setDescricao(r.nextLine());
		} catch (IllegalArgumentException e) {
			 System.out.println(e.getMessage());
			 lerDescricao();
		}
	}
	
	public void lerPreco() {
		System.out.print("Digite o preço:  ");
		try {
			p.setPreco(r.nextDouble());
			r.nextLine(); // Para ler a próxima linha.
		} catch (InputMismatchException e) {
			 System.out.println("Informe números inteiros ou decimais com vírgula.");
			 r.nextLine(); // Para ler a próxima linha.
			 lerPreco();
		} catch (IllegalArgumentException e) {
			 System.out.println(e.getMessage());
			 r.nextLine(); // Para ler a próxima linha.
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
