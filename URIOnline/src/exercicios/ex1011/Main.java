package exercicios.ex1011;

import java.util.Formatter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Formatter fmt = new Formatter(System.out);
		double a = leia.nextDouble();
		
		double resultado = 4/3.0 * 3.14159 * Math.pow(a, 3);
		fmt.format("VOLUME = %.3f\n", resultado);
		leia.close();
		fmt.close();
	}

}