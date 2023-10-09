package exercicios.iniciante.ex1958;

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
		final String value = scan.next();
		System.out.println(execute(value));
		scan.close();
	}

	public static String execute(String value) {
		return String.format("%s%.4E", (value.startsWith("-") ? "" : "+"), Double.valueOf(value)).replaceAll(",", ".");
	}
}