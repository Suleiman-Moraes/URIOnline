package exercicios.iniciante.ex1865;

import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT: O nome da classe deve ser "Main" para que a sua solução execute
 * Class name must be "Main" for your solution to execute El nombre de la clase
 * debe ser "Main" para que su solución ejecutar
 */
public class Main {
	
	private static final String YES = "Y";
	private static final String NOT = "N";
	private static final String LINE_BREAK = "\n";
	private static final String THOR = "Thor";

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		final short amount = scan.nextShort();
		scan.nextLine();
		StringBuilder text = new StringBuilder();
		for (int i = 0; i < amount; i++) {
			verifyWhoIsWorthy(scan, text);
		}
		System.out.print(text);
		scan.close();
	}
	
	private static void verifyWhoIsWorthy(Scanner scan, StringBuilder text) {
		final String hero = scan.nextLine();
		text.append(hero.contains(THOR) ? YES : NOT).append(LINE_BREAK);
	}
}