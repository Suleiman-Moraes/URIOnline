package exercicios.iniciante.ex2140;

import java.io.IOException;
import java.util.Scanner;

/**
 * beecrowd | 2140 Duas Notas Por Joao Marcos Salvanini Bellini de Moraes,
 * IFSULDEMINAS BR Brazil
 * 
 * Timelimit: 1 Gilberto é um famoso vendedor de esfirras na região. Porém,
 * apesar de todos gostarem de suas esfirras, ele só sabe dar o troco com duas
 * notas, ou seja, nem sempre é possível receber o troco certo. Para facilitar a
 * vida de Gil, escreva um programa para ele que determine se é possível ou não
 * devolver o troco exato utilizando duas notas.
 * 
 * As notas disponíveis são: 2, 5, 10, 20, 50 e 100.
 * 
 * Entrada A entrada deve conter o valor inteiro N da compra realizada pelo
 * cliente e, em seguida, o valor inteiro M pago pelo cliente (N < M ≤ 104). A
 * entrada termina com N = M = 0.
 * 
 * Saída Seu programa deverá imprimir "possible" se for possível devolver o
 * troco exato ou "impossible" se não for possível.
 * 
 */
public class Main {
	
	private static int changeAllowed = 0;

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		StringBuilder builder = new StringBuilder();
		while (scan.hasNextInt()) {
			final int value = scan.nextInt();
			final int money = scan.nextInt();
			if(value + money == 0) {
				break;
			}
			builder.append(execute(value, money)).append("\n");
		}
		System.out.print(builder);
		scan.close();
	}

	public static String execute(int value, int money) {
		final int change = money - value;
		int count = 0;
		if (change > 3) {
			final int[] values = { 100, 50, 20, 10, 5, 2 };
			changeAllowed = change;
			for (int v : values) {
				count = calculateHowManyNotes(count, v);
				if (count > 2) {
					break;
				}
			}
		}
		return count == 2 ? "possible" : "impossible";
	}

	private static int calculateHowManyNotes(int count, int value) {
		if (count <= 2) {
			final int result = changeAllowed - value;
			if (result >= 0) {
				changeAllowed = result;
				count++;
				if (result <= value) {
					return calculateHowManyNotes(count, value);
				}
			}
		}
		return count;
	}
}