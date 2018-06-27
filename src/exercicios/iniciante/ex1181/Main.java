package exercicios.iniciante.ex1181;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
//		NumberFormat dec =s new DecimalFormat("#0.0000");
//		Locale.setDefault(Locale.US);
//		StringBuilder tudo = new StringBuilder("");
		Scanner leia = new Scanner(System.in);
		float[][] m = new float[12][12];
		int linha = leia.nextInt();
		leia.nextLine();
		char operacao = leia.nextLine().charAt(0);
		
		for (int l = 0; l < m.length; l++) {
			for (int c = 0; c < m[l].length; c++) {
				m[l][c] = leia.nextFloat();
			}
		}
		leia.close();
		
		float soma = 0;
		for (int c = 0; c < m[linha].length; c++) {
			soma += m[linha][c];
		}
		
		if(operacao == 'M') {
			soma = soma / m[linha].length;
		}
		
		System.out.printf("%.1f\n", soma);
	}
}