package exercicios.iniciante.ex1180;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
//		NumberFormat dec =s new DecimalFormat("#0.0000");
//		Locale.setDefault(Locale.US);
//		StringBuilder tudo = new StringBuilder("");
		Scanner leia = new Scanner(System.in);
		int[]vet = new int[leia.nextInt()];
		int[] menor = {0, Integer.MAX_VALUE};
		
		for (int i = 0; i < vet.length; i++) {
			vet[i] = leia.nextInt();
			if(vet[i] < menor[1]){
				menor[0] = i;
				menor[1] = vet[i];
			}
		}
		leia.close();
		System.out.println("Menor valor: " + menor[1]);
		System.out.println("Posicao: " + menor[0]);
	}
}