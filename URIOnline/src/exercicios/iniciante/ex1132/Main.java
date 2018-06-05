package exercicios.iniciante.ex1132;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
//		NumberFormat dec = new DecimalFormat("#0.00");
//		Locale.setDefault(Locale.US);
		int a, b;
//		StringBuffer tudo = new StringBuffer("");
		Scanner leia = new Scanner(System.in);
		
		a = leia.nextInt();
		b = leia.nextInt();
		leia.close();
			
		int ate = 0;
		int de = 0;
		if(a > b){
			ate = a;
			de = b;
		}
		else{
			ate = b;
			de = a;
		}
		a = 0;
		for (int i = de; i <= ate; i++) {
			if(i % 13 != 0) a += i;
		}
		
		System.out.println(a);
	}
}