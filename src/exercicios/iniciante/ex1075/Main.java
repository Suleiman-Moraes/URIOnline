package exercicios.iniciante.ex1075;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Locale.setDefault(Locale.US);
		int a;
		Scanner leia = new Scanner(System.in);
		a = leia.nextInt();

		leia.close();

		for (int i = 1; i <= 10000; i++) {
			if (i % a == 2) {
				System.out.println(i);
			}
		}	
	}
}