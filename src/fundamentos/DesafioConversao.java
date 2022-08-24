package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
		Scanner salario = new Scanner(System.in);
		
		String primeiroSalario = salario.nextLine();
		String segundoSalario = salario.nextLine();
		String terceiroSalario = salario.nextLine();
		
		primeiroSalario = primeiroSalario.replace(",", ".");
		segundoSalario = segundoSalario.replace(",", ".");
		terceiroSalario = terceiroSalario.replace(",", ".");
		
		Double primeiroSalarioConvertido = Double.parseDouble(primeiroSalario);
		Double segundoSalarioConvertido = Double.parseDouble(segundoSalario);
		Double terceiroSalarioConvertido = Double.parseDouble(terceiroSalario);
		
		Double media = (primeiroSalarioConvertido + segundoSalarioConvertido +terceiroSalarioConvertido) / 3;
		
		System.out.println(media);
		
		salario.close();
	}
}
