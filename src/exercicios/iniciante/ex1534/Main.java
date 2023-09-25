package exercicios.iniciante.ex1534;

import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT: O nome da classe deve ser "Main" para que a sua solução execute
 * Class name must be "Main" for your solution to execute El nombre de la clase
 * debe ser "Main" para que su solución ejecutar
 */
public class Main {

	private static final byte ONE = 1;
	private static final byte TWO = 2;
	private static final byte THREE = 3;

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);

		while (true) {
			StringBuilder answer = new StringBuilder();
			byte value = 0;
			try {
				value = scan.nextByte();
			} catch (Exception e) {
				break;
			}

			byte diagonalOne = 0;
			byte diagonalTwo = (byte) (value - 1);
			for (int row = 0; row < value; row++) {
				for (int column = 0; column < value; column++) {
					byte newValue = 0;
					if (column == diagonalTwo) {
						newValue = TWO;
					} else if (column == diagonalOne) {
						newValue = ONE;
					} else {
						newValue = THREE;
					}
					answer.append(newValue);
				}
				diagonalOne++;
				diagonalTwo--;
				answer.append("\n");
			}
			System.out.print(answer);
		}
		scan.close();
	}
}