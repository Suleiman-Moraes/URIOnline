package exercicios.iniciante.ex1957;

import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT: O nome da classe deve ser "Main" para que a sua solução execute
 * Class name must be "Main" for your solution to execute El nombre de la clase
 * debe ser "Main" para que su solución ejecutar
 */
public class Main {

	private static final String DIGITS = "0123456789ABCDEF";
	
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		int value = scan.nextInt();
		StringBuilder hex = new StringBuilder();
		if (value <= 0) {
			hex.append(0);
		}
		while (value > 0) {
			int digit = value % 16;
			hex.insert(0, DIGITS.charAt(digit));
			value = value / 16;
		}
		System.out.println(hex);
		scan.close();
	}
}