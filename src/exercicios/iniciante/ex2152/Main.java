package exercicios.iniciante.ex2152;

import java.io.IOException;
import java.util.Scanner;

/**
 * beecrowd | 2152 Pepe, J� Tirei a Vela! Por Ricardo Martins, IFSULDEMINAS BR
 * Brazil
 * 
 * Timelimit: 1 Um dia, o grande her�i Chapolout foi ajudar um cientista, que
 * criou muitas inven��es. Uma destas inven��es � um sistema que abre a porta
 * secreta do laborat�rio. O sistema consiste em retirar uma vela do candelabro
 * do lado da porta, que a mesma se abre, e, ao colocar a vela de volta ao
 * candelabro, a porta se fecha. Por�m, Chapolout descobriu que a vela era s�
 * uma desculpa. Na verdade, o assistente do cientista, chamado Pepe, � que
 * abria a porta do laborat�rio, por dentro. Um tempo depois, o sistema foi
 * modificado, para funcionar igualmente ao projeto inicial. Colocaram um sensor
 * de press�o embaixo da vela do candelabro, de modo que a retirada da vela
 * ativa o sistema. Este sistema emite um relat�rio de log por cada vez que a
 * porta abriu ou fechou, mas o log est� bem confuso. A cada registro, tr�s
 * n�meros inteiros s�o cadastrados, sendo a hora e o minuto que o evento
 * ocorreu e um valor que representa se a porta abriu ou fechou naquele momento.
 * Pepe pede a sua ajuda para converter os dados do log em dados mais leg�veis
 * para ele.
 * 
 * Escreva um programa que, dado um registro de log, este seja convertido em
 * textos mais leg�veis.
 * 
 * Entrada A primeira linha cont�m a quantidade de casos de teste. Cada linha de
 * um caso de teste possui tr�s inteiros H, M e O, sendo a hora, o minuto da
 * ocorr�ncia, e a pr�pria ocorr�ncia (zero se a porta fechou ou um se a porta
 * abriu).
 * 
 * Sa�da Para cada caso de teste, imprima o hor�rio da ocorr�ncia, no devido
 * formato, seguido de um espa�o, um h�fen e um espa�o, e da frase �A porta
 * abriu!� ou �A porta fechou!�, conforme a ocorr�ncia registrada.
 * 
 * 
 */
public class Main {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		StringBuilder builder = new StringBuilder();
		final int count = scan.nextInt();
		for (int i = 0; i < count; i++) {
			builder.append(execute(scan.nextInt(), scan.nextInt(), scan.nextInt())).append("\n");
		}
		System.out.print(builder);
		scan.close();
	}

	protected static String execute(int hour, int minute, int value) {
		StringBuilder builder = new StringBuilder(String.format("%02d:%02d - ", hour, minute));
		if (value == 0) {
			builder.append("A porta fechou!");
		} else {
			builder.append("A porta abriu!");
		}
		return builder.toString();
	}
}