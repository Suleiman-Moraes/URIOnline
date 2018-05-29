package exercicios.ex1115;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
//		NumberFormat dec = new DecimalFormat("#0.0");
//		 Locale.setDefault(Locale.US);
		StringBuffer tudo = new StringBuffer("");
		Scanner leia = new Scanner(System.in);
		
		int a, b;
		do {
			a = leia.nextInt();
			b = leia.nextInt();
			
			if(a == 2002){
				tudo.append("Acesso Permitido\n");
				break;
			}
			else{
				tudo.append("Senha Invalida\n");
			}
		} while (true);
		System.out.print(tudo);
		leia.close();
	}
}