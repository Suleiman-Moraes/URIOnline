package exercicios.iniciante.ex1153;

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
		int soma = 1;
		
		for (int i = a; i > 0; i--) {
			soma = soma * i;
		}
		
		System.out.println(soma);
	}
}