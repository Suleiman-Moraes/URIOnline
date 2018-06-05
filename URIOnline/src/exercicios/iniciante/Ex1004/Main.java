package exercicios.iniciante.Ex1004;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int A = leia.nextInt();
		int B = leia.nextInt();
		
		int PROD = A * B;
		System.out.println("PROD = "+PROD);
		leia.close();
	}

}