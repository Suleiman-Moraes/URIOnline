package exercicios.iniciante.ex1071;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		Locale.setDefault(Locale.US);
		int a, b;
		Scanner leia = new Scanner(System.in);
		a = leia.nextInt();
		b = leia.nextInt();
		leia.close();
		
		int soma = 0;
		if(a < b){
			for (int i = (a + 1); i < b; i++) {
				if(i % 2 != 0){
					soma += i;
				}
			}
		}
		else{
			for (int i = (b + 1); i < a; i++) {
				if(i % 2 != 0){
					soma += i;
				}
			}
		}
		System.out.println(soma);
	}
}