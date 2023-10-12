package exercicios.iniciante.ex1973;

import java.io.IOException;
import java.util.Scanner;

/**
 * beecrowd | 1973
 * 
 * Após comprar vários sítios adjacentes na região do oeste catarinense, a
 * família Estrela construiu uma única estrada que passa por todos os sítios em
 * sequência. O primeiro sítio da sequência foi batizado de Estrela 1, o segundo
 * de Estrela 2, e assim por diante. Porém, o irmão que vive em Estrela 1 acabou
 * enlouquecendo e resolveu fazer uma Jornada nas Estrelas para roubar carneiros
 * das propriedades de seus irmãos. Mas ele está definitivamente pirado. Quando
 * passa pelo sítio Estrela i, ele rouba apenas um carneiro daquele sítio (se o
 * sítio tem algum) e segue ou para Estrela i + 1 ou para Estrela i - 1,
 * dependendo se o número de carneiros em Estrela i era, respectivamente, ímpar
 * ou par. Se não existe a Estrela para a qual ele deseja seguir, ele interrompe
 * sua jornada. O irmão louco começa sua Jornada em Estrela 1, roubando um
 * carneiro do seu próprio sítio.
 * 
 * Entrada A primeira linha da entrada consiste de um único inteiro N (1 ≤ N ≤
 * 106), o qual representa o número de Estrelas. A segunda linha da entrada
 * consiste de N inteiros, de modo que o i-ésimo inteiro, Xi (1 ≤ Xi ≤ 106),
 * representa o número inicial de carneiros em Estrela i.
 * 
 * Saída Imprima uma linha contendo dois inteiros, de modo que o primeiro
 * represente o número de Estrelas atacadas pelo irmão louco e o segundo
 * represente o número total de carneiros não roubados.
 */
public class Main {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		final int times = scan.nextInt();
		int[] vet = new int[times];
		long total = 0;
		for (int i = 0; i < vet.length; i++) {
			final int value = scan.nextInt();
			vet[i] = value;
			total += value;
		}
		StringBuilder txt = new StringBuilder();
		txt.append(execute(vet, total)).append("\n");
		System.out.print(txt);
		scan.close();
	}

	public static String execute(int[] vet, long total) {
		int star = 0;
		int[] visited = new int[vet.length];
		long count = 0;
		do {
			visited[star]++;
			if (visited[star] == 1) {
				count++;
			}
			final int i = star;
			if (vet[i] % 2 == 0) {
				star--;
			} else {
				star++;
			}
			if (vet[i] > 0) {
				total--;
				vet[i]--;
			}
		} while (star < vet.length && star >= 0);

		return String.format("%s %s", count, total);
	}
}