package exercicios.iniciante.ex1959;

import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT: O nome da classe deve ser "Main" para que a sua solução execute
 * Class name must be "Main" for your solution to execute El nombre de la clase
 * debe ser "Main" para que su solución ejecutar
 */
public class Main {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		final int value1 = scan.nextInt();
		final short value2 = scan.nextShort();
		System.out.println(execute(value1, value2));
		scan.close();
	}

	public static String execute(int value1, short value2) {
		return String.valueOf(1L * value1 * value2);
	}
}