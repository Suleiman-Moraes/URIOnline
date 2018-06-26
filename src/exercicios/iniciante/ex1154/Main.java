package exercicios.iniciante.ex1154;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
//		NumberFormat dec = new DecimalFormat("#0.00");
//		Locale.setDefault(Locale.US);
		int a;
//		StringBuffer tudo = new StringBuffer("");
		Scanner leia = new Scanner(System.in);
		a = leia.nextInt();
		float soma = 0;
		int cont = 0;
		
		while (a >= 0) {
			cont ++;
			soma += a;
			a = leia.nextInt();
		}
		leia.close();
		
		soma = (float) ((soma * 1.0) / cont);
		System.out.printf("%.2f\n", soma);
	}
}