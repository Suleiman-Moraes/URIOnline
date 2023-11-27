package exercicios.iniciante.ex2003;

import java.io.IOException;
import java.util.Scanner;

/**
 * Domingo de Manhã | 2003
 * 
 * Domingo é dia de feira. Logo de manhã muitas pessoas se deslocam para o polo
 * de lazer da Parangaba, onde acontece uma feira, conhecida por ser a maior da
 * cidade. Na feira da Parangaba você pode encontrar de tudo.
 * 
 * Todos os domingos, Bino faz compras na feira. Ele sempre marca com seu amigo
 * Cino de se encontrarem no terminal de ônibus da Parangaba às 8h, para irem
 * juntos comprar na feira. Porém, muitas vezes Bino acorda muito tarde e se
 * atrasa para o encontro com seu amigo.
 * 
 * Sabendo que Bino leva de 30 a 60 minutos para chegar ao terminal. Diga o
 * atraso máximo de Bino.
 * 
 * Entrada A entrada consiste em múltiplos casos teste. Cada caso de tese contém
 * uma única linha contendo um horário H (5:00 ≤ H ≤ 9:00) que Bino acordou. A
 * entrada termina com final de arquivo (EOF).
 * 
 * Saída Para cada caso de teste, imprima "Atraso maximo: X" (sem aspas), X
 * indica o atraso maximo (em minutos) de Bino no encontro com Cino.
 */
public class Main {

	private static final String MSG = "Atraso maximo: %s";

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			System.out.println(execute(scan.next()));
		}
		scan.close();
	}

	public static String execute(String wokeUp) {
		final String[] wokeUpVet = wokeUp.split(":");
		final int hour = Integer.valueOf(wokeUpVet[0]);
		final int minute = Integer.valueOf(wokeUpVet[1]);
		if(hour <= 6) {
			return String.format(MSG, 0);
		}
		if(hour == 7) {
			return String.format(MSG, minute);
		}
		else {
			return String.format(MSG, minute + ((hour - 7) * 60));
		}
	}
}