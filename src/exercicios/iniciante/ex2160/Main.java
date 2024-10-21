package exercicios.iniciante.ex2160;

import java.io.IOException;
import java.util.Scanner;

/**
 * beecrowd | 2160 Nome no Formulário Por M.C. Pinto, UNILA BR Brazil
 * 
 * Timelimit: 1 Preencher formulários é uma tarefa simples. Mas é preciso
 * conferir se o espaço reservado para os dados é suficiente.
 * 
 * Sua tarefa é, dada uma linha de texto, indicar se ele cabe ou não cabe em um
 * formulário com 80 caracteres.
 * 
 * Entrada A entrada é uma linha de texto L (1 ≤ |L| ≤ 500).
 * 
 * Saída A saída é dada em uma única linha. Ela deve ser "YES" (sem as aspas) se
 * a linha de texto L tem até 80 caracteres. Se L tem mais de 80 caracteres, a
 * saída deve ser "NO".
 * 
 * 
 */
public class Main {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		StringBuilder builder = new StringBuilder();
		while (scan.hasNextLine()) {
			builder.append(scan.nextLine());
		}
		System.out.println(execute(builder.toString()));
		scan.close();
	}

	protected static String execute(String text) {
		return text.length() <= 80 ? "YES" : "NO";
	}
}