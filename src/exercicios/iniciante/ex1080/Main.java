package exercicios.iniciante.ex1080;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		NumberFormat dec = new DecimalFormat("#0.0");
//		 Locale.setDefault(Locale.US);
//		StringBuffer tudo = new StringBuffer();
		int a, m = 0, j = 0;
		Scanner leia = new Scanner(System.in);
		
		for (int i = 1; i <= 100; i++) {
			a = leia.nextInt();
			if(a > m){
				m = a;
				j = i;
			}
		}
		leia.close();
		System.out.println(m);
		System.out.println(j);
	}
}