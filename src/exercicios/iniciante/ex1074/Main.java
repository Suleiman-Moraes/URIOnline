package exercicios.iniciante.ex1074;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		Locale.setDefault(Locale.US);
		int a;
		Scanner leia = new Scanner(System.in);
		a = leia.nextInt();
		
		StringBuffer tudo = new StringBuffer("");
		for (int i = 0; i < a; i++) {
			int x = leia.nextInt();
			if(x == 0){
				tudo.append("NULL\n");
			}
			else{
				if(x % 2 == 0) tudo.append("EVEN ");
				else tudo.append("ODD ");
				if(x > 0) tudo.append("POSITIVE\n");
				else tudo.append("NEGATIVE\n");
			}
		}
		System.out.print(tudo);
		leia.close();
	}
}