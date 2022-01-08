package exemplosAula2;

public class ExemploPagina14 {

	public static void main(String[] args) {
		
		String opcao = "sim";
		
		switch (opcao) {
		    case "sim":
		    	System.out.println("Você escolheu a opção SIM");
		    	break;
		    case "não":	
		    case "talvez":	
		    	System.out.println("Você não escolheu a opção SIM");
		    	break;
		    default:
		    	System.out.println("A opção digitada é inválida");
		     	break;
		}

	}

}
