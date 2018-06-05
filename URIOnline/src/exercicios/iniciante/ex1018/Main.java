package exercicios.iniciante.ex1018;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int a = leia.nextInt();
		
		int[] notas = new int[7];
		
		if(a / 100 > 0) notas[0] = a/100;
		if(a%100/50 > 0)notas[1] = a%100/50;
		if(a%100%50/20 > 0) notas[2] = a%100%50/20;
		if(a%100%50%20/10 > 0) notas[3] = a%100%50%20/10;
		if(a%100%50%20%10/5 > 0) notas[4] = a%100%50%20%10/5;
		if(a%100%50%20%10%5/2 > 0) notas[5] = a%100%50%20%10%5/2;
		if(a%100%50%20%10%5%2/1 > 0) notas[6] = a%100%50%20%10%5%2/1;
		
		System.out.println(a);
		System.out.println(notas[0] + " nota(s) de R$ 100,00");
		System.out.println(notas[1] + " nota(s) de R$ 50,00");
		System.out.println(notas[2] + " nota(s) de R$ 20,00");
		System.out.println(notas[3] + " nota(s) de R$ 10,00");
		System.out.println(notas[4] + " nota(s) de R$ 5,00");
		System.out.println(notas[5] + " nota(s) de R$ 2,00");
		System.out.println(notas[6] + " nota(s) de R$ 1,00");
		
		leia.close();
	}
}