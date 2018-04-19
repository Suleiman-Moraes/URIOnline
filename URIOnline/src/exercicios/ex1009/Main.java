package exercicios.ex1009;

import java.util.Formatter;
import java.util.Scanner;

public class Main {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Formatter fmt = new Formatter(System.out);
		String a = leia.next();
		double b = leia.nextDouble();
		double c = leia.nextDouble();
		
		double resultado = (c * 0.15) + b;
		fmt.format("TOTAL = R$ %.2f\n", resultado);
		leia.close();
		fmt.close();
	}

}