package exercicios.iniciante.ex1930;

import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT: O nome da classe deve ser "Main" para que a sua solu��o execute
 * Class name must be "Main" for your solution to execute El nombre de la clase
 * debe ser "Main" para que su soluci�n ejecutar
 */
public class Main {


	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		int total = -3; 
		for (int i = 0; i < 4; i++) {
			total += scan.nextShort();
		}
		System.out.println(total);
		scan.close();
	}
}