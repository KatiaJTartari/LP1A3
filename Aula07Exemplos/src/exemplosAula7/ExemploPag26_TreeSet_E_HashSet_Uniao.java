package exemplosAula7;

import java.util.TreeSet;

//Este exemplo serve também para HashSet, bastando incluir: import java.util.HashSet.

public class ExemploPag26_TreeSet_E_HashSet_Uniao {

	public static void main(String[] args) {
		String[] c = {"João", "Pedro", "Paulo", "Maria", "Carlos"};
		TreeSet<String> clientes = new TreeSet<>();
		
		String[] f = {"Ana", "Paulo", "Antonio", "Isabel", "Maria"};
		TreeSet<String> fornecedores = new TreeSet<>();
		
		for (String i : c) //Adiciona os elementos ao conjunto de clientes.
			clientes.add(i);
		
		for (String i : f) //Adiciona os elementos ao conjunto de fornecedores.
			fornecedores.add(i);
		
		System.out.println("Clientes: " + clientes);
		System.out.println("Fornecedores: " + fornecedores);
		
		clientes.addAll(fornecedores);
		System.out.println("Clientes U Fornecedores: " + clientes);

	}
}
