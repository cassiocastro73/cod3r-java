package fundamentos;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		System.out.println("Digite uma entrada: ");
		
		Scanner entrada = new Scanner(System.in);
		String mensagem = entrada.nextLine();
		System.out.println("Você digitou: " + mensagem);
		
		entrada.close();
		
	}
}
