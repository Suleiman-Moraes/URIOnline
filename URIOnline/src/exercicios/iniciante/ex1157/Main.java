package exercicios.iniciante.ex1157;

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
		
		for (int i = 1; i <= a; i++) {
			if(a % i == 0) System.out.println(i);
		}
	}
}