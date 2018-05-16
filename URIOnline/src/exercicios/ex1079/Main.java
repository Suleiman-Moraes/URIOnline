package exercicios.ex1079;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		public static NumberFormat NF_2DEC2 = new DecimalFormat("#,###.##");
		// Locale.setDefault(Locale.US);
		int a;
		StringBuffer tudo = new StringBuffer();
		Scanner leia = new Scanner(System.in);
		a = leia.nextInt();

		float[] vet = new float[3];
		for (int i = 0; i < 3; i++) {
			vet[i] = leia.nextFloat();
		}	
		float media = vet[0] * 2;
		media += vet[1] * 3;
		media += vet[2] * 5;
		media = media / 10;
		
		tudo.append(media).append("\n");
		
		leia.close();
	}
}