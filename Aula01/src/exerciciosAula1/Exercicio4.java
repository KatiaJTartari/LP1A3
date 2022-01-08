/* 4. Escreva uma aplicação console em Java que leia o valor de um produto e seu respectivo
desconto (de 0% a 100%) e retorne o valor do produto com o desconto informado. */

package exerciciosAula1;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
	
		double valorProduto, descontoProduto, valorProdutoDesconto;
		
		Scanner r = new Scanner (System.in);
		
		System.out.print("Informe o valor do produto:");
		valorProduto = r.nextDouble();
		
		System.out.print("Informe o desconto do produto:");
		descontoProduto = r.nextDouble();
		
		r.close();
		
		valorProdutoDesconto = valorProduto * (descontoProduto / 100);
		valorProdutoDesconto = valorProduto - valorProdutoDesconto;
				
		System.out.print("\nO valor do produto com desconto é " + valorProdutoDesconto);
	}
}
