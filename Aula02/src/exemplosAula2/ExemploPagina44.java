package exemplosAula2;

import java.text.NumberFormat;

public class ExemploPagina44 {

	public static void main(String[] args) {
		
		double valor = 1278.35;
		//Cria um objeto NumberFormat com a formatação da moeda local.
		NumberFormat nf1 = NumberFormat.getCurrencyInstance();
		System.out.println(nf1.format(valor));
		
		double porcentagem = 0.385;
		//Cria um objeto NumberFormat com a formatação de porcentagem.
		NumberFormat nf2 = NumberFormat.getPercentInstance();
		nf2.setMinimumFractionDigits(2); //Número mínimo de casas decimais.
		System.out.println(nf2.format(porcentagem));
		
		System.out.println();
		
		int numero1 = 23;
		System.out.println(String.format("%04d", numero1));
		
		String cpf = "12345678900";
		System.out.println(cpf.replaceAll("(\\d{3})(\\d{3})(\\d{3})(\\d{2})", "$1.$2.$3-$4"));

		String cnpj = "12345678000199";
		System.out.println(cnpj.replaceAll("(\\d{2})(\\d{3})(\\d{3})(\\d{4})(\\d{2})", "$1.$2.$3/$4-$5"));

	}

}
