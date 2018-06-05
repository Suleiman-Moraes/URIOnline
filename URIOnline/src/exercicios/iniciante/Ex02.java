package exercicios.iniciante;

import java.util.Formatter;
import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Formatter fmt = new Formatter(System.out);
		double raio;
		double A;
		
		raio = leia.nextDouble();
		
		A = 3.14159 * Math.pow(raio, 2);
		fmt.format("A=%.4f\n", A);
		leia.close();
		fmt.close();
	}
}
