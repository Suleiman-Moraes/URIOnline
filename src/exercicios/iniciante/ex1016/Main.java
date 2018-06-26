package exercicios.iniciante.ex1016;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int a = leia.nextInt();
		System.out.println((a * 2) + " minutos");
		leia.close();
	}
}