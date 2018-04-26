package exercicios.ex1047;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int h1, m1, h2, m2;
		Scanner leia = new Scanner(System.in);
		h1 = leia.nextInt();
		m1 = leia.nextInt();
		h2 = leia.nextInt();
		m2 = leia.nextInt();
		leia.close();
		
		int soma = 0;
		
		if(a > b){
			soma = 24 - a + b;
			System.out.println("O JOGO DUROU " + soma + " HORA(S)");
		}else if(a < b){
			soma = b - a;
			System.out.println("O JOGO DUROU " + soma + " HORA(S)");
		}else{
			System.out.println("O JOGO DUROU 24 HORA(S)");
		}
	}
}