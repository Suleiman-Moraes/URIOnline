package exercicios.iniciante.ex1134;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
//		NumberFormat dec = new DecimalFormat("#0.00");
//		Locale.setDefault(Locale.US);
		int a;
//		StringBuffer tudo = new StringBuffer("");
		Scanner leia = new Scanner(System.in);
		
		int[] x = new int[3];
		do {
			a = leia.nextInt();
				
			if(a <= 3) x[a - 1]++;
		} while (a != 4);
		
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + x[0]);
		System.out.println("Gasolina: " + x[1]);
		System.out.println("Diesel: " + x[2]);
		leia.close();
	}
}