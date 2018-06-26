package exercicios.iniciante.ex1158;

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
			int b = leia.nextInt();
			
			int cont = 0;
			int soma = 0;
			
			while(cont < b){
				if(a % 2 != 0){
					soma += a;
					cont ++;
					a += 2;
				}
				else{
					a++;
				}
			}
			tudo.append(soma).append("\n");
		}
		System.out.print(tudo);
		leia.close();
	}
}