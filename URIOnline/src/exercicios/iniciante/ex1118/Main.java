package exercicios.iniciante.ex1118;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		NumberFormat dec = new DecimalFormat("#0.00");
//		Locale.setDefault(Locale.US);
		float a, b;
		int x;
		StringBuffer tudo = new StringBuffer("");
		Scanner leia = new Scanner(System.in);
		
		do {
			do {
				a = leia.nextFloat();
				if(a < 0 || a > 10){
					tudo.append("nota invalida\n");
				}
				else{
					break;
				}
			} while (true);
			
			do {
				b = leia.nextFloat();
				if(b < 0 || b > 10){
					tudo.append("nota invalida\n");
				}
				else{
					break;
				}
			} while (true);
			
			tudo.append("media = ");
			tudo.append(dec.format((a + b) / 2.0));
			tudo.append("\n");
			
			do {
				tudo.append("novo calculo (1-sim 2-nao)\n");
				x = leia.nextInt();
				if(x == 1 || x == 2){
					break;
				}
			} while (true);
		} while (x != 2);
		System.out.print(tudo);
		leia.close();
	}
}