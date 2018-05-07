package exercicios.ex1017;

import java.util.Formatter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Formatter fmt = new Formatter(System.out);
		int a = leia.nextInt();
		int b = leia.nextInt();
		double x = (a * b) / 12.0;
		fmt.format("%.3f\n", x);
		leia.close();
		fmt.close();
	}
}