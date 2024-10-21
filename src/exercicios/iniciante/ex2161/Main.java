package exercicios.iniciante.ex2161;

import java.io.IOException;
import java.util.Scanner;

/**
 * beecrowd | 2161 Raiz Quadrada de 10 Por M.C. Pinto, UNILA BR Brazil
 * 
 * Timelimit: 1 Uma das formas de calcular a raiz quadrada de um número natural
 * é pelo método das frações periódicas continuadas. Esse método usa como
 * denominador uma repetição de frações. Essa repetição pode ser feita uma
 * quantidade específica de vezes.
 * 
 * Por exemplo, ao repetir 2 vezes a fração continuada para calcular a raiz
 * quadrada de 10, temos a fórmula abaixo.
 * 
 * 
 * 
 * Sua tarefa é, dado o número N de repetições, calcular o valor aproximado da
 * raiz quadrada de 10.
 * 
 * Entrada A entrada é um número natural N (0 ≤ N ≤ 100), que indica o número de
 * repetições do denominador na fração continuada.
 * 
 * Saída A saída é o valor aproximado da raiz quadrada com 10 casas decimais.
 * 
 * 
 */
public class Main {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		System.out.println(execute(scan.nextInt()));
		scan.close();
	}

	protected static String execute(int times) {
		double value = 0;
		for (int i = 0; i < times; i++) {
			value += 6;
			value = 1.0 / value;
		}
		value += 3;
		return String.format("%.10f", value).replace(",", ".");
	}
}