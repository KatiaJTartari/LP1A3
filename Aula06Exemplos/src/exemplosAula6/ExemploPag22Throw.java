package exemplosAula6;

public class ExemploPag22Throw {

	public static void main(String[] args) {
		try {
			System.out.println(GetDiaSemana(8));
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}
	
	static String GetDiaSemana(int dia) {
		switch (dia) {
		case 1:
			return "Domingo";
		case 2:
			return "Segunda-feira";
		case 3:
			return "Terça-feira";
		case 4:
			return "Quarta-feira";
		case 5:
			return "Quinta-feira";
		case 6:
			return "Sexta-feira";
		case 7:
			return "Sábado";
			default:
				throw new IllegalArgumentException("Dia inexistente!");
		}
	}
}
