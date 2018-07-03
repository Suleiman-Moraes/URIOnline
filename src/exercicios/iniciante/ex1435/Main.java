package exercicios.iniciante.ex1435;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
//		NumberFormat dec = new DecimalFormat("#0.0000");
//		Locale.setDefault(Locale.US);
//		StringBuilder tudo = new StringBuilder("");
		Scanner leia = new Scanner(System.in);
		
		while(true) {
			int n = leia.nextInt();
			if(n == 0) {
				break;
			}
			int[][] m = new int[n][n];
			
			int j = 1;
			int p = 0;
			int q = 0;
			int i = n;
			int r = 0;
			
			if(n % 2 == 0) {
				r = n / 2;
			}
			else {
				r = (n / 2) + 1; 
			}
			
			for (int k = 0; k <= r; k++) {
				
				for (int l = p; l < i; l++) {
					for (int c = q; c < i; c++) {
						m[l][c] = j;
					}
				}
				j++;
				p++;
				q++;
				i--;
			}
			
			for (int l = 0; l < m.length; l++) {
				for (int c = 0; c < m[l].length; c++) {
					if(c == 0) {
						System.out.printf("%3d", m[l][c]);
					}
					else {
						System.out.printf(" %3d", m[l][c]);
					}
				}
				System.out.println();
			}
			System.out.println();
		}
		leia.close();
	}
}