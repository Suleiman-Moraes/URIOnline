package exercicios.iniciante.ex1847;

import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT: O nome da classe deve ser "Main" para que a sua solução execute
 * Class name must be "Main" for your solution to execute El nombre de la clase
 * debe ser "Main" para que su solución ejecutar
 */
public class Main {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		final byte first = scan.nextByte();
		final byte second = scan.nextByte();
		final byte third = scan.nextByte();
		byte differenceA;
		boolean happy = false;
		if (second > first) {
			differenceA = (byte) (second - first);
			if (third > second) {
				happy = (third - second) >= differenceA;
			}
		} else if (second < first) {
			differenceA = (byte) (first - second);
			if (third < second) {
				happy = !((second - third) >= differenceA);
			} else {
				happy = true;
			}
		} else {
			// equal
			happy = third > second;
		}
		System.out.println(happy ? ":)" : ":(");
		scan.close();
	}
}