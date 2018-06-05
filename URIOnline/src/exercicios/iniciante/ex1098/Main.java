package exercicios.iniciante.ex1098;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Main {
	public static void main(String[] args) {
		NumberFormat dec = new DecimalFormat("#.#");
//		 Locale.setDefault(Locale.US);
//		StringBuffer tudo = new StringBuffer();
		float i = 0;
		float j = 1;
		do {
			for (int k = 0; k < 3; k++) {
				System.out.println("I=" + dec.format(i) + " J=" + dec.format((j + k)));
			}
			j += 0.2;
			i += 0.2;
		}while (i <= 2.1);
	}
}