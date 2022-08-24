package fundamentos;

/*
 * Conversor de temperartura de fahrenheit/celcius 
 */

public class Temperatura {
	
	public static void main(String[] args) {
		double tempF = 97;
		double tempC = 0;
		
		final double divisaoConversao = 5/9.0;
		final double subtracaoConversor = 32;
		
		tempC = (tempF - subtracaoConversor) * divisaoConversao;
		
		System.out.println("A temperatura em celcius é " + tempC);
		
	}
}
