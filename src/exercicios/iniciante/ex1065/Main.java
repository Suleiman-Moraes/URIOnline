package exercicios.iniciante.ex1065;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		Locale.setDefault(Locale.US);
		int[] a = new int[5];
		Scanner leia = new Scanner(System.in);
		for (int i = 0; i < a.length; i++) {
			a[i] = leia.nextInt();
		}
		leia.close();
		
		int cont = 0;
		for (int i = 0; i < a.length; i++) {
			if(a[i] % 2 == 0){
				cont ++;
			}
		}
		System.out.println(cont + " valores pares");
	}
}