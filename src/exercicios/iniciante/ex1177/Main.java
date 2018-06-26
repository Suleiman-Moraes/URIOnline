package exercicios.iniciante.ex1177;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
//		NumberFormat dec = new DecimalFormat("#0.0");
//		Locale.setDefault(Locale.US);
		int[] v = new int[1000];
		StringBuilder tudo = new StringBuilder("");
		Scanner leia = new Scanner(System.in);
		int q = leia.nextInt();
		int cont = 0;
		
		for (int i = 0; i < v.length; i++) {
			v[i] = cont;
			cont ++;
			if(cont == q){
				cont = 0;
			}
			tudo.append("N[").append(i).append("] = ").append(v[i]).append("\n");
		}
		
		System.out.print(tudo);
		leia.close();
	}
}