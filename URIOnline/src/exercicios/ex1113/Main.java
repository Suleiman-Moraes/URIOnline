package exercicios.ex1113;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
//		NumberFormat dec = new DecimalFormat("#0.0");
//		 Locale.setDefault(Locale.US);
		StringBuffer tudo = new StringBuffer("");
		Scanner leia = new Scanner(System.in);
		
		int a, b;
		do {
			a = leia.nextInt();
			b = leia.nextInt();
			
			if(a == b){
				break;
			}
			else if(a > b){
				tudo.append("Decrescente\n");
			}
			else{
				tudo.append("Crescente\n");
			}
		} while (true);
		System.out.print(tudo);
		leia.close();
	}
}