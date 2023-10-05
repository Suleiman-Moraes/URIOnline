package exercicios.iniciante.ex1914;

import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT: O nome da classe deve ser "Main" para que a sua solução execute
 * Class name must be "Main" for your solution to execute El nombre de la clase
 * debe ser "Main" para que su solución ejecutar
 */
public class Main {

	private static final byte ZERO = 0;
	private static final byte TWO = 2;
	private static final String LINE_BREAK = "\n";
	private static final String EVEN = "PAR";
	private static final String ODD = "IMPAR";

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		final byte amount = scan.nextByte();
		scan.nextLine();
		StringBuilder text = new StringBuilder();
		for (int i = 0; i < amount; i++) {
			checkWhoWon(scan, text);
		}
		System.out.print(text);
		scan.close();
	}

	private static void checkWhoWon(Scanner scan, StringBuilder text) {
		final String player1 = scan.next();
		final String choicePlayer1 = scan.next();

		final String player2 = scan.next();
		final String choicePlayer2 = scan.next();

		final int valuePlayer1 = scan.nextInt();
		final int valuePlayer2 = scan.nextInt();

		text.append(checkTheWinner(player1, choicePlayer1, player2, choicePlayer2,
				checkEvenOrOdd(valuePlayer1, valuePlayer2)));
		text.append(LINE_BREAK);
	}

	private static String checkEvenOrOdd(final int value1, final int value2) {
		return (value1 + value2) % TWO == ZERO ? EVEN : ODD;
	}

	private static String checkTheWinner(final String player1, final String choicePlayer1, final String player2,
			final String choicePlayer2, final String result) {
		if (result.equals(choicePlayer1)) {
			return player1;
		} else {
			return player2;
		}
	}
}