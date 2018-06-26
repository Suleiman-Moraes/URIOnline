package exercicios.iniciante.ex1178;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		NumberFormat dec = new DecimalFormat("#0.0000");
//		Locale.setDefault(Locale.US);
		double[] v = new double[100];
		StringBuilder tudo = new StringBuilder("");
		Scanner leia = new Scanner(System.in);
		v[0] = leia.nextDouble();
		tudo.append("N[").append(0).append("] = ").append(dec.format(v[0])).append("\n");
		
		for (int i = 1; i < v.length; i++) {
			v[i] = v[i -1] / 2;
			tudo.append("N[").append(i).append("] = ").append(dec.format(v[i])).append("\n");
		}
		
		System.out.print(tudo);
		leia.close();
	}
}