package exercicios.iniciante.ex1564;

import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT: O nome da classe deve ser "Main" para que a sua solução execute
 * Class name must be "Main" for your solution to execute El nombre de la clase
 * debe ser "Main" para que su solución ejecutar
 */
public class Main {

	private static final String FIRST_MESSAGE = "vai ter copa!";
	private static final String SECOND_MESSAGE = "vai ter duas!";
	private static byte value;

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);

		while (receiveValues(scan)) {
			System.out.println(value > 0 ? SECOND_MESSAGE : FIRST_MESSAGE);
		}
		scan.close();
	}

	private static boolean receiveValues(Scanner scan) {
		try {
			value = scan.nextByte();
			return Boolean.TRUE;
		} catch (Exception e) {
			return Boolean.FALSE;
		}
	}
}