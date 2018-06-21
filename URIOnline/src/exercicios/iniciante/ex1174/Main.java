package exercicios.iniciante.ex1174;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		NumberFormat dec = new DecimalFormat("#0.0");
//		Locale.setDefault(Locale.US);
		float[] v = new float[100];
		StringBuilder tudo = new StringBuilder("");
		Scanner leia = new Scanner(System.in);
		
		for (int i = 0; i < v.length; i++) {
			v[i] = leia.nextFloat();
			
			if(v[i] <= 10){
				tudo.append("A[").append(i).append("] = ").append(dec.format(v[i])).append("\n");
			}
		}

		leia.close();
		System.out.print(tudo);
	}
}