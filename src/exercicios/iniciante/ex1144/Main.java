package exercicios.iniciante.ex1144;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
//		NumberFormat dec = new DecimalFormat("#0.00");
//		Locale.setDefault(Locale.US);
		int a;
//		StringBuffer tudo = new StringBuffer("");
		Scanner leia = new Scanner(System.in);
		a = leia.nextInt();
		leia.close();
		
		for (long i = 1; i <= a; i++) {
			System.out.print(i + " ");
			System.out.print((i * i) + " ");
			System.out.print((i * i * i) + "\n");
			
			System.out.print(i + " ");
			System.out.print((i * i) + 1 + " ");
			System.out.print((i * i * i) + 1 + "\n");
		}
	}
}