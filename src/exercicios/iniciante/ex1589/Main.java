package exercicios.iniciante.ex1589;

import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT: O nome da classe deve ser "Main" para que a sua solu��o execute
 * Class name must be "Main" for your solution to execute El nombre de la clase
 * debe ser "Main" para que su soluci�n ejecutar
 */
public class Main {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		final short times = scan.nextShort();
		for (int i = 0; i < times; i++) {
			final int value1 = scan.nextInt();
			final int value2 = scan.nextInt();
			System.out.println(value1 + value2);
		}
		scan.close();
	}
}