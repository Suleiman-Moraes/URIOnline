package exercicios.iniciante.ex1789;

import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT: O nome da classe deve ser "Main" para que a sua solução execute
 * Class name must be "Main" for your solution to execute El nombre de la clase
 * debe ser "Main" para que su solución ejecutar
 */
public class Main {

	private static short howMany;
	private static final byte LEVEL_1 = 1;
	private static final byte LEVEL_2 = 2;
	private static final byte LEVEL_3 = 3;
	private static final byte TEN = 10;
	private static final byte TWENTY = 20;

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);

		while (receiveValues(scan)) {
			byte max = LEVEL_1;
			for (int i = 0; i < howMany; i++) {
				final byte slugSpeed = scan.nextByte();
				if(max == LEVEL_3) {
					continue;
				}
				if (slugSpeed >= TEN) {
					max = LEVEL_2;
					if (slugSpeed >= TWENTY) {
						max = LEVEL_3;
					}
				}
			}
			System.out.println(max);
		}
		scan.close();
	}

	private static boolean receiveValues(Scanner scan) {
		if(!scan.hasNext()) {
			return Boolean.FALSE;
		}
		try {
			howMany = scan.nextShort();
			return Boolean.TRUE;
		} catch (Exception e) {
			return Boolean.FALSE;
		}
	}
}