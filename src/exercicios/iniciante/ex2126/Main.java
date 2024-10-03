package exercicios.iniciante.ex2126;

import java.io.IOException;
import java.util.Scanner;

/**
 * beecrowd | 2126 Procurando Subsequ�ncias Por Igor Gomes, UEVA BR Brazil
 * 
 * Timelimit: 1 Dados dois n�meros naturais N1 e N2, diz-se que N1 �
 * subsequ�ncia cont�gua de N2 se todos os d�gitos de N1 aparecem, na mesma
 * ordem e de forma cont�gua, em N2. Crie uma aplica��o que leia dois n�meros
 * naturais e diga se o primeiro � uma subsequ�ncia cont�gua do segundo.
 * 
 * Entrada A entrada � composta por v�rios casos de teste e termina com final de
 * arquivo (EOF). A primeira linha de cada entrada � composta por um valor
 * natural N1(1 < N1 < 1010), a segunda linha � composta por um valor N2( N1 <
 * N2 < 1032).
 * 
 * Sa�da Para cada caso de teste imprima a quantidade de subsequ�ncias cont�guas
 * e a posi��o onde a subsequ�ncia � iniciada, caso exista mais de uma
 * subsequ�ncia, imprima onde � iniciada a �ltima subsequ�ncia. Caso n�o exista
 * subsequ�ncia, imprima "Nao existe subsequencia". Mostre o resultado conforme
 * o exemplo de sa�da.
 */
public class Main {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		StringBuilder builder = new StringBuilder();
		int count = 1;
		while (scan.hasNext()) {
			final String n1 = scan.next();
			final String n2 = scan.next();
			builder.append(execute(n1, n2, count)).append("\n");
			count++;
		}
		System.out.print(builder);
		scan.close();
	}

	protected static String execute(String n1, String n2, int numberOfCase) {
		StringBuilder builder = new StringBuilder(String.format("Caso #%s:\n", numberOfCase));
		int pos = 0;
		int countSequence = 0;
		if (!n1.isEmpty() && !n2.isEmpty()) {
			int count = 0;
			final int lengthN1 = n1.length();
			final int lengthN2 = n2.length();
			final String firstN1 = String.valueOf(n1.charAt(0));
			while (count < lengthN2) {
				final String n2Char = String.valueOf(n2.charAt(count));
				if (firstN1.equals(n2Char)) {
					if ((count + lengthN1) <= lengthN2) {
						final String textN2 = n2.substring(count, count + lengthN1);
						if (n1.equals(textN2)) {
							pos = count + 1;
							countSequence++;
							count += lengthN1;
							continue;
						}
					} else {
						break;
					}
				}
				count++;
			}
		}
		if (countSequence > 0) {
			builder.append("Qtd.Subsequencias: ").append(countSequence);
			builder.append("\nPos: ").append(pos).append("\n");
		} else {
			builder.append("Nao existe subsequencia\n");
		}
		return builder.toString();
	}
}