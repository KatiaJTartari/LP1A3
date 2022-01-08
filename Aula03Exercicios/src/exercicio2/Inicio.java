/* 2. Analise o código e a saída do programa a seguir e responda:
  
a) Quantas instâncias e quantos objetos foram criados no programa?
   3 instâncias e 1 objeto.

b) Quais são os nomes das instâncias? 
   funcionario1, funcionario2, funcionario3.
*/

package exercicio2;

public class Inicio {

	public static void main(String[] args) {
		
		Funcionario funcionario1 = new Funcionario();
		funcionario1.salario = 3500;
		Funcionario funcionario2 = funcionario1;
		funcionario2.salario += 800;
		Funcionario funcionario3 = funcionario2;
		funcionario3.salario += 400;
		
		System.out.println(funcionario1.salario);
		System.out.println(funcionario2.salario);
		System.out.println(funcionario3.salario);
	}
}

