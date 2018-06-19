package exercicios.iniciante.ex1160;

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
			long pa = leia.nextInt();
			long pb = leia.nextInt();
			double ga = leia.nextDouble();
			double gb = leia.nextDouble();
			int cont = 0;
			
			while (true) {
				pa = (int) (pa * (ga/100.0 + 1));
				pb = (int) (pb * (gb/100.0 + 1));
				cont ++;
				if (cont > 100){
					tudo.append("Mais de 1 seculo.\n");
					break;
				}
				else if(pa > pb){
					tudo.append(cont).append(" anos.\n");
					break;
				}
			}
		}
		
		leia.close();
		System.out.print(tudo);
	}
}