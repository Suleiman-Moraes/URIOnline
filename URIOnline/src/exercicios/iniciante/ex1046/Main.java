package exercicios.iniciante.ex1046;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int a, b;
		Scanner leia = new Scanner(System.in);
		a = leia.nextInt();
		b = leia.nextInt();
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