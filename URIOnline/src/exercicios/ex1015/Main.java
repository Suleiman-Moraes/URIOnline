package exercicios.ex1015;

import java.util.Formatter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Formatter fmt = new Formatter(System.out);
		int a = leia.nextInt();
		String x = leia.next().replaceAll(",", ".");
		double b = Double.parseDouble(x);
		
		double r = a/b;
		fmt.format("%.3f km/l\n", r);
		leia.close();
		fmt.close();
	}
}