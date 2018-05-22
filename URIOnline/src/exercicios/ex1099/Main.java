package exercicios.ex1099;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
//		NumberFormat dec = new DecimalFormat("#0.0");
//		 Locale.setDefault(Locale.US);
//		StringBuffer tudo = new StringBuffer();
		int flag = 0;
		int a = 0;
		int b = 0;
		Scanner leia = new Scanner(System.in);
		flag = leia.nextInt();
		
		for (int j = 0; j < flag; j++) {
			a = leia.nextInt();
			b = leia.nextInt();
			
			int soma = 0;
			if(a > b){
				for (int i = (b + 1); i < a; i++) {
					if(i % 2 != 0) soma += i;
				}
			}
			else{
				for (int i = (a + 1); i < b; i++) {
					if(i % 2 != 0) soma += i;
				}
			}
			System.out.println(soma);
		}
		leia.close();
	}
}