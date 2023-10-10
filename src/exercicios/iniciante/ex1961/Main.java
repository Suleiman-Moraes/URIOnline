package exercicios.iniciante.ex1961;

import java.io.IOException;
import java.util.Scanner;

/**
 * beecrowd | 1961 Pula Sapo
 * 
 * Em cada fase do jogo do Pula Sapo você deve conduzir seu anfíbio através de
 * uma sequência de canos de alturas diferentes até chegar a salvo no cano mais
 * à direita. Entretanto, o sapo só consegue sobreviver se a diferença de altura
 * entre canos consecutivos for de, no máximo, a altura do pulo do sapo. Caso a
 * altura do cano seguinte seja muito alta, o sapo bate no cano e cai. Se a
 * altura do cano seguinte for muito baixa, o sapo não aguenta a queda. O sapo
 * sempre começa em cima do cano mais à esquerda.
 * 
 * Neste jogo, a distância entre os canos é irrelevante, ou seja, o sapo sempre
 * consegue alcançar o próximo cano com um pulo.
 * 
 * 
 * 
 * Você deve escrever um programa que, dadas as alturas dos canos e a altura do
 * pulo do sapo, mostra se a fase do jogo pode ser vencida ou não.
 * 
 * Entrada A entrada é dada em duas linhas. A primeira tem dois inteiros
 * positivos P e N, a altura do pulo do sapo e o número de canos (1 ≤ P ≤ 5 e 2
 * ≤ N ≤ 100). A segunda linha tem N inteiros positivos que indicam as alturas
 * dos canos ordenados da esquerda para a direita. Não há altura maior do que
 * 10.
 * 
 * Saída A saída é dada em uma única linha. Se o sapo pode chegar no cano mais à
 * direita, escreva "YOU WIN". Se o sapo não consegue, escreva "GAME OVER".
 */
public class Main {

	private static final String WIN = "YOU WIN";
	private static final String OVER = "GAME OVER";

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		final byte jumpSize = scan.nextByte();
		final byte amount = scan.nextByte();
		byte[] jumps = new byte[amount];
		for (int i = 0; i < amount; i++) {
			jumps[i] = scan.nextByte();
		}
		System.out.println(execute(jumpSize, jumps));
		scan.close();
	}

	public static String execute(byte jumpSize, byte[] jumps) {
		for (int i = 1; i < jumps.length; i++) {
			if ((jumps[i] - jumps[i - 1]) > jumpSize || (jumps[i - 1] - jumps[i]) > jumpSize) {
				return OVER;
			}
		}
		return WIN;
	}

}