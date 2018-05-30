package exercicios.ex1115;

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
			
			if(a == 0 || b == 0){
				break;
			}
			else if(a < 0 && b < 0){
				tudo.append("terceiro\n");
			}
			else if(a > 0 && b > 0){
				tudo.append("primeiro\n");
			}
			else if(a > 0 && b < 0){
				tudo.append("quarto\n");
			}
			else{
				tudo.append("segundo\n");
			}
		} while (true);
		System.out.print(tudo);
		leia.close();
	}
}