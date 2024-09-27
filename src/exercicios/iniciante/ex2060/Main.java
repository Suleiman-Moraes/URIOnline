package exercicios.iniciante.ex2060;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * beecrowd | 2060 Desafio de Bino Por Thalyson Nepomuceno, UECE BR Brasil
 * 
 * Timelimit: 1 Bino e Cino são colegas inseparáveis. Bino gosta de criar
 * desafios matemáticos para Cino resolver. Desta vez, Bino gerou uma lista de
 * números e perguntou ao Cino quantos números da lista são múltiplos de 2, 3, 4
 * e 5.
 * 
 * Esse desafio pode parecer simples, porém, quando a lista contém muitos
 * números, Cino se confunde e acaba errando alguns cálculos. Para ajudar Cino,
 * faça um programa para resolver o desafio de Bino.
 * 
 * Entrada A primeira linha da entrada consiste em um inteiro N (1 ≤ N ≤1000),
 * representando a quantidade de números na lista de Bino.
 * 
 * A segunda linha contém N inteiros Li (1 ≤ Li ≤ 100), representando os números
 * da lista de Bino.
 * 
 * Saída Imprima a quantidade de números múltiplos de 2, 3, 4 e 5 presentes na
 * lista. Observe a formatação da saída nos exemplos, pois ela deve ser seguida
 * rigorosamente.
 */
public class Main {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		Map<Integer, Integer> map = initMap();
		final int count = scan.nextInt();
		for (int i = 0; i < count; i++) {
			final int value = scan.nextInt();
			execute(map, value);
		}
		StringBuilder builder = new StringBuilder();
		map.forEach((key, value) -> builder.append(value).append(" Multiplo(s) de ").append(key).append("\n"));
		System.out.print(builder);
		scan.close();
	}

	public static Map<Integer, Integer> initMap() {
		Map<Integer, Integer> map = new HashMap<>();
		map.put(2, 0);
		map.put(3, 0);
		map.put(4, 0);
		map.put(5, 0);
		return map;
	}

	public static String execute(Map<Integer, Integer> map, int value) {
		map.keySet().forEach(key -> {
			if(value % key == 0) {
				map.put(key, map.get(key) + 1);
			}
		});
		return map.toString();
	}
}