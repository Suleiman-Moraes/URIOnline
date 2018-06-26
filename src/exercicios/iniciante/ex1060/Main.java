package exercicios.iniciante.ex1060;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		float[] a = new float[6];
		Scanner leia = new Scanner(System.in);
		for (int i = 0; i < a.length; i++) {
			a[i] = leia.nextFloat();
		}
		leia.close();
		
		int cont = 0;
		for (int i = 0; i < a.length; i++) {
			if(a[i] > 0) cont ++;
		}
		System.out.println(cont + " valores positivos");
	}
}