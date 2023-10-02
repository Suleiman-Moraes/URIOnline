package exercicios.iniciante.ex1837;

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
		final short dividend = scan.nextShort();
		final short divider = scan.nextShort();
		short rest;
		short quotient;
		if(dividend < 0) {
			short d = dividend;
			for (rest = 0; rest < Math.abs(divider); rest++) {
				d = (short) (dividend - rest);
				if(d % divider == 0) {
					break;
				}
			}
			quotient = (short) (d / divider);
		}
		else {
			quotient = (short) (dividend / divider);
			rest = (short) (dividend % divider);
		}
		System.out.println(String.format("%s %s", quotient, rest));
		scan.close();
	}
}