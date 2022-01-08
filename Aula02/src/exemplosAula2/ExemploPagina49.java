package exemplosAula2;

public class ExemploPagina49 {

	public static void main(String[] args) {
		
		int num1 = 36;
		float num2 = 20.72f;
		double num3 = 60.87;
		
		//Conversão de float para int
		int resultado1 = num1 + (int)num2;
		System.out.println("float -> int: " + resultado1);
		
		//Conversão de double para int
		int resultado2 = num1 + (int)num3;
		System.out.println("double -> int: " + resultado2);
		
		System.out.println();
		
		//Conversão de char para String
		char caractere = 'a';
		String letra = String.valueOf(caractere);
		System.out.println("char -> String: " + letra);
		
		//Conversão de int para String
		int n1 = 123;
		String num = String.valueOf(n1);
		System.out.println("int -> String: " + num);
		
		//Conversão de float para String
		float n2 = 157.33f;
		num = String.valueOf(n2);
		System.out.println("float -> String: " + num);
		
		//Conversão de double para String
		double n3 = 128.65;
		num = String.valueOf(n3);
		System.out.println("double -> String: " + num);
		
	}

}
