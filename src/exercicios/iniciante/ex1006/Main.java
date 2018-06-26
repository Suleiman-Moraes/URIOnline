package exercicios.iniciante.ex1006;

import java.util.Formatter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Formatter fmt = new Formatter(System.out);
		double A = leia.nextDouble();
		double B = leia.nextDouble();
		double C = leia.nextDouble();
		
		double MEDIA = ((A * 2) + (B * 3) + (C * 5)) /11;
		fmt.format("MEDIA = %.1f\n", MEDIA);
		leia.close();
		fmt.close();
	}

}
