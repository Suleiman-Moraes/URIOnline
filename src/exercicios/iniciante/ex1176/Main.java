package exercicios.iniciante.ex1176;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
//		NumberFormat dec = new DecimalFormat("#0.00");
//		Locale.setDefault(Locale.US);
		StringBuilder tudo = new StringBuilder("");
		int q;
		Scanner leia = new Scanner(System.in);
		q = leia.nextInt();
		int[] tam = new int[q];
		int maior = 0;
		
		for (int i = 0; i < q; i++) {
			int x = leia.nextInt();
			if (x > maior){
				maior = x;
			}
			tam[i] = x;
		}
		
		long[] fibo = new long[maior + 1];
		
		if(maior > 1){
			fibo[0] = 0;
			fibo[1] = 1;
			for (int j = 2; j < fibo.length; j++) {
				fibo[j] = fibo[j - 1] + fibo[j - 2];
			}
		}
		
		for (int i = 0; i < tam.length; i++) {
			tudo.append("Fib(").append(tam[i]).append(") = ");
			tudo.append(fibo[tam[i]]);
			tudo.append("\n");
		}
		
		leia.close();
		System.out.print(tudo);
	}
}