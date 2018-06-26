package exercicios.iniciante.ex1172;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
//		NumberFormat dec = new DecimalFormat("#0.00");
//		Locale.setDefault(Locale.US);
		int[] q = new int[10];
		StringBuilder tudo = new StringBuilder("");
		Scanner leia = new Scanner(System.in);
		for (int i = 0; i < q.length; i++) {
			int x = leia.nextInt();
			if(x <= 0){
				q[i] = 1;
			}
			else{
				q[i] = x;
			}
			
			tudo.append("X[").append(i).append("] = ").append(q[i]).append("\n");
		}

		leia.close();
		System.out.print(tudo);
	}
}