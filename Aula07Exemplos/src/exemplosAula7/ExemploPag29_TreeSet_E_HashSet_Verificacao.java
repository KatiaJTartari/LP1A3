package exemplosAula7;

import java.util.TreeSet;

//Este exemplo serve também para HashSet, bastando incluir: import java.util.HashSet.

public class ExemploPag29_TreeSet_E_HashSet_Verificacao {

	public static void main(String[] args) {
		String[] c1 = {"João", "Paulo", "Antonio", "Maria"};
		TreeSet<String> conjunto1 = new TreeSet<>();
		
		String[] c2 = {"Paulo", "Maria"};
		TreeSet<String> conjunto2 = new TreeSet<>();
		
		for (String i : c1) //Adiciona os elementos ao conjunto 1.
			conjunto1.add(i);
		
		for (String i : c2) //Adiciona os elementos ao conjunto 2.
			conjunto2.add(i);
		
		System.out.println("Conjunto 1: " + conjunto1);
		System.out.println("Conjunto 2: " + conjunto2);
		
		if (conjunto1.containsAll(conjunto2))
			System.out.println("O conjunto 1 contém o conjunto 2");
		else
			System.out.println("O conjunto 1 não contém o conjunto 2");
	
	}
}
