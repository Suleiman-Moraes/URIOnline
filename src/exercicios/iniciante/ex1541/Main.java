package exercicios.iniciante.ex1541;

import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT: O nome da classe deve ser "Main" para que a sua solução execute
 * Class name must be "Main" for your solution to execute El nombre de la clase
 * debe ser "Main" para que su solución ejecutar
 */
public class Main {

	private static final float PERCENTAGE_MAX = 100.0f;

	private static short valueWidth;
	private static short valueLength;
	private static short valuePercentage;

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);

		while (receiveValues(scan) != 0) {
			final int valueArea = valueWidth * valueLength;
			final int valueAreaNeed = (int) ((PERCENTAGE_MAX / valuePercentage) * valueArea);
			final int result = (int) Math.sqrt(valueAreaNeed);
			System.out.println(result);
		}
		scan.close();
	}

	private static int receiveValues(Scanner scan) {
		valueWidth = scan.nextShort();
		if(valueWidth == 0) {
			return valueWidth;
		}
		valueLength = scan.nextShort();
		valuePercentage = scan.nextShort();
		return valueWidth;
	}
}