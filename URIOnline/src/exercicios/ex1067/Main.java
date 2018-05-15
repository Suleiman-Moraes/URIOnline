package exercicios.ex1067;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		Locale.setDefault(Locale.US);
		int x;
		Scanner leia = new Scanner(System.in);
		x = leia.nextInt();
		leia.close();
		
		StringBuffer saida = new StringBuffer("");
		for (int i = 1; i <= x; i++) {
			if(i % 2 != 0){
				saida.append(i).append("\n");
			}
		}
		System.out.print(saida.toString());
	}
}