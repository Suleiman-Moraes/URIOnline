package exercicios.iniciante.ex1151;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
//		NumberFormat dec = new DecimalFormat("#0.00");
//		Locale.setDefault(Locale.US);
		int a = 1, b = 0, x;
//		StringBuffer tudo = new StringBuffer("");
		Scanner leia = new Scanner(System.in);
		x = leia.nextInt();
		leia.close();
		System.out.print("0 1");
		
		for (int i = 0; i < x - 2; i++) {
			int aux = a;
			a = a + b;
			b = aux;
			System.out.print(" " + a);
		}
		
		System.out.println();
	}
}