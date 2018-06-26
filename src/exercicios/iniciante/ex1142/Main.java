package exercicios.iniciante.ex1142;

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
		
		int pum = 1;
		for (int i = 0; i < a; i++) {
			System.out.print(pum + " ");
			pum ++;
			System.out.print(pum + " ");
			pum ++;
			System.out.print(pum + " PUM\n");
			pum += 2;
		}
	}
}