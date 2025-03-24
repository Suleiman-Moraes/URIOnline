package exercicios.iniciante.ex2164;

import java.io.IOException;
import java.util.Scanner;

/**
 * A fórmula de Binet é uma forma de calcular números de Fibonacci.
 * 
 * 
 * 
 * Sua tarefa é, dado um natural n, calcular o valor de Fibonacci(n) usando a
 * fórmula acima.
 * 
 * Entrada A entrada é um número natural n (0 < n ≤ 50).
 * 
 * Saída A saída é o valor de Fibonacci(n) com 1 casa decimal utilizando a
 * fórmula de Binet dada.
 * 
 * 
 */
public class Main {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		final int value = scan.nextInt();
		System.out.println(execute(value));
		scan.close();
	}

	protected static String execute(int value) {
		final double fiveSqrt = Math.sqrt(5);
		final double result = (Math.pow((1 + fiveSqrt) / 2, value) - Math.pow((1 - fiveSqrt) / 2, value)) / fiveSqrt;
		return String.format("%.1f", result).replaceAll(",", ".");
	}
}