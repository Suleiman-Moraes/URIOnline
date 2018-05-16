package exercicios.ex1078;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Locale.setDefault(Locale.US);
		int a;
		Scanner leia = new Scanner(System.in);
		a = leia.nextInt();

		leia.close();

		for (int i = 1; i <= 10; i++) {
			System.out.println(i + " x " + a + " = " + (a * i));
		}	
	}
}