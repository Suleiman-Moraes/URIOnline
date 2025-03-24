package exercicios.iniciante.ex2163;

import java.io.IOException;
import java.util.Scanner;

/**
 * beecrowd | 2163 O Despertar da Força Por M.C. Pinto, UNILA BR Brazil
 * 
 * Timelimit: 1 Há muito tempo atrás, em uma galáxia muito, muito distante...
 * 
 * Após o declínio do Império, sucateiros estão espalhados por todo o universo
 * procurando por um sabre de luz perdido. Todos sabem que um sabre de luz emite
 * um padrão de ondas específico: 42 cercado por 7 em toda a volta. Você tem um
 * sensor de ondas que varre um terreno com N x M células. Veja o exemplo abaixo
 * para um terreno 4 x 7 com um sabre de luz nele (na posição (2, 4)).
 * 
 * 
 * 
 * Você deve escrever um programa que, dado um terreno N x M, procura pelo
 * padrão do sabre de luz nele. Nenhuma varredura tem mais do que um padrão de
 * sabre de luz.
 * 
 * Entrada A primeira linha da entrada tem dois números positivos N e M,
 * representando, respectivamente, o número de linhas e de colunas varridos no
 * terreno (3 ≤ N, M ≤ 1000). Cada uma das próximas N linhas tem M inteiros, que
 * descrevem os valores lidos em cada célula do terreno (-100 ≤ Tij ≤ 100, para
 * 1 ≤ i ≤ N e 1 ≤ j ≤ M).
 * 
 * Saída A saída é uma única linha com 2 inteiros X e Y separados por um espaço.
 * Eles representam a coordenada (X,Y) do sabre de luz, caso encontrado. Se o
 * terreno não tem um padrão de sabre de luz, X e Y são ambos zero.
 * 
 * 
 */
public class Main {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		final int row = scan.nextInt();
		final int column = scan.nextInt();

		int[][] matrix = new int[row][column];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				matrix[i][j] = scan.nextInt();
			}
		}
		System.out.println(execute(matrix));
		scan.close();
	}

	protected static String execute(int[][] matrix) {
		for (int line = 1; line < matrix.length - 1; line++) {
			for (int column = 1; column < matrix[0].length - 1; column++) {
				if (matrix[line][column] == 42 && verifySameLine(line, column, matrix)
						&& verifyOtherLine(line - 1, column, matrix) && verifyOtherLine(line + 1, column, matrix)) {
					return String.format("%s %s", line + 1, column + 1);
				}
			}
		}
		return "0 0";
	}

	private static boolean verifySameLine(int line, int column, int[][] matrix) {
		return matrix[line][column - 1] == 7 && matrix[line][column + 1] == 7;
	}

	private static boolean verifyOtherLine(int line, int column, int[][] matrix) {
		return matrix[line][column - 1] == 7 && matrix[line][column] == 7 && matrix[line][column + 1] == 7;
	}
}