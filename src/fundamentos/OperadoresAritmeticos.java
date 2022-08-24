package fundamentos;

public class OperadoresAritmeticos {
	
	public static void main(String[] args) {
		
		int parte1 = (6*(3+2));
		int primeiraDivisao = (int) Math.pow(parte1, 2) /(3*2);
		
		int parte2 = ((1-5)*(2-7))/2;
		int segundaDivisao = (int) Math.pow(parte2, 2);
		
		int parte3 = (int) Math.pow((primeiraDivisao - segundaDivisao), 3);
		
		int divisor = (int) Math.pow(10, 3);
		
		int resultado = parte3/divisor;
		
		System.out.println(resultado);
			
	}
}
