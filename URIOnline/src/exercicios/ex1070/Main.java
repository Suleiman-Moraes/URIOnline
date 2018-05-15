package exercicios.ex1070;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		Locale.setDefault(Locale.US);
		int x;
		Scanner leia = new Scanner(System.in);
		x = leia.nextInt();
		leia.close();
		
		int cont = 1;
		StringBuffer saida = new StringBuffer("");
		for (int i = x; i <= Integer.MAX_VALUE; i++) {
			if(i % 2 != 0){
				saida.append(i).append("\n");
				if(cont == 6){
					break;
				}
				else{
					cont ++;
				}
			}
		}
		System.out.print(saida.toString());
	}
}