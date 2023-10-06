package exercicios.iniciante.ex1924;

import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT: O nome da classe deve ser "Main" para que a sua solução execute
 * Class name must be "Main" for your solution to execute El nombre de la clase
 * debe ser "Main" para que su solución ejecutar
 */
public class Main {
	
	private static final String CIENCIA_DA_COMPUTACAO = "Ciencia da Computacao";

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		final short amount = scan.nextShort();
		scan.nextLine();
		for (int i = 0; i < amount; i++) {
			scan.nextLine();
		}
		System.out.println(CIENCIA_DA_COMPUTACAO);
		scan.close();
	}
}