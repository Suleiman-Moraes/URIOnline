package exercicios.ex1072;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		Locale.setDefault(Locale.US);
		int a, vet[];
		Scanner leia = new Scanner(System.in);
		a = leia.nextInt();
		
		vet = new int[a];
		for (int i = 0; i < a; i++) {
			vet[i] = leia.nextInt();
		}
		leia.close();
		
		int in = 0;
		for (int i = 0; i < vet.length; i++) {
			if(vet[i] >= 10 && vet[i] <= 20){
				in ++;
			}
		}
		
		System.out.println(in + " in");
		System.out.println((a - in) + " out");
	}
}