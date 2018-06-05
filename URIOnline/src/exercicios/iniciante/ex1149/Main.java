package exercicios.iniciante.ex1149;

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
		} while (b <= 0);
		leia.close();
		int soma = 0;
		for (int i = 0; i < b; i++) {
			soma += a + i;
		}
		System.out.println(soma);
	}
}