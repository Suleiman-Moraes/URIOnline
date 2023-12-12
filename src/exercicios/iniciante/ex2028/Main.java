package exercicios.iniciante.ex2028;

import java.io.IOException;
import java.util.Map;
import java.util.Scanner;

/**
 * beecrowd | 2028 Sequência de Sequência
 * 
 * Hyam é um menino que adora sequências. Ele anda descobrindo sequências
 * interessantes que nem mesmo Fibonacci imaginaria. Certo dia, Hyam percebeu
 * que dado um número N, ele poderia fazer uma sequência do tipo 0 1 2 2 3 3 3 4
 * 4 4 4 ... N N N ... N. No entanto, Hyam percebeu que cada valor que aumentava
 * no número da sequência, a quantidade total de números da sequência aumentava
 * semelhantemente à um crescimento fatorial, neste caso, ao invés de
 * multiplicar, soma-se o número total de números da sequência com o valor do
 * próximo número da sequência. Por exemplo, se N = 2. A sequência correta seria
 * 0 1 2 2, obtendo-se 4 digitos. Agora, se N = 3, o próximo número da sequência
 * tem valor 3, então a quantidade total de número da sequência seria a
 * quantidade de números com N = 2, que é 4, mais o valor do próximo número da
 * sequência, neste caso 3, obtendo-se 7, já que a sequência correta para N = 3
 * é 0 1 2 2 3 3 3.
 * 
 * Sua tarefa é fazer um algoritmo que dado um número inteiro N, tenha como
 * resposta a quantidade total de números dessa sequência e logo abaixo a
 * sequência completa.
 * 
 * Entrada A entrada é composta de vários casos de testes. Cada caso é composto
 * por um inteiro N (0<=N<=200) que indica o valor dos últimos N números da
 * sequência.
 * 
 * A entrada termina com final de arquivo (EOF).
 * 
 * Saída A saida é no formato Caso X: N numeros onde X é a ordem do número de
 * casos e N é a quantidade de numeros que contém na sequência completa, na
 * próxima linha a sequência de números com um espaço entre eles. É pedido que
 * deixe uma linha em branco após cada caso.
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