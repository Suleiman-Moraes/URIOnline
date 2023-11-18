package exercicios.iniciante.ex1985;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * beecrowd | 1985
 * 
 * O MacPRONALTS est� com uma super promo��o, exclusivo para os competidores da
 * primeira Seletiva do MaratonaTEC. S� que teve um problema, todos os
 * maratonistas foram tentar comprar ao mesmo tempo, com isso gerou uma fila
 * muito grande. O pior � que a mo�a do caixa estava sem calculadora ou um
 * programa para ajud�-la a calcular com maior agilidade, eis que surge voc�
 * para fazer um programa para ajudar a coitada e aumentar a renda do
 * MacPRONALTS. Segue o card�pio do dia contendo o n�mero do produto e seu
 * respectivo valor.
 * 
 * 1001 | R$ 1.50
 * 
 * 1002 | R$ 2.50
 * 
 * 1003 | R$ 3.50
 * 
 * 1004 | R$ 4.50
 * 
 * 1005 | R$ 5.50
 * 
 * Entrada A primeira entrada informada � a quantidade de produtos comprados (1
 * <= p <= 5). Para cada produto segue a quantidade (1 <= q <= 500) que o
 * consumidor comprou.
 * 
 * Obs.: n�o poder�o ser informados n�meros de produtos repetidos.
 * 
 * Sa�da Voc� deve imprimir o valor da compra com duas casas decimais.
 */
public class Main {
	
	private static Double valueTotal;

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		final byte amount = scan.nextByte();
		StringBuilder txt = new StringBuilder();
		Map<Short, Integer> map = new HashMap<>();
		for (int i = 0; i < amount; i++) {
			map.put(scan.nextShort(), scan.nextInt());
		}
		txt.append(execute(map)).append("\n");
		System.out.print(txt);
		scan.close();
	}

	public static String execute(final Map<Short, Integer> map) {
		valueTotal = 0.0;
		StringBuilder txt = new StringBuilder();
		map.forEach((key, value) -> {
			switch (key) {
			case 1001:
				valueTotal += (value * 1.5);
				break;
			case 1002:
				valueTotal += (value * 2.5);
				break;
			case 1003:
				valueTotal += (value * 3.5);
				break;
			case 1004:
				valueTotal += (value * 4.5);
				break;
			default:// 1005
				valueTotal += (value * 5.5);
				break;
			}
		});
		txt.append(String.format("%.2f", valueTotal).replaceFirst(",", "."));
		return txt.toString();
	}
}