package exercicios.ex1116;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		NumberFormat dec = new DecimalFormat("#0.0");
//		 Locale.setDefault(Locale.US);
		int q = 0, a, b;;
		StringBuffer tudo = new StringBuffer("");
		Scanner leia = new Scanner(System.in);
		q = leia.nextInt();
		
		for (int i = 0; i < q; i++) {
			a = leia.nextInt();
			b = leia.nextInt();
			
			if(b == 0){
				tudo.append("divisao impossivel\n");
			}
			else{
				tudo.append(dec.format((double)a / b));
				tudo.append("\n");
			}
			
		}
		System.out.print(tudo);
		leia.close();
	}
}