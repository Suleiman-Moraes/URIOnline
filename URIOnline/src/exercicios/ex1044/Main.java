package exercicios.ex1044;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int a, b;
		Scanner leia = new Scanner(System.in);
		a = leia.nextInt();
		b = leia.nextInt();
		leia.close();
		
		if(b % a == 0 || a % b == 0){
			System.out.println("Sao Multiplos");
		}else{
			System.out.println("Nao sao Multiplos");
		}
	}
}