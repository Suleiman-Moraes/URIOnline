package exercicios.iniciante.ex1117;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		NumberFormat dec = new DecimalFormat("#0.00");
//		 Locale.setDefault(Locale.US);
		float a, b;
		StringBuffer tudo = new StringBuffer("");
		Scanner leia = new Scanner(System.in);
		
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
		System.out.print(tudo);
		leia.close();
	}
}