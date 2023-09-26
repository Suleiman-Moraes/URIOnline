package exercicios.iniciante.ex1557;

import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT: O nome da classe deve ser "Main" para que a sua solução execute
 * Class name must be "Main" for your solution to execute El nombre de la clase
 * debe ser "Main" para que su solución ejecutar
 */
public class Main {

	private static byte value;
	private static final byte ZERO = 0;
	private static final byte ONE = 1;
	private static final String ONE_SPACE = " ";
	private static final String BREAK_LINE = "\n";

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);

		while (receiveValues(scan) != 0) {
			int[][] matrix = new int[value][value];

			for (int row = 0; row < value; row++) {
				final int rowValue = row == ZERO ? ONE : toDoubleValue(matrix[row - ONE][ZERO]);
				for (int column = 0; column < value; column++) {
					matrix[row][column] = column == ZERO ? rowValue : toDoubleValue(matrix[row][column - ONE]);
				}
			}
			printMatrix(matrix);
		}
		scan.close();
	}

	private static void printMatrix(final int[][] matrix) {
		StringBuilder text = new StringBuilder();
		final byte last = (byte) (value - ONE);
		final byte spaceMax = calcSpaceMax(matrix[last][last]);
		for (int row = 0; row < value; row++) {
			text.append(calcSpace(matrix[row][ZERO], spaceMax));
			text.append(matrix[row][ZERO]);
			for (int column = 1; column < value; column++) {
				text.append(calcSpace(matrix[row][column], spaceMax)).append(ONE_SPACE);
				text.append(matrix[row][column]);
			}
			text.append(BREAK_LINE);
		}
		System.out.println(text);
	}

	private static String calcSpace(final int value, final byte spaceMax) {
		StringBuilder space = new StringBuilder();
		for (int i = 0; i < spaceMax - (value + "").length(); i++) {
			space.append(ONE_SPACE);
		}
		return space.toString();
	}

	private static byte calcSpaceMax(final int lastValue) {
		return (byte) (lastValue + "").length();
	}

	private static int receiveValues(Scanner scan) {
		value = scan.nextByte();
		return value;
	}

	private static int toDoubleValue(final int value) {
		return value + value;
	}
}