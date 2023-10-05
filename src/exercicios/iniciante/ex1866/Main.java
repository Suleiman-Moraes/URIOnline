package exercicios.iniciante.ex1866;

import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT: O nome da classe deve ser "Main" para que a sua solução execute
 * Class name must be "Main" for your solution to execute El nombre de la clase
 * debe ser "Main" para que su solución ejecutar
 */
public class Main {

	private static final byte ZERO = 0;
	private static final byte ONE = 1;
	private static final byte TWO = 2;
	private static final String LINE_BREAK = "\n";

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		final short amount = scan.nextShort();
		scan.nextLine();
		StringBuilder text = new StringBuilder();
		for (int i = 0; i < amount; i++) {
			text.append(makeAccount(scan.nextShort())).append(LINE_BREAK);
		}
		System.out.print(text);
		scan.close();
	}
	private static short makeAccount(short range) {
		return range % TWO == ZERO ? ZERO : ONE;
	}
}