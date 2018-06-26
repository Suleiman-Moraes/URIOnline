package exercicios.iniciante.ex1064;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		Locale.setDefault(Locale.US);
		float[] a = new float[6];
		Scanner leia = new Scanner(System.in);
		for (int i = 0; i < a.length; i++) {
			a[i] = leia.nextFloat();
		}
		leia.close();
		
		float soma = 0;
		int cont = 0;
		for (int i = 0; i < a.length; i++) {
			if(a[i] > 0){
				soma += a[i];
				cont ++;
			}
		}
		soma = soma / cont;
		System.out.println(cont + " valores positivos");
		System.out.printf("%.1f\n", soma);
	}
}