package exercicios.iniciante.ex1010;

import java.util.Formatter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Formatter fmt = new Formatter(System.out);
		String a = leia.nextLine();
		String b = leia.nextLine();
		String[] veta = a.replace(" ", "#").split("#");
		String[] vetb = b.replace(" ", "#").split("#");
		float avet[] = new float[veta.length - 1];
		float bvet[] = new float[vetb.length - 1];
		
		for (int i = 1; i < vetb.length; i++) {
			avet[i - 1] = Float.parseFloat(veta[i]);
			bvet[i - 1] = Float.parseFloat(vetb[i]);
		}
		
		double resultado = (avet[0] * avet[1]) + (bvet[0] * bvet[1]);
		fmt.format("VALOR A PAGAR: R$ %.2f\n", resultado);
		leia.close();
		fmt.close();
	}

}