package exemplosAula2;

public class ExemploPaginas30a34 {

	public static void main(String[] args) {
		
		String textoPag30 = "Município de São Paulo";
		System.out.println(textoPag30.length());
		
		String textoPag31 = " Olimpíadas de 2016";
		System.out.println(textoPag31.toLowerCase());
		System.out.println(textoPag31.toUpperCase());
		
		String textoPag32 = "    Olimpíadas de 2016     ";
		System.out.println(textoPag32);
		System.out.println(textoPag32.trim());
		
		String textoPag33 = "R$150,00";
		System.out.println(textoPag33.substring(0, 5));
		System.out.println(textoPag33.substring(2, 5));
		System.out.println(textoPag33.substring(2));
		
		String textoPag34 = "Apartamento 53";
		textoPag34 = textoPag34.replace("Apartamento","Apto");
		System.out.println(textoPag34);
	}

}
