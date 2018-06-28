package exercicios.iniciante.ex1184;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
//		NumberFormat dec = new DecimalFormat("#0.0000");
//		Locale.setDefault(Locale.US);
//		StringBuilder tudo = new StringBuilder("");
		Scanner leia = new Scanner(System.in);
		float[][] m = new float[12][12];
		char operacao = leia.nextLine().charAt(0);
		
		int cont = 0;
		float soma = 0;
		for (int l = 0; l < m.length; l++) {
			for (int c = 0; c < m[l].length; c++) {
				m[l][c] = leia.nextFloat();
				if(c < l) {
					soma += m[l][c];
					cont ++;
				}
			}
		}
		leia.close();
		
		if(operacao == 'M') {
			soma = soma / cont;
		}
		
		System.out.printf("%.1f\n", soma);
	}
}