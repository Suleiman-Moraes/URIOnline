package exercicios.iniciante.ex2028;

import java.io.IOException;
import java.util.Map;
import java.util.Scanner;

/**
 * beecrowd | 2028 Sequ�ncia de Sequ�ncia
 * 
 * Hyam � um menino que adora sequ�ncias. Ele anda descobrindo sequ�ncias
 * interessantes que nem mesmo Fibonacci imaginaria. Certo dia, Hyam percebeu
 * que dado um n�mero N, ele poderia fazer uma sequ�ncia do tipo 0 1 2 2 3 3 3 4
 * 4 4 4 ... N N N ... N. No entanto, Hyam percebeu que cada valor que aumentava
 * no n�mero da sequ�ncia, a quantidade total de n�meros da sequ�ncia aumentava
 * semelhantemente � um crescimento fatorial, neste caso, ao inv�s de
 * multiplicar, soma-se o n�mero total de n�meros da sequ�ncia com o valor do
 * pr�ximo n�mero da sequ�ncia. Por exemplo, se N = 2. A sequ�ncia correta seria
 * 0 1 2 2, obtendo-se 4 digitos. Agora, se N = 3, o pr�ximo n�mero da sequ�ncia
 * tem valor 3, ent�o a quantidade total de n�mero da sequ�ncia seria a
 * quantidade de n�meros com N = 2, que � 4, mais o valor do pr�ximo n�mero da
 * sequ�ncia, neste caso 3, obtendo-se 7, j� que a sequ�ncia correta para N = 3
 * � 0 1 2 2 3 3 3.
 * 
 * Sua tarefa � fazer um algoritmo que dado um n�mero inteiro N, tenha como
 * resposta a quantidade total de n�meros dessa sequ�ncia e logo abaixo a
 * sequ�ncia completa.
 * 
 * Entrada A entrada � composta de v�rios casos de testes. Cada caso � composto
 * por um inteiro N (0<=N<=200) que indica o valor dos �ltimos N n�meros da
 * sequ�ncia.
 * 
 * A entrada termina com final de arquivo (EOF).
 * 
 * Sa�da A saida � no formato Caso X: N numeros onde X � a ordem do n�mero de
 * casos e N � a quantidade de numeros que cont�m na sequ�ncia completa, na
 * pr�xima linha a sequ�ncia de n�meros com um espa�o entre eles. � pedido que
 * deixe uma linha em branco ap�s cada caso.
 */
public class Main {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		int count = 0;
		while (scan.hasNextInt()) {
			count++;
			final int amount = scan.nextInt();
			final Map<Long, String> map = execute(amount);
			final int c = count;
			map.forEach((key, value) -> {
				System.out.println(String.format("Caso %s: %s numero%s", c, key, (key > 1 ? "s" : "")));
				System.out.println(value);
				System.out.println();
			});
		}
		scan.close();
	}

	public static Map<Long, String> execute(final int amount) {
		long count = 1;
		StringBuilder txt = new StringBuilder("0");
		for (int i = 1; i <= amount; i++) {
			for (int j = 0; j < i; j++) {
				txt.append(" ").append(i);
				count ++;
			}
		}
		return Map.of(count, txt.toString());
	}
}