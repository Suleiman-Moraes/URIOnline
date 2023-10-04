package exercicios.iniciante.ex1858;

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
		final byte times = scan.nextByte();
		
		byte executioner = scan.nextByte();
		byte executionerPos = 1;
		for (byte i = 1; i < times; i++) {
			final byte min = scan.nextByte();
			if(min < executioner) {
				executioner = min;
				executionerPos = (byte) (i + 1);
			}
		}
		System.out.println(executionerPos);
		
		scan.close();
	}
}