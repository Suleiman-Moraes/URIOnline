package exercicios.ex1008;

import java.util.Formatter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Formatter fmt = new Formatter(System.out);
		int a = leia.nextInt();
		int b = leia.nextInt();
		double c = leia.nextDouble();
		
		double resultado = c * b;
		System.out.println("NUMBER = " + a);
		fmt.format("SALARY = U$ %.2f\n", resultado);
		leia.close();
		fmt.close();
	}

}