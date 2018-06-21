package exercicios.iniciante.ex1175;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
//		NumberFormat dec = new DecimalFormat("#0.0");
//		Locale.setDefault(Locale.US);
		int[] v = new int[20];
		StringBuilder tudo = new StringBuilder("");
		Scanner leia = new Scanner(System.in);
		
		for (int i = 0; i < v.length; i++) {
			v[i] = leia.nextInt();
		}
		
		for (int i = 0; i < v.length/2; i++) {
			int aux = v[i];
			v[i] = v[v.length - 1 - i];
			v[v.length - 1 - i] = aux;
			
			tudo.append("N[").append(i).append("] = ").append(v[i]).append("\n");
		}
		for (int i = 10; i < v.length; i++) {
			tudo.append("N[").append(i).append("] = ").append(v[i]).append("\n");
		}

		leia.close();
		System.out.print(tudo);
	}
}