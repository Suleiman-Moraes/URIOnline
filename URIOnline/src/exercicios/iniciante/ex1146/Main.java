package exercicios.iniciante.ex1146;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
//		NumberFormat dec = new DecimalFormat("#0.00");
//		Locale.setDefault(Locale.US);
		int a;
		StringBuffer tudo = new StringBuffer("");
		Scanner leia = new Scanner(System.in);
		a = leia.nextInt();
		do {
			for (int i = 1; i <= (a - 1); i++) {
				tudo.append(i);
				tudo.append(" ");
			}
			tudo.append(a);
			tudo.append("\n");
			a = leia.nextInt();
		} while (a != 0);
		System.out.print(tudo);
		leia.close();
	}
}