/* 5. Escreva uma aplica��o console em Java para calcular o gasto com combust�vel em uma
viagem. O programa deve ler a dist�ncia (Km), o pre�o do combust�vel e o consumo de
combust�vel (Km/litro) do ve�culo, e deve retornar o valor a ser gasto na viagem. */

package exerciciosAula1;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
        double distancia, preco, consumoVeiculo, combustivelNecessario, valorGasto;
		
		Scanner r = new Scanner (System.in);
		
		System.out.print("Digite a dist�ncia (km):");
		distancia = r.nextDouble();
		
		System.out.print("Digite o pre�o do litro do combust�vel:");
		preco = r.nextDouble();
		
		System.out.print("Digite o consumo de combust�vel (Km/litro) do ve�culo:");
		consumoVeiculo = r.nextDouble();
		
		r.close();
		
		combustivelNecessario = distancia / consumoVeiculo;
		valorGasto = combustivelNecessario * preco;
		
		System.out.print("\nO valor a ser gasto na viagem � " + valorGasto);
		
	}
}
