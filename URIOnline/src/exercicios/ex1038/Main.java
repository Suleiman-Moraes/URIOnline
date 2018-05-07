package exercicios.ex1038;

import java.util.Formatter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Formatter fmt = new Formatter(System.out);
		int[] num = new int[2];
		String x = leia.nextLine();
		String[] vet = x.replaceAll(" ", "#").split("#");
		for (int i = 0; i < vet.length; i++) {
			num[i] = Integer.parseInt(vet[i]);
		}
		
		switch (num[0]) {
		case 1:
			fmt.format("Total: R$ %.2f\n", (num[1] * 4.00));
			break;
		case 2:
			fmt.format("Total: R$ %.2f\n", (num[1] * 4.50));
			break;
		case 3:
			fmt.format("Total: R$ %.2f\n", (num[1] * 5.00));
			break;
		case 4:
			fmt.format("Total: R$ %.2f\n", (num[1] * 2.00));
			break;
		case 5:
			fmt.format("Total: R$ %.2f\n", (num[1] * 1.50));
			break;
		}
		
		leia.close();
		fmt.close();
	}
}