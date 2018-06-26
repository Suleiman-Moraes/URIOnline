package exercicios.iniciante.ex1159;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
//		NumberFormat dec = new DecimalFormat("#0.00");
//		Locale.setDefault(Locale.US);
		int q;
		StringBuffer tudo = new StringBuffer("");
		Scanner leia = new Scanner(System.in);
		
		while(true){
			q = leia.nextInt();
			if(q == 0){
				break;
			}
			int cont = 0;
			int soma = 0;
			
			while(cont < 5){
				if(q % 2 == 0){
					soma += q;
					cont ++;
					q += 2;
				}
				else{
					q++;
				}
			}
			tudo.append(soma).append("\n");
		}
		leia.close();
		System.out.print(tudo);
	}
}