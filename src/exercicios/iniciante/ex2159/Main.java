package exercicios.iniciante.ex2159;

import java.io.IOException;
import java.util.Scanner;

/**
 * beecrowd | 2159 Número Aproximado de Primos Por M.C. Pinto, UNILA BR Brazil
 * 
 * Timelimit: 1 Schoenfeld e Rosser publicaram em 1962 um artigo descrevendo um
 * valor mínimo e máximo para a quantidade de números primos até n, para n ≥ 17.
 * Esta quantidade é representada pela função (n) e a fórmula é mostrada abaixo.
 * 
 * 
 * 
 * Sua tarefa é, dado um natural n, calcular o mínimo e máximo do intervalo para
 * o número aproximado de primos até n.
 * 
 * Entrada A entrada é um número natural n (17 ≤ n ≤ 109).
 * 
 * Saída A saída são dois valores P e M com 1 casa decimal cada, tal que P < (n)
 * < M, de acordo com a fórmula dada acima. Os valores devem ser separados por
 * um espaço em branco.
 * 
 * 
 */
public class Main {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		System.out.println(execute(scan.nextLong()));
		scan.close();
	}

	protected static String execute(long value) {
		final double valueLog = Math.log(value);
		final double min = value / valueLog;
		final double max = 1.25506 * min;
		return String.format("%.1f %.1f", min, max).replaceAll(",", ".");
	}
}