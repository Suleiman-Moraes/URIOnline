package exercicios.iniciante.ex1827;

import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT: O nome da classe deve ser "Main" para que a sua solução execute
 * Class name must be "Main" for your solution to execute El nombre de la clase
 * debe ser "Main" para que su solución ejecutar
 */
public class Main {

	private static final Byte ZERO = 0;
	private static final Byte ONE = 1;
	private static final Byte TWO = 2;
	private static final Byte THREE = 3;
	private static final Byte FOUR = 4;

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);

		while (scan.hasNext()) {
			final byte value = scan.nextByte();
			final byte maxPos = (byte) (value - ONE);
			final byte center = (byte) (value / TWO);
			final byte squareStarts = (byte) (value / THREE);
			final byte squareEnds = (byte) (value - squareStarts);

			StringBuilder text = new StringBuilder();
			for (int row = 0; row < value; row++) {
				final boolean squareRow = verifySquare(squareStarts, squareEnds, row);
				for (int column = 0; column < value; column++) {
					if (center == row && center == column) {
						text.append(FOUR);
					} else if (squareRow && verifySquare(squareStarts, squareEnds, column)) {
						// inner square
						text.append(ONE);
					} else if (row == column) {
						// main diagonal
						text.append(TWO);
					} else if (maxPos == (row + column)) {
						// secondary diagonal
						text.append(THREE);
					} else {
						text.append(ZERO);
					}
				}
				text.append("\n");
			}
			System.out.println(text);
		}
		scan.close();
	}

	private static boolean verifySquare(final byte squareStarts, final byte squareEnds, int rowOrColumn) {
		return rowOrColumn >= squareStarts && rowOrColumn < squareEnds;
	}
}