package exercicios.iniciante.ex1929;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * IMPORTANT: O nome da classe deve ser "Main" para que a sua solução execute
 * Class name must be "Main" for your solution to execute El nombre de la clase
 * debe ser "Main" para que su solución ejecutar
 */
public class Main {

	private static final String YES = "S";
	private static final String NOT = "N";

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		final List<Short> list = new ArrayList<>(4);
		for (int i = 0; i < 4; i++) {
			list.add(scan.nextShort());
		}
		list.sort((a, b) -> a.compareTo(b));
		if (list.get(1) + list.get(2) > list.get(3) || list.get(2) - list.get(1) < list.get(0)) {
			System.out.println(YES);
		} else {
			System.out.println(NOT);
		}
		scan.close();
	}
}