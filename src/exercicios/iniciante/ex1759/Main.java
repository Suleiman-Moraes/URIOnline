package exercicios.iniciante.ex1759;

import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT: O nome da classe deve ser "Main" para que a sua solu��o execute
 * Class name must be "Main" for your solution to execute El nombre de la clase
 * debe ser "Main" para que su soluci�n ejecutar
 */
public class Main {

	private static final String HO = "Ho";
	private static final String SPACE = " ";
	private static final String EXCLAMATION = "!";

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		final int times = scan.nextInt();
		StringBuilder text = new StringBuilder();
		if (times > 0) {
			text.append(HO);
			for (int i = 1; i < times; i++) {
				text.append(SPACE).append(HO);
			}
			text.append(EXCLAMATION);
		}
		System.out.println(text);
		scan.close();
	}
}