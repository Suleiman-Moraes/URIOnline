package exercicios.iniciante.ex1021;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner leia = new Scanner(System.in);
		double a = leia.nextDouble();
		
		int[] notas = new int[12];
		
		if(a / 100 > 0) notas[0] = (int) (a/100);
		if(a%100/50 > 0)notas[1] = (int) (a%100/50);
		if(a%100%50/20 > 0) notas[2] = (int) (a%100%50/20);
		if(a%100%50%20/10 > 0) notas[3] = (int) (a%100%50%20/10);
		if(a%100%50%20%10/5 > 0) notas[4] = (int) (a%100%50%20%10/5);
		if(a%100%50%20%10%5/2 > 0) notas[5] = (int) (a%100%50%20%10%5/2);
		if(a%100%50%20%10%5%2/1 > 0) notas[6] = (int) (a%100%50%20%10%5%2/1);
		if(a%100%50%20%10%5%2%1/0.5 > 0) notas[7] = (int) (a%100%50%20%10%5%2%1/0.5);
		if(a%100%50%20%10%5%2%1%0.5/0.25 > 0) notas[8] = (int) (a%100%50%20%10%5%2%1%0.5/0.25);
		if(a%100%50%20%10%5%2%1%0.5%0.25/0.10 > 0) notas[9] = (int) (a%100%50%20%10%5%2%1%0.5%0.25/0.10);
		if(a%100%50%20%10%5%2%1%0.5%0.25%0.10/0.05 > 0) notas[10] = (int) (a%100%50%20%10%5%2%1%0.5%0.25%0.10/0.05);
		if(a%100%50%20%10%5%2%1%0.5%0.25%0.10%0.05/0.01 > 0) notas[11] = (int) (a%100%50%20%10%5%2%1%0.5%0.25%0.10%0.05/0.01);
		
		System.out.println("NOTAS:");
		System.out.println(notas[0] + " nota(s) de R$ 100.00");
		System.out.println(notas[1] + " nota(s) de R$ 50.00");
		System.out.println(notas[2] + " nota(s) de R$ 20.00");
		System.out.println(notas[3] + " nota(s) de R$ 10.00");
		System.out.println(notas[4] + " nota(s) de R$ 5.00");
		System.out.println(notas[5] + " nota(s) de R$ 2.00");
		System.out.println("MOEDAS:");
		System.out.println(notas[6] + " moeda(s) de R$ 1.00");
		System.out.println(notas[7] + " moeda(s) de R$ 0.50");
		System.out.println(notas[8] + " moeda(s) de R$ 0.25");
		System.out.println(notas[9] + " moeda(s) de R$ 0.10");
		System.out.println(notas[10] + " moeda(s) de R$ 0.05");
		System.out.println(notas[11] + " moeda(s) de R$ 0.01");
	}
}