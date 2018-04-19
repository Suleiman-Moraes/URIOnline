package exercicios;

import java.util.Scanner;

public class Ex01 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int A, B, X;
		
		A = leia.nextInt();
		B = leia.nextInt();
		X = A + B;
		System.out.println("X = " + X);
	}
}
