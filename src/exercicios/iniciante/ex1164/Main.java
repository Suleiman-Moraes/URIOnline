package exercicios.iniciante.ex1164;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
//		NumberFormat dec = new DecimalFormat("#0.00");
//		Locale.setDefault(Locale.US);
		int q;
		StringBuffer tudo = new StringBuffer("");
		Scanner leia = new Scanner(System.in);
		q = leia.nextInt();

		for (int i = 0; i < q; i++) {
			int a = leia.nextInt();
			int cont = 0;
			
			for (int j = 1; j < a; j++) {
				if(a % j == 0){
					cont += j;
				}
			}
			
			tudo.append(a);
			if(cont == a){
				tudo.append(" eh perfeito");
			}
			else{
				tudo.append(" nao eh perfeito");
			}
			tudo.append("\n");
		}
		
		leia.close();
		System.out.print(tudo);
	}
}