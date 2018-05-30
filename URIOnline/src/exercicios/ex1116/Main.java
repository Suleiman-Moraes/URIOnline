package exercicios.ex1116;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		NumberFormat dec = new DecimalFormat("#0.0");
//		 Locale.setDefault(Locale.US);
		int q = 0;
		StringBuffer tudo = new StringBuffer("");
		Scanner leia = new Scanner(System.in);
		q = leia.nextInt();
		
		int a, b;
		do {
			a = leia.nextInt();
			b = leia.nextInt();
			
			if(b < 0){
				
			}
			
		} while (q > 0);
		System.out.print(tudo);
		leia.close();
	}
}