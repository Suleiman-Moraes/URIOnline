package exercicios.iniciante.ex1101;

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
			
			if(a <= 0 || b <= 0){
				break;
			}
			int cont = 0;
			for (int i = b; i <= a; i++) {
				tudo.append(i).append(" ");
				cont += i;
			}
			for (int i = a; i <= b; i++) {
				tudo.append(i).append(" ");
				cont += i;
			}
			tudo.append("Sum=").append(cont).append("\n");
		} while (true);
		System.out.print(tudo);
		leia.close();
	}
}