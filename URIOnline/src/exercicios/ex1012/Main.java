package exercicios.ex1012;

import java.util.Formatter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Formatter fmt = new Formatter(System.out);
		String entrada = leia.nextLine();
		String vet[] = entrada.replace(" ", "#").replaceAll(",", ".").split("#");
		double[] veto = new double[vet.length];
		for (int i = 0; i < vet.length; i++) {
			veto[i] = Double.parseDouble(vet[i]);
		}
		double triangulo = (veto[0] * veto[2]) / 2;
		double circulo = Math.pow(veto[2], 2) * 3.14159;
		double trapezio = ((veto[1] + veto[0]) * veto[2]) / 2;
		double quadrado = Math.pow(veto[1], 2);
		double retangulo = veto[0] * veto[1];
		fmt.format("TRIANGULO: %.3f\n", triangulo);
		fmt.format("CIRCULO: %.3f\n", circulo);
		fmt.format("TRAPEZIO: %.3f\n", trapezio);
		fmt.format("QUADRADO: %.3f\n", quadrado);
		fmt.format("RETANGULO: %.3f\n", retangulo);
		leia.close();
		fmt.close();
	}
}