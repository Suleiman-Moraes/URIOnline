package exercicios.iniciante.ex1848;

import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT: O nome da classe deve ser "Main" para que a sua solução execute
 * Class name must be "Main" for your solution to execute El nombre de la clase
 * debe ser "Main" para que su solución ejecutar
 */
public class Main {

	private final static String CAW = "caw caw";
	private final static String ASTERISK = "*";
	private final static byte ZERO = 0;
	private final static byte ONE = 1;
	private final static byte TWO = 2;
	private final static byte THREE = 2;

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		byte count = ZERO;
		short[] vet = { ZERO, ZERO, ZERO };
		do {
			final String signal = scan.nextLine();
			if (CAW.equals(signal)) {
				count++;
				continue;
			} else {
				short valueSum = ZERO;
				byte increment = ONE;
				for (int i = signal.length() - ONE; i >= ZERO; i--) {
					final String c = signal.charAt(i) + "";
					if (ASTERISK.equals(c)) {
						valueSum += increment;
					}
					increment *= TWO;
				}
				vet[count] += valueSum;
			}
		} while (count <= THREE);

		System.out.println(String.format("%s\n%s\n%s", vet[ZERO], vet[ONE], vet[TWO]));
		scan.close();
	}
}