package exemplosAula2;

public class ExemploPagina14 {

	public static void main(String[] args) {
		
		String opcao = "sim";
		
		switch (opcao) {
		    case "sim":
		    	System.out.println("Voc� escolheu a op��o SIM");
		    	break;
		    case "n�o":	
		    case "talvez":	
		    	System.out.println("Voc� n�o escolheu a op��o SIM");
		    	break;
		    default:
		    	System.out.println("A op��o digitada � inv�lida");
		     	break;
		}

	}

}
