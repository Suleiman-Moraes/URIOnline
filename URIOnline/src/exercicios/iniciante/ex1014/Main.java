package exercicios.iniciante.ex1014;

import java.util.Formatter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Formatter fmt = new Formatter(System.out);
		double[] num = new double[4];
		String x = leia.nextLine().replaceAll(",", ".");
		String[] vet = x.replaceAll(" ", "#").split("#");
		for (int i = 0; i < vet.length; i++) {
			num[i] = Double.parseDouble(vet[i]);
		}
		x = leia.nextLine().replaceAll(",", ".");
		vet = x.replaceAll(" ", "#").split("#");
		for (int i = 0; i < vet.length; i++) {
			num[i+2] = Double.parseDouble(vet[i]);
		}
		double r = Math.sqrt((Math.pow((num[2] - num[0]), 2) + Math.pow((num[3] - num[1]), 2)));
		fmt.format("%.4f\n", r);
		leia.close();
		fmt.close();
	}
}