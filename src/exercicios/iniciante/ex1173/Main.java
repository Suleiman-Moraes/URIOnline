package exercicios.iniciante.ex1173;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
//		NumberFormat dec = new DecimalFormat("#0.00");
//		Locale.setDefault(Locale.US);
		long[] v = new long[10];
		StringBuilder tudo = new StringBuilder("");
		Scanner leia = new Scanner(System.in);
		
		v[0] = leia.nextInt();
		tudo.append("N[").append(0).append("] = ").append(v[0]).append("\n");
		
		for (int i = 1; i < v.length; i++) {
			v[i] = 2 * v[i - 1];
			
			tudo.append("N[").append(i).append("] = ").append(v[i]).append("\n");
		}

		leia.close();
		System.out.print(tudo);
	}
}