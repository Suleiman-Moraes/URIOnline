package exercicios.iniciante.ex1145;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
//		NumberFormat dec = new DecimalFormat("#0.00");
//		Locale.setDefault(Locale.US);
		int a, b;
//		StringBuffer tudo = new StringBuffer("");
		Scanner leia = new Scanner(System.in);
		a = leia.nextInt();
		b = leia.nextInt();
		leia.close();
		
		long i = 1;
		do {
			for (int j = 0; j < a; j++) {
				if(i > b) break;
				System.out.print(i);
				if(j != (a - 1)) System.out.print(" ");
				i++;
			}
			System.out.println();
		} while (i <= b);
	}
}