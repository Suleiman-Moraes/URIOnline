package exercicios.iniciante.ex1864;

import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT: O nome da classe deve ser "Main" para que a sua solução execute
 * Class name must be "Main" for your solution to execute El nombre de la clase
 * debe ser "Main" para que su solución ejecutar
 */
public class Main {
	
	private static final String PHRASE = "LIFE IS NOT A PROBLEM TO BE SOLVED";

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		final byte letters = scan.nextByte();
		System.out.println(PHRASE.substring(0, letters));
		scan.close();
	}
}