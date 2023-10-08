package exercicios.iniciante.ex1933;

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
		final byte card1 = scan.nextByte(); 
		final byte card2 = scan.nextByte(); 
		System.out.println(card1 > card2 ? card1 : card2);
		scan.close();
	}
}