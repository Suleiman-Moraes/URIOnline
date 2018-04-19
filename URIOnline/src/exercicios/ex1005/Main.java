package exercicios.ex1005;

import java.util.Formatter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Formatter fmt = new Formatter(System.out);
		double A = leia.nextDouble();
		double B = leia.nextDouble();
		
		double MEDIA = ((A * 3.5) + (B * 7.5)) /11;
		fmt.format("MEDIA = %.5f\n", MEDIA);
		leia.close();
		fmt.close();
	}

}
