package exercicios.iniciante.ex1165;

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
			
			for (int j = 1; j <= Math.sqrt(a) + 1; j++) {
				if(a % j == 0){
					cont ++;
				}
			}
			
			tudo.append(a);
			if(a == 1){
				tudo.append(" nao eh primo\n");
			}
			else if(a == 2){
				tudo.append(" eh primo\n");
			}
			else if(cont == 1){
				tudo.append(" eh primo\n");
			}
			else{
				tudo.append(" nao eh primo\n");
			}
		}
		
		leia.close();
		System.out.print(tudo);
	}
}