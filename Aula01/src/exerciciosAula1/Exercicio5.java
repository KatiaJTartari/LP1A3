/* 5. Escreva uma aplicação console em Java para calcular o gasto com combustível em uma
viagem. O programa deve ler a distância (Km), o preço do combustível e o consumo de
combustível (Km/litro) do veículo, e deve retornar o valor a ser gasto na viagem. */

package exerciciosAula1;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
        double distancia, preco, consumoVeiculo, combustivelNecessario, valorGasto;
		
		Scanner r = new Scanner (System.in);
		
		System.out.print("Digite a distância (km):");
		distancia = r.nextDouble();
		
		System.out.print("Digite o preço do litro do combustível:");
		preco = r.nextDouble();
		
		System.out.print("Digite o consumo de combustível (Km/litro) do veículo:");
		consumoVeiculo = r.nextDouble();
		
		r.close();
		
		combustivelNecessario = distancia / consumoVeiculo;
		valorGasto = combustivelNecessario * preco;
		
		System.out.print("\nO valor a ser gasto na viagem é " + valorGasto);
		
	}
}
