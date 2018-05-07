package exercicios.Ex1003;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int A = leia.nextInt();
		int B = leia.nextInt();
		
		int SOMA = A + B;
		System.out.println("SOMA = "+SOMA);
		leia.close();
	}

}
