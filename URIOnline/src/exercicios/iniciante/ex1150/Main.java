package exercicios.iniciante.ex1150;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
//		NumberFormat dec = new DecimalFormat("#0.00");
//		Locale.setDefault(Locale.US);
		int a, b;
//		StringBuffer tudo = new StringBuffer("");
		Scanner leia = new Scanner(System.in);
		a = leia.nextInt();
		do{
			b = leia.nextInt();
		} while (b <= a);
		leia.close();
		int soma = 0;
		int cont = 0;
		do {
			soma += a + cont;
			cont ++;
		} while (soma <= b);
		System.out.println(cont);
	}
}