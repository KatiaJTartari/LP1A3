package exemplosAula6;

public class ExemploPag21Throw {

	public static void main(String[] args) {
		try {
			System.out.println(GetNumero(3));
		} catch (IndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static int GetNumero(int indice) {
		int[] numeros = { 10, 20, 30 };
		
		if (indice > (numeros.length - 1))
			throw new IndexOutOfBoundsException("Este índice não existe!");
		
		return numeros[indice];
	}
}
