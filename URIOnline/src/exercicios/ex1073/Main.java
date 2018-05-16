package exercicios.ex1073;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Locale.setDefault(Locale.US);
		int a;
		Scanner leia = new Scanner(System.in);
		a = leia.nextInt();

		leia.close();

		for (int i = 1; i <= a; i++) {
			if (i % 2 == 0) {
				System.out.println(i + "^2 = " + (long) Math.pow(i, 2));
			}
		}	
	}
}