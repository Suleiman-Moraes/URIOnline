package exercicios.iniciante.ex2162;

import java.io.IOException;
import java.util.Scanner;

/**
 * beecrowd | 2162 Picos e Vales Por M.C. Pinto, UNILA BR Brazil
 * 
 * Timelimit: 1 Ao observar a paisagem da Nlogônia, o professor MC percebeu que
 * a cada intervalo de 100 metros existe um pico. E que exatamente na metade de
 * dois picos há um vale. Logo, a cada 50 metros há um vale ou um pico e, ao
 * longo da paisagem, não há um pico seguido por outro pico, nem um vale seguido
 * por outro vale.
 * 
 * O professor MC ficou curioso com esse padrão e quer saber se, ao medir outras
 * paisagens, isso se repete. Sua tarefa é, dada uma paisagem, indicar se ela
 * possui esse padrão ou não.
 * 
 * Entrada A entrada é dada em duas linhas. A primeira tem o número N de medidas
 * da paisagem (1 < N ≤ 100). A segunda linha tem N inteiros: a altura Hi de
 * cada medida (-10000 ≤ Hi ≤ 10000, para todo Hi, tal que 1 ≤ i ≤ N). Uma
 * medida é considerada um pico se é maior que a medida anterior. Uma medida é
 * considerada um vale se é menor que a medida anterior.
 * 
 * Saída A saída é dada em uma única linha. Caso a paisagem tenha o mesmo padrão
 * da Nlogônia, deve ser mostrado o número 1. Caso contrário, mostra-se o número
 * 0.
 * 
 * 
 */
public class Main {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		final int times = scan.nextInt();
		int[] heights = new int[times];
		for (int i = 0; i < heights.length; i++) {
			heights[i] = scan.nextInt();
		}
		System.out.println(execute(heights));
		scan.close();
	}

	protected static String execute(int[] heights) {
		if(heights.length <= 1) {
			return "1";
		}
		boolean next = Boolean.FALSE;
		if(heights[0] < heights[1]) {
			next = Boolean.TRUE;
		}
		else if (heights[0] > heights[1]) {
			next = Boolean.FALSE;
		}
		else { 
			return "0";
		}
		for (int i = 2; i < heights.length; i++) {
			if(next && heights[i-1] > heights[i]) {
				next = Boolean.FALSE;
			}
			else if(!next && heights[i-1] < heights[i]) {
				next = Boolean.TRUE;
			}
			else { 
				return "0";
			}
		}
		return "1";
	}
}